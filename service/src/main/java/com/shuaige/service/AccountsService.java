package com.shuaige.service;

import com.shuaige.bean.Accounts;

public interface AccountsService {
    Accounts findById();
    int saveAccounts();
}
