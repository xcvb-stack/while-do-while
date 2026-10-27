import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int n;

        do {
            n = scan.nextInt();
            count++;
        } while (n >= 0);

        System.out.println(count);
        
    }
}
