package com.courses.lesson9;

public class TwoDimensionalVector extends Point implements Lengthen
{
    private Integer x;
    private Integer y;
    private Double lengthOfVector;
    private Double scalarProductValue;

    public TwoDimensionalVector(Integer startX, Integer startY, Integer endX, Integer endY)
    {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        x = endX - startX;
        y = endY - startY;

    }

    public TwoDimensionalVector(Integer x, Integer y)
    {
        System.out.println("Новый вектор {" + x + ",  " + y + "}");;
    }

    public Double getLengthOfVector() {
        return lengthOfVector;
    }

    public void setLengthOfVector(Double lengthOfVector) {
        this.lengthOfVector = lengthOfVector;
    }

    public Double getScalarProductValue() {
        return scalarProductValue;
    }

    public void setScalarProductValue(Double scalarProductValue) {
        this.scalarProductValue = scalarProductValue;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public Double countLengthOfVector()
    {
        lengthOfVector = Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY));
        return lengthOfVector;
    }

    public TwoDimensionalVector addingVector(TwoDimensionalVector secondVector)
    {
        System.out.println("Сложение");
        return new TwoDimensionalVector(getX() + secondVector.getX(), getY() + secondVector.getY());

    }

    public TwoDimensionalVector subtractingVector(TwoDimensionalVector secondVector)
    {
        System.out.println("Вычитание");
        return new TwoDimensionalVector(getX() - secondVector.getX(), getY() - secondVector.getY());
    }

    public TwoDimensionalVector countScalarDimension(TwoDimensionalVector secondVector)
    {
        System.out.println("Скалярное умножение");
        return new TwoDimensionalVector(getX() * secondVector.getX(), getY() * secondVector.getY());
    }
}
