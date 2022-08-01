package com.courses.lesson7.TaskOfFigure;

public class Square extends Figure
{
    private Integer side;

    public Square(Integer side) {
        this.side = side;
        this.perimeter = Double.valueOf(side * 4);
        this.area = Double.valueOf(Math.pow(side, 2));
        printPerimeter();
    }

    public Integer getSide()
    {
        return side;
    }

    public void setSide(Integer side)
    {
        this.side = side;
    }
}
