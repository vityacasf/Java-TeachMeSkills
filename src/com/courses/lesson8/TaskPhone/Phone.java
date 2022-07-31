package com.courses.lesson8.TaskPhone;

public class Phone
{
    private String number;
    private String model;
    private Double weight;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Double getWeight()
    {
        return weight;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public Phone()
    {

    }

    public Phone(String number, String model, Double weight)
    {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("номер: " + number + " модель: " + model + " масса: " + weight + "g");
    }

    public Phone(String number, String model)
    {

    }

    public void receiveCall(String nameOfCaller)
    {
        System.out.println("Звонит " + nameOfCaller);
    }

    public void receiveCall(String nameOfCaller, String telephoneNumberOfCaller)
    {

    }

    public void sendMessage()
    {

    }
}