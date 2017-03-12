package com.dekhtiarenko.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by mykola.dekhtiarenko on 13.02.17.
 */
@Component
public class Musician {

    @Autowired
    private Collection<Instrument> instruments;

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void play(){
        if(!instruments.isEmpty()){
            for(Instrument i: instruments){
                i.play();
            }
        }
        else {
            System.out.println("Немає інструментів у музиканта :(");
        }
    }
}
