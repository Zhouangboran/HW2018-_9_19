import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int v1 = asd.nextInt();
        Scanner asf = new Scanner(System.in);
        int v2 = asf.nextInt();
        Scanner asg = new Scanner(System.in);
        int v3 = asg.nextInt();
        System.out.println(v3>=v2&&v2>=v1&&v1<=v3);
    }
}
