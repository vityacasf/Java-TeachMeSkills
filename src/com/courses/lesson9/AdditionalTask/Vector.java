package com.courses.lesson9.AdditionalTask;

public class Vector
{
    private Double values[];

    public Vector(Double[] values)
    {
        this.values = values;
    }

    public Double[] getValues()
    {
        return values;
    }

    public void setValues(Double[] values)
    {
        this.values = values;
    }

    public double getLength()
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i] * values[i];
        }
        return Math.sqrt(sum);
    }

    public double countScalarProduct(Vector vector)
    {
        double res = 0;

        for (int i = 0; i < values.length; i++)
        {
            res += values[i] * vector.values[i];
        }
        return res;
    }
}
