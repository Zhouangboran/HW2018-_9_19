import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int a = asd.nextInt();
        if (a%4!=0) System.out.println(false);
        else if (a%400==0) System.out.println(true);
        else if (a%100==0) System.out.println(false);
        else if (a%4==0) System.out.println(true);
        int b = asd.nextInt();
        if (b%4!=0) System.out.println(false);
        else if (b%400==0) System.out.println(true);
        else if (b%100==0) System.out.println(false);
        else if (b%4==0) System.out.println(true);
        int c = asd.nextInt();
        if (c%4!=0) System.out.println(false);
        else if (c%400==0) System.out.println(true);
        else if (c%100==0) System.out.println(false);
        else if (c%4==0) System.out.println(true);
    }
}
