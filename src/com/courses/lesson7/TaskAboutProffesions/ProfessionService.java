package com.courses.lesson7.TaskAboutProffesions;

public class ProfessionService
{
    public static void main(String[] args)
    {
        Workable[] professionService = {new Accountant(), new Director(), new Employee()};

        professionService[0].printProfession("");
        professionService[1].printProfession("");
        professionService[2].printProfession("");
    }


}
