import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = scan.nextInt();
            if (n >= 10 && n <= 99) {
                sum += n / 10 + n % 10;
            }
        } while (n >= 10 && n <= 99);

        System.out.println(sum);

        
    }
}
