package com.shuaige.controller;


import com.shuaige.bean.Accounts;
import com.shuaige.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountsController {
    @Autowired
    AccountsService accountsService;

    @RequestMapping("/home")
    public @ResponseBody Accounts home(){
        return accountsService.findById();
    }

    @RequestMapping("/insert")
    public String insert(){
        accountsService.saveAccounts();
        return "home";
    }
}
