package com.gzb.callcenter.service;

import com.gzb.callcenter.dao.User;

import java.util.List;

public interface IUserInfoService {

    public void save(User user);

    public List<User> findAll();
}
