package com.lq.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by lq on 2018/10/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WalksServiceTest {

    @Resource
    private WalksService walksService;

    @Test
    public void updateWalks() throws Exception {
        walksService.updateWalks();
    }

}