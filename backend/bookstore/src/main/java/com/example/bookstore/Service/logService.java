package com.example.bookstore.Service;

import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface logService {
    public Integer checkloginservice(String username,String password);

    public boolean trylogoutservice();

    public Integer registerservice(String username,String password,String email);

    public List getalluserdataservice();

    public Integer adminchangeuserdataservice(Integer id,Integer index,String content);

    public Integer admindeleteuserdataservice(Integer id);
}
