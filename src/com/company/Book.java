package com.company;

public class Book {
    private String title;
    private String isbn;
    private String price;
    private Author Author;

    public Book(String title, String isbn, String price, String authorName, String authorMail ) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.Author =new Author(authorName,authorMail);
    }

    public String getTitle() {return title; }
    public void setTitle(String title) {  this.title = title;}
    public String getIsbn() {  return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn;}
    public String getPrice() { return price;}
    public String getAuthorName(){ return Author.getName();}
    public String getAuthorMail(){ return Author.getMail();}
    public void setAuthorName(String name){ Author.setName(name);}
    public void setAuthorMail(String mail){  Author.setMail(mail);}


    public void setPrice(String price) {
        this.price = price;
    }



    public String toXml(){
        String author =
                tag("author",tag("name",Author.getName()))+
                        tag("author",tag("mail",Author.getMail()));
        String book =
                tag("book",tag("title",title)+
                        tag("isbn", isbn)+tag("price",price)
                +author);

        return book;
    }
    public String tag(String elem, String content){
        return "<"+elem+">"+content+"</"+elem+">";
    }
}
