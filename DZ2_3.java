package yjfj;

import java.util.Random;
public class DZ2_3 {
    public static void main(String[] args) {
        int mas[] = new int[15];
        int sum=0;
        for (int a = 0; a < mas.length; a++) {
            mas[a] = (int) (Math.random() * 16);
            System.out.print(mas[a] + " ");}
        for(int a =0; a<mas.length;a++){
            int i = mas[a];
            if (i%2==0 && i!=0){
                sum++;
            }
        }
        System.out.println("\n" + sum);
        }
        }