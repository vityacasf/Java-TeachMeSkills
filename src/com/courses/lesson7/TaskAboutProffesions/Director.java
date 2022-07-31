package com.courses.lesson7.TaskAboutProffesions;

public class Director implements Workable
{

    @Override
    public String printProfession(String profession) {
        System.out.println("My profession is director");
        return null;
    }
}