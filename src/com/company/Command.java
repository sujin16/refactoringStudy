package com.company;

import java.util.*;

public class Command {

    public static final  Command FORWARD = new Command("forward");
    public static final  Command BACKWARD = new Command("backward");
    public static final  Command TURN_RIGHT = new Command("right");
    public static final  Command TURN_LEFT = new Command("left");

    private static final Map<String,Command> commandNameMap = new HashMap<String,Command>();

    //초기화 블럭 initialization block. class가 처음 로딩될 때, 한번만 수행된다.
    //class initializarion block
    //모든 생성자에서 공통적으로 수행되어져야 하는 코드가 있는 경우 생성자에 넣지 않고,
    //인스턴스 초기화 블럭에 넣어 두면 코드의 중복을 줄일 수 있어서 좋다.
    static {
        commandNameMap.put(FORWARD.name,FORWARD);
        commandNameMap.put(BACKWARD.name,BACKWARD);
        commandNameMap.put(TURN_RIGHT.name,TURN_RIGHT);
        commandNameMap.put(TURN_LEFT.name,TURN_LEFT);
    }
    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public static Command pareCommand(String name){
        if (!commandNameMap.containsKey(name)) {
            return null;
        }
        return commandNameMap.get(name);
    }


}
