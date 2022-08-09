package com.courses.lesson9;

public class ThreeDimensionalVector extends Point implements Lengthen
{
    private Double x;
    private Double y;
    private Double z;
    private static final String description = "Этот вектор трехмерный";
    private Double lengthOfVector;

    public ThreeDimensionalVector(Double startX, Double startY, Double startZ,
                                  Double endX, Double endY, Double endZ)
    {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.endX = endX;
        this.endY = endY;
        this.endZ = endZ;
        x = endX - startX;
        y = endY - startY;
        z = endZ - startZ;
    }

    public ThreeDimensionalVector(Double x, Double y, Double z)
    {
        System.out.println("Новый вектор: {" + x + ", " + y + ", " + z + "}");
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

    public Double getZ()
    {
        return z;
    }

    public void setZ(Double z)
    {
        this.z = z;
    }

    @Override
    public Double countLengthOfVector()
    {
        lengthOfVector = Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY) +
                (endZ - startZ) * (endZ - startZ));
        return lengthOfVector;
    }
    public ThreeDimensionalVector addingVector(ThreeDimensionalVector secondVector)
    {
        System.out.println("Сложение");
        return new ThreeDimensionalVector(getX() + secondVector.getX(), getY() + secondVector.getY(),
                getZ() + secondVector.getZ());

    }

    public ThreeDimensionalVector subtractingVector(ThreeDimensionalVector secondVector)
    {
        System.out.println("Вычитание");
        return new ThreeDimensionalVector(getX() - secondVector.getX(), getY() - secondVector.getY(),
                getZ() - secondVector.getZ());
    }

    public ThreeDimensionalVector countScalarDimension(ThreeDimensionalVector secondVector)
    {
        System.out.println("Скалярное умножение");
        return new ThreeDimensionalVector(getX() * secondVector.getX(), getY() * secondVector.getY(),
                getX() * secondVector.getZ());
    }

    public Double comparisonVector(ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector)
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
            ", z=" + z +
            ", Длина вектора=" + lengthOfVector +
            ". Описание: " + description + '}';
    }

    public static ThreeDimensionalVector[] createMassiveOfVectors(Integer N)
    {
        ThreeDimensionalVector[] vectors = new ThreeDimensionalVector[N];
        for (int i = 0; i < N; i++)
        {
            vectors[i] = new ThreeDimensionalVector(Math.random() * 10, Math.random() * 10,
                                                    Math.random() * 10);
        }
        return vectors;
    }
}
