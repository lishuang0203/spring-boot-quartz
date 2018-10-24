package com.lq.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lq on 2018/10/8.
 */
@Data
@Entity
public class Walks {


    @Id
    @GeneratedValue
    private Integer id;

    private Integer walkCount;

    private Date createTime;


    public Walks() {

    }


    public Walks(Integer walkCount, Date createTime) {
        this.walkCount = walkCount;
        this.createTime = createTime;
    }
}
