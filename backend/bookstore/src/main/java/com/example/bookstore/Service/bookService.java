package com.example.bookstore.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface bookService {
    public List getallbookdataservice();

    public Integer adminchangedataservice(Integer index, Integer options, String content);

    public Integer admindeletebookservice(Integer bookid);

    public Integer adminaddbookservice(String booktype);

    public Integer addcartservice(Integer bookid,String username);

    public List getusercartdataservice(String username);

    public Integer userdeletecartdataservice(Integer bookid,String username);

    public Integer usercleancartservice(String username);

    public List getusershelfdataservice(String username);

    public List getallorderdataservice();

    public Integer adminaddorderservice(String username, Integer orderid, Integer bookid);

    public Integer admindeleteorderservice(Integer orderid,Integer bookid);

}
