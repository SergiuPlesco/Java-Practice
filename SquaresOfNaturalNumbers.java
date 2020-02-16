package JetBrainsAcademy;

import java.util.*;

/*
Given integer N. Print all the squares of natural numbers,
not exceeding N, in ascending order.
 */

public class SquaresOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (true) {
            int square = i * i;
            if (square > N) {
                break;
            }
            System.out.println(square);
            i++;
        }
    }
}
