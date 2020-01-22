package com.company;
//테두리를 만들어 문자열을 표시하는 클래스
public class Banner {
    private final String content;
    public Banner(String content) {
        this.content = content;
    }
    public void print(int times){
        //Print Border
        System.out.print("+");
        for(int i=0;i<content.length();i++){
            System.out.print("-");
        }
        System.out.println("+");

        //Print content
        for(int i=0;i<times;i++){
            System.out.println("|" +content+"|");
        }

        //Print Border
        System.out.print("+");
        for(int i=0;i<content.length();i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
