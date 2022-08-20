package com.courses.lesson11;

public class Main
{
    public static void main(String[] args)
    {
        Document document = new Document("1234-zxc-4321-qwe-4r5t");
        System.out.println(document.printFirstEightNumbers("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.printOnlyLetters("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.changeLetter("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.printOnlyLettersBuilder("1234-zxc-4321-qwe-4r5t"));


        int[] summa = new int[10];
        int[] sum = new int[summa.length];

        System.out.println(document.executeErrorsContains("1234-abc-4321-qwe-4r5t"));
        System.out.println(document.executeErrorsContains("1234-zxc-4321-qwe-4r5t"));

        System.out.println(document.executeErrorsStart("5555-zxc-4321-qwe-4r5t"));
        System.out.println(document.executeErrorsStart("1234-zxc-4321-qwe-4r5t"));

        System.out.println(document.executeErrorsEnd("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.executeErrorsEnd("1234-zxc-4321-qwe-1a2b"));


    }
}
