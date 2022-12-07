package com.example.bookstore.Controller;
import com.example.bookstore.Entity.BookEntity;
import com.example.bookstore.Service.bookService;
import com.example.bookstore.Utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3000)
@RestController
@Controller
public class bookController {

    @Autowired
    private bookService bookservice;

    @RequestMapping("/getallbookdataservice")
    public List getallbookdataservice(){
        return bookservice.getallbookdataservice();
    }

    @RequestMapping("/adminchangedataservice")
    public Integer adminchangedataservice(@RequestParam(name = "index")Integer index, @RequestParam(name = "options")Integer options,@RequestParam(name = "content")String content)
    {
        return bookservice.adminchangedataservice(index,options,content);
    }

    @RequestMapping("admindeletebookservice")
    public Integer admindeletebookservice(@RequestParam(name="bookid")Integer bookid)
    {
        return bookservice.admindeletebookservice(bookid);
    }

    @RequestMapping("adminaddbookservice")
    public Integer adminaddbookservice(@RequestParam(name="booktype")String booktype)
    {
        return bookservice.adminaddbookservice(booktype);
    }

    @RequestMapping("/addcartservice")
    public Integer addcartservice(@RequestParam(name = "bookid")Integer bookid,@RequestParam(name = "username")String username)
    {
        return bookservice.addcartservice(bookid,username);
    }

    @RequestMapping("/getusercartdataservice")
    public List getusercartdataservice(@RequestParam(name = "username")String username)
    {
        return bookservice.getusercartdataservice(username);
    }

    @RequestMapping("/userdeletecartdataservice")
    public Integer userdeletecartdataservice(@RequestParam(name = "bookid")Integer bookid,@RequestParam(name = "username")String username)
    {
        return  bookservice.userdeletecartdataservice(bookid,username);
    }

    @RequestMapping("/usercleancartservice")
    public Integer usercleancartservice(@RequestParam(name = "username")String username)
    {
        return  bookservice.usercleancartservice(username);
    }

    @RequestMapping("/getusershelfdataservice")
    public List getusershelfdataservice(@RequestParam(name = "username")String username)
    {
        return bookservice.getusershelfdataservice(username);
    }

    @RequestMapping("getallorderdataservice")
    public List getallorderdataservice(){return bookservice.getallorderdataservice();}

    @RequestMapping("adminaddorderservice")
    public Integer adminaddorderservice(@RequestParam(name="username")String username,@RequestParam(name="orderid")Integer orderid,@RequestParam(name="bookid")Integer bookid)
    {
        return bookservice.adminaddorderservice(username,orderid,bookid);
    }

    @RequestMapping("admindeleteorderservice")
    public Integer admindeleteorderservice(@RequestParam(name="orderid")Integer orderid,@RequestParam(name="bookid")Integer bookid)
    {
        return bookservice.admindeleteorderservice(orderid,bookid);
    }
}
