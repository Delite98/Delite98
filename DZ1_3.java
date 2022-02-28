package QWER11;

public class DZ1_3 {
    public static void main (String[] args){
        int sum=0;
        for (int chislo=1; chislo<=256; chislo*=2){
            sum+=chislo;
        }
            System.out.println(sum);
        }
    }
