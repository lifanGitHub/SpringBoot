package com.lifan.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;


/**
 * @author by LiFan
 * @date 2018/11/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
        logger.debug("debug");
        logger.info("info");
        logger.error("err");
        logger.error("name {} password {}","Aloha",1024);
    }

}












