package com.xwing.service;

import com.xwing.pojo.Login;
import com.xwing.pojo.User;

public interface UserService {

    public String getPhoneMessage(String phoneNumber);

    public boolean userLogin(String identifyingCode,String phoneNum,Login loginInfo);

    public User insertUser(User user);

}
