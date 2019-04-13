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
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserPOService userPOService;
    @GetMapping("/t")
    public String test(){
        UserPO userPO = new UserPO();
        userPO.setName("baojie");
        userPO.setAge(19);
        userPO.setPassword("123123");
        userPOService.insertSelective(userPO);
        return "ojbk";
    }

}
