package com.company;

public class Robot2 {
    private final String name;
    public enum Command{
        WALK, STOP, JUMP }

    public Robot2(String name) {
        this.name = name;
    }

    public void order(Robot2.Command command){
        if(command ==Command.WALK){
            System.out.println(name+" walk");
        }else if(command ==Command.STOP){
            System.out.println(name+" stop");
        }else if(command ==Command.JUMP){
            System.out.println(name+" jump");
        }else {
            System.out.println("Command error. command ="+command);
        }

    }

}
