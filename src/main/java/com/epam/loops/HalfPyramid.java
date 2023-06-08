package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int i = 0; i<cathetusLength;i++){
            int offset = cathetusLength - i -1;
            for(int j = 0; j<offset; j++){
                System.out.print(' ');
            }
            for(int j = 0; j<i+1;j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}