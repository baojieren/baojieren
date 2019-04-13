package ren.baojie.baojieren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("ren.baojie.baojieren.dao")
@ServletComponentScan
public class BaojierenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaojierenApplication.class, args);
    }

}
