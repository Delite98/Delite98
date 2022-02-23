package QWER11;

public class DZ1_2 {
    public static void main (String[] args) {
        int hour, am;
        for (hour = 0, am = 1; hour <= 24; hour = hour + 3, am = (am * 2)) {
            if (hour > 24) {
                break;
            }
            System.out.println("Час " + hour + ". Количество амеб - " + am);
        }
    }
    }
