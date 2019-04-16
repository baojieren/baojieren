package ren.baojie.baojieren.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ren.baojie.baojieren.model.UserPO;
import ren.baojie.baojieren.service.UserPOService;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/baojie")
public class TestController {

    @Resource
    private UserPOService userPOService;

    @GetMapping("/hello")
    public String test(String name) {
        UserPO userPO = new UserPO();
        userPO.setName(name);
        userPO.setAge(19);
        userPO.setPassword("123123");
        userPOService.insertSelective(userPO);
        return "你输入的：" + name;
    }

}
