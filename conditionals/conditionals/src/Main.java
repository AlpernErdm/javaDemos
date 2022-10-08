import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
       int not=60;
       if(not>90){
           System.out.println("Tebrikler harf notunuz A");
       } else if (not>80 & not <90) {
           System.out.println("Tebrikler harf notunuz B");

       }
       else if (not>70 & not <80) {
           System.out.println("Tebrikler harf notunuz C");

       }
       else if (not>60 & not <70) {
           System.out.println("Tebrikler harf notunuz D");

       }
       else if (not>50 & not <60) {
           System.out.println("Tebrikler harf notunuz F");

       }
       else {
           System.out.println( "Kaldınız");
       }
    }
}