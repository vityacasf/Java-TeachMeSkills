package com.courses.lesson7.TaskOfFigure;

public class FigureCalculator
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(10);
        figures[1] = new Circle(25);
        figures[2] = new Square(10);
        figures[3] = new Triangle(10,15,25);
        figures[4] = new Square(15);

        Double sumOfAllPerimeters = 0.0;

        for(int i = 0; i < figures.length; i++)
        {
            sumOfAllPerimeters = sumOfAllPerimeters + figures[i].perimeter;
        }

        System.out.println("сумма всех периметров равна: " + sumOfAllPerimeters + " см^2");
    }
}
