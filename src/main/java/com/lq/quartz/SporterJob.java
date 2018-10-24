package com.lq.quartz;

import com.lq.service.WalksService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by lq on 2018/10/10.
 */
@Component
public class SporterJob {

    @Resource
    private WalksService walksService;

    @Scheduled(cron = "0 55 17 * * ? ")
    public void updateTodayWalks() throws Exception {
        walksService.updateWalks();
    }

}
