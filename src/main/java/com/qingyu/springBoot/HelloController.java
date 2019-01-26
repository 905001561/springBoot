package com.qingyu.springBoot;

import com.qingyu.springBoot.dao.LocaTempDao;
import com.qingyu.springBoot.domain.LocaTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloController {


    @Autowired
    LocaTempDao locaTempDao;

    @RequestMapping("/hello")
    public String hello(Model m) {
        List<LocaTemp> tempList = locaTempDao.findAll();
        System.out.println("1234569999999999");

        m.addAttribute("tempList",tempList);
        return "hello";
    }


}
