package com.company;

public class DiceMain {
    public static void main(String args[]){

        Dice dice0 = new Dice();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice[] diceList = {dice0,dice1,dice2};

        dice2.setSeed(456L);
        for(Dice d:diceList){
            for(int i=0;i<10;i++){
                System.out.printf("%d ",d.nextInt());
            }
            System.out.println();
        }

    }

}
