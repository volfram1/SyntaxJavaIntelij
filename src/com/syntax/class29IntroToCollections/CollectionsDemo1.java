package com.syntax.class29IntroToCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name ="Yazgul";
        String name2="Farah";

        String[] names={"Yazgul","andrew"};
        names[1]="Teyfur";
        String[]names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names));

        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList--> name of the class
        // <> --> diamond operator
        // String --> data type
        syntaxStudents.add("Dmitri");
        syntaxStudents.add("Mike");
        syntaxStudents.add("aga");
        System.out.println(syntaxStudents);
    }
}
