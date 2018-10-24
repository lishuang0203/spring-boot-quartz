package com.lq.dao;

import com.lq.entity.Sporter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lq on 2018/10/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SporterRepositoryTest {


    @Resource
    private SporterRepository sporterRepository;

    @Test
    public void save(){
        Sporter[] sporters = {
                new Sporter("aaa@qq.com","aaa","Lucky","aa.jpg"),
                new Sporter("bbb@qq.com","bbb","Lucky1","bb.jpg"),
                new Sporter("ccc@qq.com","ccc","Lucky2","cc.jpg"),
                new Sporter("ddd@qq.com","ddd","Lucky3","dd.jpg"),
                new Sporter("eee@qq.com","eee","Lucky4","ee.jpg")
        };

        for (Sporter sporter : sporters){
            sporterRepository.save(sporter);
        }
    }

    @Test
    public void findByAccountAndPassword() throws Exception {
        Sporter sporter = sporterRepository.findByAccountAndPassword("aaa@qq.com","aaa");
        System.out.println(sporter);
    }

    @Test
    public void findAll(){
        List<Sporter> list = sporterRepository.findAll();
        System.out.println(list);
    }

}