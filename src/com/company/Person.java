package com.company;

public class Person {
    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }
    public Person(Label name) {
        this(name,new NuLLabel());
    }
    public void display(){
        name.display();
        mail.display();
    }

    @Override
    public String toString() {
        String result = "[ Person:";

        result+="name=";
        if(name ==null)  result+="\"(none)\"";
        else  result+=name;

        result+="mail=";
        if(mail ==null)  result+="\"(none)\"";
        else  result+=mail;

        result +="]";
        return  result;
    }
}
