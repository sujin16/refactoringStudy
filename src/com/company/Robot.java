package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.StringTokenizer;

public class Robot {
    //Robot name
    private final String name;
    //Robot의 현재 위치
    private final Position position = new Position(0,0);
    //Robot의 방향을 나타내는 단위벡터
    private final Direction direction =new Direction(0,1);

    public Robot(String name) {
        this.name = name;
    }

    public void execute(String commandSequence){
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);
        try {
            while (tokenizer.hasMoreTokens()){
                String token  = tokenizer.nextToken();
                excuteCommand(token);
            }
        }catch (InvalidCommandException e){
            System.out.println("Invalid command :"+e.getMessage());
        }

    }

    public void excuteCommand(String commandString) throws InvalidCommandException{
        Command command = Command.pareCommand(commandString);
        command.execute(this);
    }
    public void forward(){
        position.relativeMove(direction.x,direction.y);
    }
    public void backward(){
        position.relativeMove(-direction.x,-direction.y);
    }
    public void right(){
        position.relativeMove(direction.y,-direction.x);
    }
    public void left(){
        position.relativeMove(-direction.y,direction.x);
    }


    @Override
    public String toString() {
        return "[Robot : " +
                 name  + " " +
                "position(" + position.x +","+position.y +"),"+
                "direction( "+ direction.x +","+direction.y+")"+
                "]";
    }
}
