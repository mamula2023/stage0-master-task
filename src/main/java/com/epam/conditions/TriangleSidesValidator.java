package com.epam.conditions;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean valid  = firstSide + secondSide > thirdSide ? (firstSide + thirdSide > secondSide ? (secondSide+thirdSide > firstSide ? true:false): false) : false;

        if(valid)
            System.out.println("this is a valid triangle");
        else
            System.out.println("it's not a triangle");
    }
}