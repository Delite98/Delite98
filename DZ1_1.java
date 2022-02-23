package QWER11;

public class DZ1_1 {
    public static void main(String[] args) {
        int x;
        double ds, sum;
        for (x = 1, ds=10, sum=0; x<11; x=x+1, ds=(ds*1.1))
            System.out.println("За день " +x + " пробежал " + ds + " км"); //не совсем то, что хотелось, но выводит количество км по каждому дню:)
        }
    }
