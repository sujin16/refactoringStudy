package com.company;

public class BookMain {
    public static void main(String[] args) {
        Book refactoring = new Book(
                "Refactoring : improve the design of existing code",
                "ISBN0201485672",
                "$44.95",
                "Martin Fowler",
                "fowler@acm.org"
        );
        Book math = new Book(
                "programmer math",
                "ISBN4797329734",
                "2310",
                "uki",
                "hyuki@hyuki.com"
        );

        System.out.println("refactoring : ");
        System.out.println(refactoring.toXml());
        System.out.println("math : ");
        System.out.println(math.toXml());
    }
}
