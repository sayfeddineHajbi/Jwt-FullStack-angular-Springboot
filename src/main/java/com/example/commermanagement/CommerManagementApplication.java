package com.example.commermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2

@SpringBootApplication
public class CommerManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerManagementApplication.class, args);
    }

}
