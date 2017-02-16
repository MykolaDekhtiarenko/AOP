package com.dekhtiarenko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by mykola.dekhtiarenko on 15.02.17.
 */
public class Tester {

    public static void main(String[] args){

       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Musician m = (Musician)context.getBean("musician");
       m.play();
    }

}
