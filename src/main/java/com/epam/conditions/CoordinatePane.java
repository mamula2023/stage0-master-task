package com.epam.conditions;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {

        System.out.println(x > 0 ? (y>0 ? "first" : (y<0 ? "fourth" : "zero")):(x<0 ? ( y>0?"second":(y<0?"third":"zero")):"zero"));
    }
}
