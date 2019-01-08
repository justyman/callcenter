package com.gzb.callcenter;

import com.gzb.callcenter.Interface.UserRepository;
import com.gzb.callcenter.dao.User;
import com.gzb.callcenter.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2018-08-27
 * @Description the user controller
 * @author justyman
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService service;

    //@RequestMapping(value="/add", method = RequestMethod.POST)
    @RequestMapping(value="/add")
    public void add(@RequestParam(value = "name", required = true) String name){

        User user = new User();
        user.setUserId((int)Math.ceil(Math.random()));
        user.setUserName(name);

        System.out.println("name=" + name);
        service.save(user);
    }

    @RequestMapping("/list")
    public Object List(){
        Iterable<User> users = service.findAll();
        return users;

    }


}
