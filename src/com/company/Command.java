package com.company;

import java.util.*;

public abstract class Command {

    public static final  Command FORWARD = new Forward();
    public static final  Command BACKWARD = new Backward();
    public static final  Command TURN_RIGHT = new Right();
    public static final  Command TURN_LEFT = new Left();

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

    //protected : 상속받은 외부 패키지의 클래스에서 접근이 가능하다.
    protected Command(String name) {
        this.name = name;
    }

    public static Command pareCommand(String name) throws InvalidCommandException{
        if (!commandNameMap.containsKey(name)) {
            throw  new InvalidCommandException(name);
        }
        return commandNameMap.get(name);
    }
    public abstract void execute(Robot robot);

    private static  class Forward extends Command{
        public Forward(){
            super("forward`");
        }

        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    }
    private static class Backward extends Command{
        public Backward(){
            super("backward`");
        }

        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    }
    private static class Right extends Command{
        public Right(){
            super("right`");
        }

        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    }
    private static class Left extends Command{
        public Left(){
            super("left`");
        }

        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    }

}
