package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Metju on 2015-10-31.
 */

@RestController
public class UserController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<MyUser> list(){
        log.info("list");
        return userRepository.findAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    public MyUser insert(@RequestParam("login") String login, @RequestParam("password") String password){
        //@RequestBody - can send Object
        MyUser user = new MyUser(login, password);
        MyUser tmp = userRepository.save(user);
        return tmp;
    }

}
