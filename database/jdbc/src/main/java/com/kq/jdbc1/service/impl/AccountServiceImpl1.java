package com.kq.jdbc1.service.impl;

import com.kq.jdbc1.dao.AccountDao;
import com.kq.jdbc1.exception.ZyxtBaseRuntimeException;
import com.kq.jdbc1.service.AccountService;
import com.kq.jdbc1.service.AccountService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AccountServiceImpl
 *
 * @author kq
 * @date 2019-11-08
 */
@Slf4j
@Service
public class AccountServiceImpl1 implements AccountService1 {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    @Override
    public void updateName(Long id, String name) {

        System.out.println("--------------------start AccountServiceImpl11-----------------------");

//        updateName1(1l,"hello");
        accountDao.updateName(1l,"hello");

        System.out.println("--------------------end AccountServiceImpl11-----------------------");

    }



}
