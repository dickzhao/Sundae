package com.xwin.controller;

import com.xwin.common.utils.RetCode;
import com.xwin.common.utils.ReturnResult;
import com.xwin.pojo.User;
import com.xwin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xwin.common.GetPhoneMessage;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    public String sendRandNum;
    private String phone;

    @RequestMapping(value = "/getPhoneMessage/{phoneNumber}",method = RequestMethod.POST)
    public String getPhoneMessage(@PathVariable() String phoneNumber ){
        sendRandNum= GetPhoneMessage.randNum;
        //sendRandNum= userService.getPhoneMessage(phoneNumber);
        phone=phoneNumber;
        return sendRandNum;
    }

    @RequestMapping(value = "/login/{identifyingCode}",method = RequestMethod.POST)
    public ReturnResult userLogin(@PathVariable String identifyingCode){
        Map resultMap = new HashMap<Object, Object>();
        Map resultMap1 = new HashMap<Object, Object>();
        Boolean loginAction=userService.userLogin(identifyingCode,sendRandNum);
        System.out.println(loginAction);

        if(loginAction){
            User user=new User();
            user.setUsername(phone);
            user.setNickname(phone);
            user=userService.insertUser(user);

            return ReturnResult.build(RetCode.SUCCESS,"success",user);
        }else{
            return ReturnResult.build(RetCode.FAIL,"failure",null);
        }
    }


    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("name", "simonsfan");
        return "/index";
    }
}
