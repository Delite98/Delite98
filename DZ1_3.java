package QWER11;

public class DZ1_3 {
    public static void main (String[] args){
        int chislo, sum;
        for (chislo=1, sum=0; chislo<257; chislo*=2, sum=chislo+chislo)
            if (chislo<257){
                sum+=sum;
            }
            System.out.println(sum);
        }
    }
