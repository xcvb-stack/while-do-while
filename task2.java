import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int n;

        do {
            n = scan.nextInt();
            if (n > 10) {
                sum += n;
            }
        } while (n % 5 != 0);

        System.out.println(sum);

        scan.close();
    }
}
