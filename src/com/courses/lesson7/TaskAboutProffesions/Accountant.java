package com.courses.lesson7.TaskAboutProffesions;

public class Accountant implements Workable
{
    @Override
    public String printProfession(String profession)
    {
        System.out.println("my profession is accountant");
        return "accountant";
    }
}