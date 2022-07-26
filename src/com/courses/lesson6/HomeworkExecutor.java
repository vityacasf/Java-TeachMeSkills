package com.courses.lesson6;

public class HomeworkExecutor
{
    public static void main(String[] args)
    {
        CreditCard visa = new CreditCard(1000, 45042121);
        CreditCard mastercard = new CreditCard(100, 12345678);
        CreditCard unionPay = new CreditCard(2000, 87654321);

        System.out.println("visa card: " + visa);
        System.out.println("mastercard card: " + mastercard);
        System.out.println("unionPay: " + unionPay);

        CreditCard creditCard = new CreditCard();
        creditCard.chooseCard();
    }
}
