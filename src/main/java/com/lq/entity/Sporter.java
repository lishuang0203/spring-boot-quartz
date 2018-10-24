package com.lq.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lq on 2018/10/8.
 */
@Data
@Entity
@GenericGenerator(name = "sporter-uuid", strategy = "uuid")
public class Sporter {


    @Id
    @GeneratedValue(generator = "sporter-uuid")
    @Column(length = 32)
    private String sporterId;

    private String account;

    private String password;

    private String nickname;

    private String avatar;


    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sporter_id")
    private List<Walks> walksList = new ArrayList<>();


    public Sporter() {

    }


    public Sporter(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public Sporter(String account, String password, String nickname, String avatar, List<Walks> walksList) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.walksList = walksList;
    }
}
