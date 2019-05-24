package com.xwin.controller;

import com.xwin.pojo.User;
import com.xwin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xwin.common.GetPhoneMessage;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public String sendRandNum;
    private String phone;

    @RequestMapping(value = "/getPhoneMessage/{phoneNumber}",method = RequestMethod.GET)
    public String getPhoneMessage(@PathVariable() String phoneNumber ){
        sendRandNum= GetPhoneMessage.randNum;
        //sendRandNum= userService.getPhoneMessage(phoneNumber);
        phone=phoneNumber;
        return sendRandNum;
    }

    @RequestMapping(value = "/login/{identifyingCode}",method = RequestMethod.POST)
    public Boolean userLogin(@PathVariable String identifyingCode){

        Boolean loginAction=userService.userLogin(identifyingCode,sendRandNum);
        System.out.println(loginAction);
        if(loginAction){
            User user=new User();
            user.setUsername(phone);
            user.setNickname(phone);
            userService.insertUser(user);
        }
        return loginAction;
    }

}
