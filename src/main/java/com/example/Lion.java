package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;


    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equalsIgnoreCase(sex)) {
            hasMane = true;
        } else if ("Самка".equalsIgnoreCase(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }

        this.feline = feline;
    }

    public int getLionKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
