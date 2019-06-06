package com.xwing.controller;

import com.xwing.common.utils.RetCode;
import com.xwing.common.utils.ReturnResult;
import com.xwing.pojo.User;
import com.xwing.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xwing.common.GetPhoneMessage;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@Api("Sundae相关的User Api")
public class UserController {

    @Autowired
    private UserService userService;

    public String sendRandNum;
    private String phone;

    @ApiOperation(value = "发送手机号获取验证码", notes = "发送手机号获取验证码1")
    @ApiImplicitParam(name = "phoneNumber", value = "手机号", paramType = "path", required = true, dataType = "String")
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

}
