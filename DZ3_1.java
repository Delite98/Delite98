package yjfj;

import java.util.Scanner;
import java.util.Random;
public class DZ3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int a;
        int sum = 0;
        System.out.println("Введите размер матрицы:");
        a = scan.nextInt();
        int[][] array = new int[a][a];
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[0][j] = random.nextInt(50);
                System.out.print(array[0][j] + " ");
                if (i == j) {
                    sum += array[0][j];}
            }
            System.out.println("");
            System.out.println("Сумма элементов главной диагонали - " + sum);
        }
}
}