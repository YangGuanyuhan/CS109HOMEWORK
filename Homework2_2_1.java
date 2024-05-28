package Homework;

import java.util.Scanner;

public class Homework2_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] table = new int[2000];
        int movieA = in.nextInt();
        for (int i = 0; i < movieA; i++) {
            int code = in.nextInt();
            table[code]++;

        }
        int movieB = in.nextInt();
        for (int i = 0; i < movieB; i++) {
            int code = in.nextInt();
            table[code]++;

        }
        int movieC = in.nextInt();
        for (int i = 0; i < movieC; i++) {
            int code = in.nextInt();
            table[code]++;

        }
        int count=0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 3) {
              count++;
            }


        }
        System.out.println(count);
    }
}
