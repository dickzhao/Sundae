package com.xwin.service;

import com.xwin.pojo.User;

public interface UserService {

    public String getPhoneMessage(String phoneNumber);

    public boolean userLogin(String identifyingCode, String sendRandNum);

    public User insertUser(User user);

}
