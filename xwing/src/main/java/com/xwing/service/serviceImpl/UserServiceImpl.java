package com.xwing.service.serviceImpl;

import com.xwing.common.GetPhoneMessage;
import com.xwing.dao.daoImpl.UserDao;
import com.xwing.pojo.User;
import com.xwing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

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

    public User insertUser(User user){

        user.setLastLoginTime(new Date());
        user.setCreateTime(new Date());
        List<User> userList=userDao.findAll();
        User loginUser=new User();

        for(int i=0;i<userList.size();i++){
            if(!userList.get(i).getUsername().equals(user.getUsername())){
                userDao.save(user);
                loginUser=user;
            }else{
                loginUser=userList.get(i);
            }
        }
        if(userList.size()==0){
            userDao.save(user);
            loginUser=user;
        }
        return loginUser;
    }
}
