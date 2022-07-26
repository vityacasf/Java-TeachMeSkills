package com.courses.lesson6;

import java.util.Scanner;

public class CreditCard
{
    public Integer accountNumber;
    public Integer balance;
    String nameOfCard;
    public CreditCard(Integer balance, Integer accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public CreditCard()
    {

    }

    public void chooseCard()
    {
        Scanner nameOfCardScanner = new Scanner(System.in);
        System.out.println("Введите название карты с которой хотите взаимодействовать");
        nameOfCard = nameOfCardScanner.toString();
        System.out.println("Переключились на карту " + nameOfCard);
        chooseOperation();
    }

    public void chooseOperation()
    {
        if (nameOfCard == "visa")
        {
            Scanner nameOfOperationForVisaScanner = new Scanner(System.in);
            System.out.println("выберите операцию: начислить или снять с карты деньги");
            String nameOfOperationForVisa = nameOfOperationForVisaScanner.toString();
            if (nameOfOperationForVisa == "начислить")
            {
                addBalance();
            }
            else if (nameOfOperationForVisa == "снять")
            {
                downBalance();
            }
            else
            {
                System.out.println("Неопределённая операция.");
            }
        }
        else if (nameOfCard == "mastercard")
        {
            Scanner nameOfOperationForMastercardScanner = new Scanner(System.in);
            System.out.println("выберите операцию: начислить или снять с карты деньги");
            String nameOfOperationForMastercard = nameOfOperationForMastercardScanner.toString();
            if (nameOfOperationForMastercard == "начислить")
            {
                addBalance();
            }
            else if (nameOfOperationForMastercard == "снять")
            {
                downBalance();
            }
            else
            {
                System.out.println("Неопределённая операция.");
            }
        }
        else if (nameOfCard == "unionPay")
        {
            Scanner nameOfOperationForUnionPayScanner = new Scanner(System.in);
            System.out.println("выберите операцию: начислить или снять с карты деньги");
            String nameOfOperationForUnionPay = nameOfOperationForUnionPayScanner.toString();
            if (nameOfOperationForUnionPay == "начислить")
            {
                addBalance();
            }
            else if (nameOfOperationForUnionPay == "снять")
            {
                downBalance();
            }
            else
            {
                System.out.println("Неопределённая операция.");
            }
        }
        else
        {
            System.out.println("Вы ввели некоректное название");
        }
    }

    public void addBalance()
    {
        this.balance = balance + 100;
    }

    public void downBalance()
    {
        this.balance = balance - 100;
    }

    public Integer getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public Integer getBalance()
    {
        return balance;
    }

    public void setBalance(Integer balance)
    {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }


}
