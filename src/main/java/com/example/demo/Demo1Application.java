package com.example.demo;

import beans.HelloBean;
import beans.SimpleMovieListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Demo1Application {

    public static void main(String[] args) throws  Exception{

//        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("main/resources/spring.xml");

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext fileApplicationCtx = new FileSystemXmlApplicationContext("src/main/resources/spring.xml");

        HelloBean bean = (HelloBean) fileApplicationCtx.getBean("hw");
        SimpleMovieListener simpleMovieListener = (SimpleMovieListener) fileApplicationCtx.getBean("simpleMovieListener");
        simpleMovieListener.makeMovie();
//        cap.close();
    }

}
