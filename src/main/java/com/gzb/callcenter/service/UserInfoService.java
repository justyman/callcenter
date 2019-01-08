package com.gzb.callcenter.service;

import com.gzb.callcenter.Interface.UserRepository;
import com.gzb.callcenter.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.List;

/**
 * @author justyman
 */

public class UserInfoService implements IUserInfoService{

    @Resource
    private UserRepository userRepository;

    @Override
    public void save(User user){
        this.userRepository.save(user);
    }

    @Override
    public List<User> findAll(){
        return (List<User>) this.userRepository.findAll();
    }



}
