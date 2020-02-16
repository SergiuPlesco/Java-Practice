package JavaPractice;

import java.util.Scanner;

/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
(the number is repeated as many times, to what it equals to).
The input to the program is a positive integer n: the number
of the elements of the sequence the program should print.
Output the sequence of numbers, written in a single line,
space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 */
public class TheSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; // count how many times was "print" used
        boolean stop = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {// print i, i times
                System.out.print(i + " ");
                count++;
                if (count == n) { // if "print" used n times break inner loop
                    stop = true;
                    break;
                }
            }
            if (stop) { // break outer loop
                break;
            }
        }
    }
}
