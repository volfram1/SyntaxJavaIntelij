package com.syntax.review7;

import java.util.Locale;

public class Practice5 {

    String weekDay(String day){
        day =day.toLowerCase(Locale.ROOT);
        switch(day){
            case"monday":
                return "Lazy day";
            case "tuesday":
                return "productive day";
            case "wednesday":
                return "gloomy day";
            case "thursday":
                return "exciting day";
            case "friday":
                return "no work day";
            default:
                return "no correct";

        }
    }

    public static void main(String[] args) {
        Practice5 p=new Practice5();
        p.weekDay("Tuesday");
    }
}
