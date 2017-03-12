package com.dekhtiarenko.di;

import org.springframework.stereotype.Component;

/**
 * Created by mykola.dekhtiarenko on 13.02.17.
 */
@Component
public class Violin implements Instrument{


    @Override
    public void play() {
        System.out.println("Тудудум Тум Тудудум Тум Тудудум Тум Тум Тудум ");
    }
}
