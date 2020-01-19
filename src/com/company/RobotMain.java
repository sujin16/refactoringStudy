package com.company;

public class RobotMain {
    public static void main(String args[]){

        // write your code here
        Robot robot =new Robot("Andrew");
        robot.order(Robot.COMMAND_JUMP);
        robot.order(Robot.COMMAND_WALK);
        robot.order(Robot.COMMAND_WALK);

        //robot.order(0); - > symbolic constant을 사용하면 0과 같은 매직넘버를 사용할 수 없다.

    }
}
