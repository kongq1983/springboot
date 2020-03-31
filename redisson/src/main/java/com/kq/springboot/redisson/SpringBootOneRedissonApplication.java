package com.kq.springboot.redisson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootOneRedissonApplication {

    protected static Logger logger = LoggerFactory.getLogger(SpringBootOneRedissonApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootOneRedissonApplication.class, args);

//        String[] beanNames = context.getBeanDefinitionNames();
//
//        for(String beanName : beanNames) {
//            logger.info("load beanName ={}",beanName);
//        }

        logger.info("load beanNames size ={}",context.getBeanDefinitionCount());

    }

}
