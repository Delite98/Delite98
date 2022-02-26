package yjfj;

public class DZ2_4 {
    public static void main(String[] args) {
        int mas[] = new int[20];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = (int) ((Math.random() * 20));
            System.out.print(mas[a] + " ");
        }
        System.out.print("\n");
        }
    }