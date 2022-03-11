package com.syntax.review8;

public class StringClass3 {
    public static void main(String[] args) {
        String batch="Batch 12";
        String course="SDET";

        String company="     Syntax     Tech    ";
        System.out.println(company.trim());

        String name="nasir gopi krishan kashtabai ramakrishnan";
        System.out.println(name.replaceAll(" ",""));

        if("Batch 12".equals(batch) && "SDET".equals(course)){
            System.out.println("You will get the link");
        }else{
            System.out.println("Watch my yt channel");
        }

        if("Batch 12".equalsIgnoreCase(batch)&& "SDET".equalsIgnoreCase(course)){
            System.out.println("accepted");
        }
    }
}
