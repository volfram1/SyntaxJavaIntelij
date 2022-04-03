package com.syntax.class26Abstraction;

public class Task2 {
    public static void main(String[] args) {
       File file=new JavaFile();
       file.close();
       file.open();
       file.edit();

       File[] files={new JavaFile(), new WordFile(), new PdfFile()};
       files[0].open();
       files[1].edit();
       files[2].close();

        for (int i = 0; i < files.length; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }

}
abstract class File{
     abstract void open();
     void edit(){
         System.out.println("editing the file");
     }
     void close(){
         System.out.println("closing the file");
     }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("use intelij to open java files");
    }
}
class WordFile extends  File{
    @Override
    void open() {
        System.out.println("use microsoft word to open this file");
    }
}
class PdfFile extends  File{
    @Override
    void open() {
        System.out.println("use adobe reader to open the file");
    }
}
