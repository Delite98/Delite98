package yjfj;

import java.util.Random;
import java.util.Scanner;
public class DZ3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a, j, i;
        int sum = 0;
        System.out.println("Введите размер матрицы:");
        a = scanner.nextInt();
        int[][] arrr = new int[a][a];
        for (i = 0; i < arrr[i].length; i++) {
            for (j = 0; j < arrr.length; j++) {
                arrr[0][j] = random.nextInt(50);
                System.out.print(arrr[0][j] + " ");
            }
            System.out.println("");
        while (i == j) {
            i++;
            sum += arrr[0][j];
            System.out.println("Сумма элементов главной диагонали - " + sum);
        }
    }
    }
}
