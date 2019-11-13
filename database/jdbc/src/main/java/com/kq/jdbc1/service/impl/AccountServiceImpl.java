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
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private AccountService1 accountService1;

    @Transactional
    @Override
    public void updateName(Long id, String name) {

        System.out.println("--------------------1-----------------------");


        try {
            updateName1(2l,"name");
        }catch (Exception e){
            log.error("保存报错!",e);
        }

//        updateName1(1l,"hello");
//        accountDao.updateName(1l,"hello");
        accountService1.updateName(1l,"hello");


        System.out.println("--------------------2-----------------------");

    }


    @Transactional
    public void updateName1(Long id, String name) {

        accountDao.updateName(id,name);

//        System.out.println(1 / 0);

        if(id.longValue()>=2){
            throw new ZyxtBaseRuntimeException("10812300","id>=2");
        }
//        accountDao.updateName(id,name);
    }

}
