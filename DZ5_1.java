package yjfj;

import java.util.Random;
import java.util.Scanner;
public class DZ5_1 {
public static void main (String [] args) {
    int on;
    int onoff;
    Scanner scan = new Scanner(System.in);
    Computer MyPC = new Computer();
    System.out.println(MyPC.disk
            + " - жесткий диск;  " + MyPC.operativka
            + " - оперативная память; " + MyPC.processor
            + " - процессор; ");
    System.out.println("Введите 0 или 1 для включения компьютера:");
    on = scan.nextInt();
    onoff = MyPC.onoff;
    if (on > 1) {
        System.out.println("Вы ввели число больше 1");
    } else {
    }
    if (on == onoff) {
        System.out.println("Компьютер включен");
    } else {
        System.out.println("Самоуничтожение запущено");
    }
    if (on != onoff) {
        System.out.println("Попробовать снова:");
        on = scan.nextInt();
        System.out.println("Компьютер сгорел");
    }
    System.out.println("Введите 0 или 1 для выключения компьютера:");
    on = scan.nextInt();
    onoff = MyPC.onoff;
    if (on > 1) {
        System.out.println("Вы ввели число больше 1");
    } else {
    }
    if (on == onoff) {
        System.out.println("Выключение компьютера...");
    } else {
        System.out.println("..Самоуничтожение в процессе..");
    }
    if (on != onoff) {
        System.out.println("..спасти ситуацию..");
        on = scan.nextInt();
        System.out.println(".. не вышло.. Компьютер сгорел");
    }
}
}
class Computer{
    int processor;
    int operativka;
    int disk;
    int onoff;

    Computer(){
        processor = 3;
        operativka = 5;
        disk = 6;
    }
    Computer(int onoff) {
        onoff=1;
        Random random = new Random();
        onoff = random.nextInt(1);
    }
}
