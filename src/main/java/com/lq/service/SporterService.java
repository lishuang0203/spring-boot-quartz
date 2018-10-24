package com.lq.service;

import com.lq.entity.Sporter;


import java.util.List;

/**
 * Created by lq on 2018/10/8.
 */
public interface SporterService {

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    Sporter login(String account,String password);


    /**
     * 查找所有
     * @return
     */
    List<Sporter> findAll();
}
