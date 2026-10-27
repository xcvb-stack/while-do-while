import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int dig = -1;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                dig = d;
                break;
            }
            n = n / 10;
        }

        if (dig == -1) {
            System.out.println("NO");
        } else {
            System.out.println(dig);
        }

       
    }
}
