public class Main {
    public static void main(String[] args) {
        int number = 11;
        int counter = 0;
        int rem = 0;

        if(number<2) {
            System.out.println("Sayı asal değildir!");
            return;
        }


        for(int i=2;i<number;i++) {
            rem = number%i;
            if(rem == 0) {
                counter++;
            }
        }

        if(counter != 0) {
            System.out.println("Sayı asal değildir!");
        }
        else {
            System.out.println("Sayı asaldır!");
        }
    }
    }
