package com.courses.lesson10.MainTask;

public class Main
{
    public static void main(String[] args)
    {
        Document document = new Document("1234-zxc-4321-qwe-4r5t");
        System.out.println(document.printFirstEightNumbers("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.printOnlyLetters("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.checkIncludeString("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.endWith("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.startWith("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.changeLetter("1234-zxc-4321-qwe-4r5t"));
        System.out.println(document.printOnlyLettersBuilder("1234-zxc-4321-qwe-4r5t"));
    }
}
