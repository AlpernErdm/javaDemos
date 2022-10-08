public class Main {
    public static void main(String[] args) {
       //For
        for(int i=1;i<10;i++)
        {
            System.out.println(i);

        }
        System.out.println("Loop is over");
        for(int i=1;i<10;i+=2)
        {
            System.out.println(i);

        }
        System.out.println("Loop is over");
        for(int i=1;i<25;i+=5)
        {
            System.out.println(i);

        }
        System.out.println("Loop is over ");

        //While loop
        int i =1;
        while (i<10)
        {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Loop is over");

        //do While Loop
        int j=1;
        do  {
            System.out.println(j);
            j+=2;
        }
        while (j<10);
        System.out.println("do  While Loop is over");
    }

    }
