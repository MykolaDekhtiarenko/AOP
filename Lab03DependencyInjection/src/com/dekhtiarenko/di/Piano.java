package com.dekhtiarenko.di;

import org.springframework.stereotype.Component;

/**
 * Created by mykola.dekhtiarenko on 13.02.17.
 */
@Component
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Тум Тудум Тудум Тудум Тудум Ту Тум Тудум Тудум Тудум Тудум");
    }
}
