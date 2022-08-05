package com.courses.lesson9;

public class TwoDimensionalVector extends Point implements Lengthen
{
    private Double x;
    private Double y;
    private static final String description = "Этот вектор двуразмерный";
    private Double lengthOfVector;

    public TwoDimensionalVector(Double startX, Double startY, Double endX, Double endY)
    {
        this.setStartX(startX);
        this.setStartY(startY);
        this.setEndX(endX);
        this.setEndY(endY);
        x = endX - startX;
        y = endY - startY;
    }

    public TwoDimensionalVector(Double x, Double y)
    {
        System.out.println("Новый вектор: {" + x + ",  " + y + "}");;
    }

    public Double getLengthOfVector()
    {
        return lengthOfVector;
    }

    public void setLengthOfVector(Double lengthOfVector)
    {
        this.lengthOfVector = lengthOfVector;
    }

    public Double getX()
    {
        return x;
    }

    public void setX(Double x)
    {
        this.x = x;
    }

    public Double getY()
    {
        return y;
    }

    public void setY(Double y)
    {
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

    public Double comparisonVector(TwoDimensionalVector firstVector, TwoDimensionalVector secondVector)
    {
        if (secondVector.lengthOfVector > firstVector.lengthOfVector)
        {
            System.out.println("Длина второго вектора больше первого");
        }
        else if (secondVector.lengthOfVector == firstVector.lengthOfVector)
        {
            System.out.println("Длины векторов равны");
        }
        else
        {
            System.out.println("Длина первого вектора больше второго");
        }
        return null;
    }

    public String getInfo()
    {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", Длина вектора=" + lengthOfVector +
                ". Описание: " + description + '}';
    }

    public static TwoDimensionalVector[] createMassiveOfVectors(Integer N)
    {
        TwoDimensionalVector[] vectors = new TwoDimensionalVector[N];
        for (int i = 0; i < N; i++)
        {
            vectors[i] = new TwoDimensionalVector( Math.random() * 10,  Math.random() * 10);
        }
        return vectors;
    }

}
