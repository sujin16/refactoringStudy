package com.company;


/*
    Java에서 symbolic constant를 정의하는 방법 : enum, public static final

    public : class 외부에서도 참조 가능하게 하기 위해
    static : class field로 사옹하기 위해
    final : 대입을 잘못하지 않게 하기 위해
 */

public class Robot {
    private final String name;
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");

    /*public static final int COMMAND_WALK =0;
    public static final int COMMAND_STOP= 1;
    public static final int COMMAND_JUMP =2;
*/

    public Robot(String name) {
        this.name = name;
    }

    public void order(RobotCommand command){
        if(command ==COMMAND_WALK){
            System.out.println(name+" walk");
        }else if(command ==COMMAND_STOP){
            System.out.println(name+" stop");
        }else if(command ==COMMAND_JUMP){
            System.out.println(name+" jump");
        }else {
            System.out.println("Command error. command ="+command);
        }

    }

}
