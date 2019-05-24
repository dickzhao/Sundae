package com.xwin.service.serviceImpl;

import com.xwin.common.GetPhoneMessage;
import com.xwin.common.util.DateUtils;
import com.xwin.dao.daoImpl.UserDao;
import com.xwin.pojo.User;
import com.xwin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String getPhoneMessage(String phoneNumber) {

        String sendResult = GetPhoneMessage.getPram(phoneNumber);
        System.out.println(sendResult);
        return GetPhoneMessage.randNum;
    }

    @Override
    public boolean userLogin(String identifyingCode, String sendRandNum) {
        int randNum=Integer.parseInt(sendRandNum);
        int code=Integer.parseInt(identifyingCode);
        System.out.println(randNum+"**"+code);
        if(randNum==code){
            return true;
        }else{
            return false;
        }
    }

    public boolean insertUser(User user){
        user.setLastLoginTime(DateUtils.getFormatStringByDFyyMMddHHmmssSSS(new Date()));
        user.setCreateTime(DateUtils.getFormatStringByDFyyMMddHHmmssSSS(new Date()));
        userDao.save(user);
        return true;
    }
}
