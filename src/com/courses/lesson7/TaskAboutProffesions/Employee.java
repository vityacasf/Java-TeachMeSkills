package com.courses.lesson7.TaskAboutProffesions;

public class Employee implements Workable
{
    @Override
    public String printProfession(String profession) {
        System.out.println("My profession is employee");
        return null;
    }
}