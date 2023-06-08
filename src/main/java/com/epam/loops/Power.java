package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int starting = 1;
        for(int i = 0; i<power; i++){
            starting *= numberToPrint;
        }
        System.out.println(starting);
    }

    public static void main(String[] args) {

        new Power().printPower(10, 3);
    }
}