package com.syntax.review7;

public class Practice4 {

    void verifyBatch12IsGoodEnough(boolean isGood){
        if(isGood){
            System.out.println("Yesss!!");
        }else{
            System.out.println("NO!!!!!");
        }
    }

    public static void main(String[] args) {
        Practice4 p=new Practice4();
        p.verifyBatch12IsGoodEnough(false);
    }

}
