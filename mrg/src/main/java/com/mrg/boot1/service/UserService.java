package com.mrg.boot1.service;

import com.mrg.boot1.mapper.UserMapper;
import com.mrg.boot1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper usermapper;

    public int save(User user){
        if(user.getId()==null){
           return usermapper.insert(user);
        }
        else {
            return usermapper.updata(user);
        }
    }


}
