package yjfj;

public class DZ2_4 {
    public static void main(String[] args) {
        int a;
        int mas[] = new int[20];
        for (a = 0; a < mas.length; a++) {
            mas[a] = (int) (Math.random() * 21);
            System.out.print(mas[a] + " ");
        }
        System.out.println();
        for (a = 0; a < mas.length; a++) {
            if (a%2!=0){
                mas[a]=0;
            }
            System.out.print(mas[a]+" ");
        }
    }
}
