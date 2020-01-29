package com.company;

public class HotelService {

    private String host[];
    private String user[];

    public void processUserRequest() throws InvalidInputException{
        boolean flag;

        //get host
        String hostname = null;
        flag =true;
        for(int i=0;flag &&i<3;i++){
            showPrompt("Host");
            hostname = getString();
            if(hostname!=null){
                flag =false;
            }
        }
        if(flag){
            throw new InvalidInputException();
        }

        //get username
        String username = null;
        flag =true;
        for(int i=0;flag&&i<3;i++){
            showPrompt("User");
            username = getString();
            if(username !=null){
                flag =false;
            }
        }
        if(flag){
            throw new InvalidInputException();
        }
        postRequest(hostname,username);
    }

    //사용자 입력을 기다리는 method
    private void showPrompt(String str){
        if (str == "Host") {

        }
        if (str == "User") {

        }

    }

    //사용자로부터 문자열을 받는 메소드
    private String getString(){

    }
    //요청 전달
    private void postRequest(String hostname,String username){

    }

}

class InvalidInputException extends Exception {
    InvalidInputException() {
        super("잘못된 입력입니다");
    }
}