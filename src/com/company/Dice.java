package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Random;

public class Dice extends Random {
    public Dice(){
        super(314159L);
    }
    public Dice(long seed){ super(seed);}

    @Override
    public int nextInt() {
        return nextInt(6) +1; //1 ~ 6 random int
    }

    //의문점 : 상속 거부를 이렇게 많이하는데 random class을 상속 하는 것이 맞는 것인가 ??
    //상속 거부
    @Override
    public void nextBytes(byte[] bytes) {throw  new UnsupportedOperationException(); }
    //상속 거부
    @Override
    public boolean nextBoolean() {
        throw  new UnsupportedOperationException();
    }
    //상속 거부
    @Override
    public float nextFloat() {throw  new UnsupportedOperationException(); }
    //상속 거부
    @Override
    public double nextDouble() { throw  new UnsupportedOperationException();}
    //상속 거부
    @Override
    public synchronized double nextGaussian() {throw  new UnsupportedOperationException(); }
}
