import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int can = n + 1;

        while (true) {
            boolean prime = true;

            if (can < 2) {
                prime = false;
            } else {
                for (int d = 2; d * d <= can; d++) {
                    if (can % d == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                break;
            }
            can++;
        }
        System.out.println(can);


    }
}
