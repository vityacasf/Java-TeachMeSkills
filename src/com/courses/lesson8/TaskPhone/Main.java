package com.courses.lesson8.TaskPhone;

public class Main
{
    public static void main(String[] args) {
        Phone iphone = new Phone("1234567", "Iphone11", 123.3);
        Phone xiaomi = new Phone("7654321", "redmi101", 230.4);
        Phone samsung = new Phone("1020304", "X2000", 215.8);

        iphone.receiveCall("Витёк");
        xiaomi.receiveCall("Оля");
        samsung.receiveCall("Ваня");
        iphone.getNumber();
    }
}
