package com.lq.dao;

import com.lq.entity.Sporter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lq on 2018/10/8.
 */
public interface SporterRepository extends JpaRepository<Sporter,String> {

    Sporter findByAccountAndPassword(String account,String password);
}
