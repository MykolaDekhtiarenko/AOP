package com.dekhtiarenko.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by mykola.dekhtiarenko on 01.02.17.
 */
public class Tester {

    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/dekhtiarenko/di/beans.xml");
        Musician musician = (Musician)context.getBean("musician");
        musician.play();

    }
}
