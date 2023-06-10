package com.zqi.controller;

import com.zqi.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Period;

@RestController
public class HelloController {

    /*@Value("${name}")
    private String name;

    @Value("${addresses[0]}")
    private String address;

    @Resource
    private Environment environment;

    @Resource
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(name);
        System.out.println(address);
        System.out.println("****************************************************************");
        System.out.println(environment.getProperty("address[0]"));
        System.out.println("******************");
        System.out.println(person);
        String[] addresses = person.getAddresses();
        for (String address : addresses) {
            System.out.println(address);
        }
        return "Hello Spring Boot";
    }*/

}
