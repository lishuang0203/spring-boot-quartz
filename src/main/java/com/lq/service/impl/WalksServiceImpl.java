package com.lq.service.impl;

import com.lq.dao.WalksRepository;
import com.lq.entity.Walks;
import com.lq.service.WalksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by lq on 2018/10/10.
 */

@Service
public class WalksServiceImpl implements WalksService {

    @Resource
    private WalksRepository walksRepository;

    @Override
    public void updateWalks() {
        List<Walks> list = walksRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Walks walks = list.get(i);
            walks.setWalkCount(random.nextInt(20000)+20000);
            walks.setCreateTime(new Date());
            walksRepository.saveAndFlush(walks);
        }
    }
}
