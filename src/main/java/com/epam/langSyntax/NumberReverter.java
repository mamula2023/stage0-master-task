package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = 0;
        while(number > 0){
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        System.out.println(result);
    }

}
