package QWER11;

public class DZ1_7 {
    public static void main(String[] args) {
        int we = 1, sum = 0;
        while (we<100){
            if (we%2==1)
                sum=sum+we;
            we++;}
        System.out.println(sum);
    }
}