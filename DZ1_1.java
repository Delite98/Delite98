package QWER11;

public class DZ1_1 {
    public static void main(String[] args) {
        int x;
        double ds = 10;
        double sum=0;
        for (x = 1; x<8; x=x+1){
            System.out.println("За день " +x + " пробежал " + ds + " км");
            sum=sum+ds;
            ds=(ds*1.1);
    }
    System.out.println("За день " +x + " пробежал " + ds + " км");

        System.out.println("Всего пробежал за 7 дней:" + sum);
    }
}
