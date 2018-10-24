package com.lq.service.impl;

import com.lq.dao.SporterRepository;
import com.lq.entity.Sporter;
import com.lq.service.SporterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lq on 2018/10/8.
 */
@Service
public class SporterServiceImpl implements SporterService {
    @Resource
    private SporterRepository sporterRepository;

    @Override
    public Sporter login(String account, String password) {
        return sporterRepository.findByAccountAndPassword(account,password);
    }

    @Override
    public List<Sporter> findAll() {
        return sporterRepository.findAll();
    }


}
