package com.courses.lesson7.TaskOfFigure;

public class Circle extends Figure
{
    private Integer radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public Circle(Integer radius)
    {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
        this.perimeter = 2 * Math.PI * radius;
        printPerimeter();
    }

    public Integer getRadius()
    {
        return radius;
    }

    public void setRadius(Integer radius)
    {
        this.radius = radius;
    }


}
