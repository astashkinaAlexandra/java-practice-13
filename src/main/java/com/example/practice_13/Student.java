package com.example.practice_13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String last_name;
    @Value("${student.group}")
    private String group;

    Logger logger = LoggerFactory.getLogger(Student.class);

    @PostConstruct
    public void printStudent() {
        logger.info("post construct");
        System.out.println("Name: " + name + ", last name: " + last_name + ", group: " + group);
    }
}