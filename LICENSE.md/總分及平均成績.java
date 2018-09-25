import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int v1 = asd.nextInt();
        int v2 = asd.nextInt();
        int v3 = asd.nextInt();
        int v4 = v1+v2+v3;
        int v5 = v4/3;
        System.out.println(v4);
        System.out.println(v5);
    }
}
