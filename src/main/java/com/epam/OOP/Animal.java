package com.epam.OOP;

public class Animal {
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String aboutColor = "This animal is mostly "+this.color+".";
        String aboutPaws = " It has "+numberOfPaws+" paw";
        if(this.numberOfPaws != 1)
            aboutPaws+="s";
        String aboutFur = " and "+ (hasFur?"a":"no") + " fur.";

        String result = aboutColor + aboutPaws + aboutFur;
        return result;
    }



    private String color;
    private int numberOfPaws;
    private boolean  hasFur;
}
