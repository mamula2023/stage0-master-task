package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch(month){
            case 1:;
            case 3:;
            case 5:;
            case 7:;
            case 8:;
            case 10:;
            case 12:
                System.out.println(31);
                break;
            case 4:;
            case 6:;
            case 9:;
            case 11:
                System.out.println(30);
                break;
            case 2:
                int mod4 = year%4;
                int mod100 = year%100;
                int mod400= year%400;

                if(mod4 == 0){
                    if(mod100 == 0){
                        if(mod400 == 0)
                            System.out.println(29);
                        else System.out.println(28);
                    }else
                        System.out.println(29);
                }
                else
                    System.out.println(28);

                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }
}