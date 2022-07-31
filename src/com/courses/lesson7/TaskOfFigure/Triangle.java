package com.courses.lesson7.TaskOfFigure;

public class Triangle extends Figure
{
    private Integer firstSide;
    private Integer secondSide;
    private Integer thirdSide;
    private Double halfPerimeter;



    public Triangle(Integer firstSide, Integer secondSide, Integer thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.perimeter = Double.valueOf(firstSide + secondSide + thirdSide);
        this.halfPerimeter = Double.valueOf((firstSide + secondSide + thirdSide)/3);
        this.area = Double.valueOf(Math.sqrt(halfPerimeter *
                                            (halfPerimeter - firstSide) *
                                            (halfPerimeter - secondSide) *
                                            (halfPerimeter - thirdSide)));
        printPerimeter();
    }

    public Integer getFirstSide()
    {
        return firstSide;
    }

    public void setFirstSide(Integer firstSide)
    {
        this.firstSide = firstSide;
    }

    public Integer getSecondSide()
    {
        return secondSide;
    }

    public void setSecondSide(Integer secondSide)
    {
        this.secondSide = secondSide;
    }

    public Integer getThirdSide()
    {
        return thirdSide;
    }

    public void setThirdSide(Integer thirdSide)
    {
        this.thirdSide = thirdSide;
    }

    public Double getHalfPerimeter()
    {
        return halfPerimeter;
    }

    public void setHalfPerimeter(Double halfPerimeter)
    {
        this.halfPerimeter = halfPerimeter;
    }
}
