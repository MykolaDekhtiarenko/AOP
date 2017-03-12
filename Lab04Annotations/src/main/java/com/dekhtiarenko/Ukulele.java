package com.dekhtiarenko;

import org.springframework.stereotype.Component;

/**
 * Created by mykola.dekhtiarenko on 13.02.17.
 */

@Component
public class Ukulele implements Instrument {

    @Override
    public void play() {
        System.out.println("Бринь! Нема де ночувати!");
    }
}