package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;

public class Dice {
    private final Random random;

    public Dice() {
       this(314159L);
    }
    public Dice(long seed) {
        this.random =new Random(seed);
    }
    public int nextInt(){
        return random.nextInt(6)+1;
    }
    public void setSeed(int seed){ random.setSeed(seed);}
}
