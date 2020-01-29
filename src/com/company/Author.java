package com.company;

public class Author {
    private String name;
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Author(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}


/*
읽기 전용 Author
Author class는 ImmutableAuthor를 구현한다.
public Author implements ImmutatbleAuthor{

}
 */