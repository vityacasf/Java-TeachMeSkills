package com.courses.lesson9;

public class VectorCalculator
{
    public static void main(String[] args)
    {
        TwoDimensionalVector firstVector = new TwoDimensionalVector(1,3,4,7);
        TwoDimensionalVector secondVector = new TwoDimensionalVector(1,2,5,5);

        firstVector.countLengthOfVector();
        System.out.println(firstVector.getLengthOfVector());

        secondVector.countLengthOfVector();
        System.out.println(secondVector.getLengthOfVector());


        firstVector.addingVector(secondVector);
        firstVector.countScalarDimension(secondVector);
        firstVector.subtractingVector(secondVector);
    }
}
