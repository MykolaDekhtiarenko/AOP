package com.dekhtiarenko;

import org.springframework.stereotype.Component;

/**
 * Created by mykola.dekhtiarenko on 13.02.17.
 */


public class Guitar implements Instrument {


    @Override
    public void play() {
        System.out.println("Бринь! Згоріла моя хата!");
    }
}