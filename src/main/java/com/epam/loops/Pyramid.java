package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int base = cathetusLength*2-1;
        for(int i = 1; i<=cathetusLength; i++){
            int  offset = (base - (i*2-1))/2;
            for(int j = 0; j<offset; j++){
                System.out.print(' ');
            }
            for(int j = i; j>1; j--)
                System.out.print(j);
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}