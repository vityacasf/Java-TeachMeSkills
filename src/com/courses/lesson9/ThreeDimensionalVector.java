package com.courses.lesson9;

public class ThreeDimensionalVector extends Point implements Lengthen
{
    private Double lengthOfVector;
    private Double scalarProductValue;

    public ThreeDimensionalVector(Integer startX, Integer startY, Integer startZ,
                                  Integer endX, Integer endY, Integer endZ)
    {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.endX = endX;
        this.endY = endY;
        this.endZ = endZ;
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

    @Override
    public Double countLengthOfVector()
    {
        lengthOfVector = Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY) +
                (endZ - startZ) * (endZ - startZ));
        return lengthOfVector;
    }
}
