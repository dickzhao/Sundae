package com.xwing.controller;

<<<<<<< HEAD:xwin/src/main/java/com/xwin/controller/UserController.java
import com.xwin.common.utils.RetCode;
import com.xwin.common.utils.ReturnResult;
import com.xwin.pojo.Login;
import com.xwin.pojo.User;
import com.xwin.service.PictureService;
import com.xwin.service.UserService;
=======
import com.xwing.common.utils.RetCode;
import com.xwing.common.utils.ReturnResult;
import com.xwing.pojo.Login;
import com.xwing.pojo.User;
import com.xwing.service.UserService;
>>>>>>> e698c7046b852dfb4626344ee8b92960c5888bda:xwing/src/main/java/com/xwing/controller/UserController.java
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
<<<<<<< HEAD:xwin/src/main/java/com/xwin/controller/UserController.java
import org.springframework.web.bind.annotation.*;
import com.xwin.common.GetPhoneMessage;
import org.springframework.web.multipart.MultipartFile;
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xwing.common.GetPhoneMessage;
>>>>>>> e698c7046b852dfb4626344ee8b92960c5888bda:xwing/src/main/java/com/xwing/controller/UserController.java

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@Api("Sundae相关的User Api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PictureService pictureService;

    Login loginInfo=new Login();

    @ApiOperation(value = "发送手机号获取验证码", notes = "发送手机号获取验证码1")
    @ApiImplicitParam(name = "phoneNumber", value = "手机号", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value = "/getPhoneMessage/{phoneNumber}",method = RequestMethod.POST)
    public String getPhoneMessage(@PathVariable() String phoneNumber ){

        loginInfo.setSendRandNum(GetPhoneMessage.randNum);
        //sendRandNum= userService.getPhoneMessage(phoneNumber);
        loginInfo.setPhoneNumber(phoneNumber);
        return loginInfo.getSendRandNum();
    }

    @RequestMapping(value = "/login/{identifyingCode}",method = RequestMethod.POST)
public ReturnResult userLogin(@PathVariable String identifyingCode,String phoneNum){
        Boolean loginAction=userService.userLogin(identifyingCode,phoneNum,loginInfo);
        System.out.println(loginAction);
        if(loginAction){
            User user=new User();
            user.setUsername(loginInfo.getPhoneNumber());
            user.setNickname(loginInfo.getPhoneNumber());
            user=userService.insertUser(user);
            return ReturnResult.build(RetCode.SUCCESS,"success",user);
        }else{
            return ReturnResult.build(RetCode.FAIL,"failure",null);
        }
    }


    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public ReturnResult updateUser(User user, MultipartFile uploadFile){
        pictureService.uploadPicture(uploadFile);
        return null;
    }
}
