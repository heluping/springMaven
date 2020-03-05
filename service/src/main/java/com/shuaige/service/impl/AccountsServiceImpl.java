package com.shuaige.service.impl;

import com.shuaige.bean.Accounts;
import com.shuaige.dao.AccountsDao;
import com.shuaige.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountsService")
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsDao accountsDao;

    public Accounts findById() {
        return accountsDao.findById(1);
    }

    @Override
    public int saveAccounts() {
        Accounts accounts = new Accounts();
        accounts.setName("最新测试11111");
        accounts.setMoney(100.0);
        int num = accountsDao.saveAccounts(accounts);
        int a = 1/0;
        return num;
    }
}
