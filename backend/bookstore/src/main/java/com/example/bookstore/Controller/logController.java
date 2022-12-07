package com.example.bookstore.Controller;

import com.example.bookstore.Service.logService;
import com.example.bookstore.Utils.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3000)
@RestController
@Controller
public class logController {

    @Autowired
    private logService logservice;

    @RequestMapping("/checkloginservice")
    public Integer checkloginservice(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password){
        return logservice.checkloginservice(username,password);
    }

    @RequestMapping("/trylogoutservice")
    public boolean trylogoutservice(){
        return logservice.trylogoutservice();
    }

    @RequestMapping("/registerservice")
    public Integer registerservice(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password,@RequestParam(name = "email")String email)
    {
        return logservice.registerservice(username, password,email);
    }

    @RequestMapping("/getalluserdataservice")
    public List getalluserdataservice(){return logservice.getalluserdataservice();}

    @RequestMapping("/adminchangeuserdataservice")
    public Integer adminchangeuserdataservice(@RequestParam(name="id")Integer id,@RequestParam(name="index")Integer index,@RequestParam(name="content")String content){
        return logservice.adminchangeuserdataservice(id,index,content);
    }

    @RequestMapping("admindeleteuserdataservice")
    public Integer admindeleteuserdataservice(@RequestParam(name="id")Integer id){return logservice.admindeleteuserdataservice(id);}
}