package com.dekhtiarenko;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by mykola.dekhtiarenko on 15.02.17.
 */
public class Announcer {

    public void announceMusician(){
        System.out.println("А зараз вам зіграє музикант!");
    }

    public void sayBye(){
        System.out.println("Дякую, можете йти.");
    }


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

    public void announceInstrument(Instrument instrument){
        System.out.println("А зараз вам зіграють на "+instrument.getClass().toString());
    }
}
