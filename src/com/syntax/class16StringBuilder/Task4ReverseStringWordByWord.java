package com.syntax.class16StringBuilder;

public class Task4ReverseStringWordByWord {
    /*
        How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
     */
    String reverse(String inputString){
       StringBuilder str=new StringBuilder(inputString); //converting String to StringBuilder
        str.reverse();
        return str.toString();



    }
    public static void main(String[] args) {
        String s="Sunday is great";
        Task4ReverseStringWordByWord task4=new Task4ReverseStringWordByWord();
        //System.out.println(task4.reverse(s));
        String[] strArr=s.split(" ");
        //System.out.println(strArr[2]);
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(task4.reverse(strArr[i])+" ");

        }



        
    }

}
