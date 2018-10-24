package com.lq.controller;

import com.lq.service.SporterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by lq on 2018/10/9.
 */
@Controller
@RequestMapping(value = "/sporter")
public class SporterController {

    @Resource
    private SporterService sporterService;


    @GetMapping()
    public String  test(){
        return "login";
    }

    @GetMapping(value = "/list")
    public String list(
            @RequestParam("account") String account,
            @RequestParam("password") String password,
            ModelMap map){
        map.addAttribute("person",sporterService.login(account,password));
        map.addAttribute("list",sporterService.findAll());
        return "list";
    }
}
