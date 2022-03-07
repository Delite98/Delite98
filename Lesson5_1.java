package yjfj;

import javafx.scene.Group;

import java.util.Random;
public class Lesson5_1 {
    public static void main(String[] args) {
        int grade;
        Groop name = new Groop();
        Groop[] array = new Groop[15];
        for (int i = 1; i < array.length; i++) {
            System.out.println(i + " " + name.grou + " " + name.grade);
        }
    }
}

class Groop{
    String n;
    String grou;
    int grade;

    Groop(){
        grou = "QA18";
        Random random =new Random();
        grade=random.nextInt(10)+1;
    }
    Groop (String n){
        grou = n;
    }
    }