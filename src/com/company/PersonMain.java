package com.company;

public class PersonMain {
    public static void main(String args[]) {
        Person[] peple = {
                new Person(new Label("Naver"), new Label("tnwls9712@naver.com")),
                new Person(new Label("Google"), new Label("tnwls9712@gmail.com")),
                new Person(new Label("Ajou"))};

        for (Person p : peple) {
            System.out.println(p.toString());
            p.display();
            System.out.println();

        }
    }
}
