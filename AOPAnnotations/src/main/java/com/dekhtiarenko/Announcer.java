package com.dekhtiarenko;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by mykola.dekhtiarenko on 15.02.17.
 */
@Aspect
@Component
public class Announcer {

    @Pointcut("execution(* com.dekhtiarenko.Musician.play())")
    public void musician(){

    }
//    @Pointcut("execution(* com.dekhtiarenko.Musician.playOnTheInstrument() and args(instrument)))")
//    public void instrument(Instrument instrument){
//
//    }

    @Before("musician()")
    public void announceMusician(){
        System.out.println("А зараз вам зіграє музикант!");
    }

    @After("musician()")
    public void sayBye(){
        System.out.println("Дякую, можете йти.");
    }

    @Around("musician()")
    public void systemInfo(ProceedingJoinPoint joinpoint){
        try{
            System.out.println("---------Виступ почався---------");

            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("---------Виступ закінчився---------");
            System.out.println("Виступ тривав: "+ (end-start));
        }catch(Throwable t){
            System.out.println("В нас сталася помилчка, але не варто турбуватися, наші мавпи-програмісти працюють аби виправити цю помилку!");
        }
    }


    @Before("execution(* com.dekhtiarenko.Musician.playOnTheInstrument(*)) && args(instrument)")
    public void announceInstrument(Instrument instrument){
        System.out.println("А зараз вам зіграють на "+instrument.getClass().toString());
    }
}
