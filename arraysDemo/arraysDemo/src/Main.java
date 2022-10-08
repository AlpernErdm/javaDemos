public class Main {
    public static void main(String[] args) {

        String ogrenci1="alperen";
        String ogrenci2="enes";
        String ogrenci3="talha";
        String ogrenci4="erdem";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("--------------------------------------");

        String [] ogrenciler =new String[4];
        ogrenciler[0]="alperen";
        ogrenciler[1]="enes";
        ogrenciler[2]="talha";
        ogrenciler[3]="erdem";

        for (int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}