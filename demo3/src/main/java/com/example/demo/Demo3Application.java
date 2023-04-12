package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@SpringBootApplication
@Log4j2
@RestController
@RequestMapping("demo")
@RequiredArgsConstructor
public class Demo3Application {

    private final CategoryRepository repo;
    private final RoleRepository roleRepo;

    public static void main(String[] args) {
        log.info("hello >>>>>>>>>>>>>>>");
        SpringApplication.run(Demo3Application.class, args);
    }

    @GetMapping("category/{id}")
    public Category findById(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @GetMapping("role/{id}")
    public Role findRoleById(@PathVariable Integer id) {
        return roleRepo.findById(id).get();
    }
}
