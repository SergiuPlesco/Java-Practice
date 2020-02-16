package JetBrainsAcademy;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.print(n + " ");
            while (true) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.print(n + " ");
                } else {
                    n = (n * 3) + 1;
                    System.out.print(n + " ");
                }
                if (n == 1) {
                    break;
                }
            }
        }
    }
}
