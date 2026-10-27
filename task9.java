import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int min = 10;

        while (n > 0) {
            int d = n % 10;
            if (d != 0 && d < min) {
                min = d;
            }
            n = n / 10;
        }

        System.out.println(min);

        
    }
}
