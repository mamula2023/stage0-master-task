package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider == 0){
            System.out.println("division by zero");
            return;
        }
        int result = dividend / divider;

        int multiple = result * divider;

        System.out.println(multiple == dividend ? "can be divided completely" : "cannot be divided completely");

    }
}