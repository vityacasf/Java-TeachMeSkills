package com.courses.lesson2;

public class Operations
{
    public void adding()
    {
        int b = 10;
        int a = 12;
        System.out.println(a + b);
    }

    public void subtracting()
    {
        int a = 13;
        int b = 10;
        System.out.println(a - b);
    }

    public void division()
    {
        double a = 100;
        double b = 3;
        System.out.printf("%.2f", a / b); //не знаю как выводить с количеством знаков после запятой через println, нашёл через printf
    }

    public void GetResidue()
    {
        long x = 10;
        long y = 13565321;
        System.out.println();//для того чтобы был абзац между числами, так как юзал printf
        System.out.println(x % y);
        System.out.println(y % x);
    }

    public void ExpressionSolution()
    {
        int a = (10 + 10) * 8 / 10 + 7;
        System.out.println(a);
    }

    public void TestLogicalOperators()
    {
        int a = 10;
        System.out.println(3 < a && a  < 12);
        System.out.println(11 < a && a > 10);
        System.out.println(12 < a || a <  23);
        System.out.println(a > 123 || a < 1 || a > 5);
    }
}
