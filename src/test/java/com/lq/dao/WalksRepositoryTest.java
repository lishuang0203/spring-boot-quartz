package com.lq.dao;

import com.lq.entity.Walks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by lq on 2018/10/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WalksRepositoryTest {

    @Resource
    private WalksRepository walksRepository;


    @Test
    public void save(){
        for(int i=0;i<1;i++){
            Random random = new Random();
            Walks walks = new Walks(random.nextInt(20000)+ 20000,new Date());
            walksRepository.save(walks);
        }
    }

    @Test
    public void findAll(){
        List<Walks> list = walksRepository.findAll();
        System.out.println(list);
    }

}