package com.courses.lesson9;

public class VectorCalculator
{
    public static void main(String[] args)
    {
        TwoDimensionalVector firstVector = new TwoDimensionalVector(1.0,3.0,4.0,7.0);
        TwoDimensionalVector secondVector = new TwoDimensionalVector(1.0,2.0,5.0,5.0);

        ThreeDimensionalVector firstThreeDimensionalVector = new ThreeDimensionalVector(1.0,1.0,1.0,
                                                                                        4.0,5.0,6.0);
        ThreeDimensionalVector secondThreeDimensionalVector = new ThreeDimensionalVector(1.0,1.0,1.0,
                                                                                         5.0,6.0,7.0);



        firstVector.countLengthOfVector();
        System.out.println(firstVector.getLengthOfVector());

        secondVector.countLengthOfVector();
        System.out.println(secondVector.getLengthOfVector());

        firstVector.addingVector(secondVector);
        firstVector.countScalarDimension(secondVector);
        firstVector.subtractingVector(secondVector);

        firstThreeDimensionalVector.countLengthOfVector();
        System.out.println(firstThreeDimensionalVector.getLengthOfVector());

        firstThreeDimensionalVector.addingVector(secondThreeDimensionalVector);
        firstThreeDimensionalVector.subtractingVector(secondThreeDimensionalVector);
        firstThreeDimensionalVector.countScalarDimension(secondThreeDimensionalVector);

        System.out.println(firstThreeDimensionalVector.getInfo());
        System.out.println(firstVector.getInfo());

        ThreeDimensionalVector[] threeDimensionalVectors = ThreeDimensionalVector.createMassiveOfVectors(4);
        TwoDimensionalVector[] twoDimensionalVectors = TwoDimensionalVector.createMassiveOfVectors(5);
    }
}
