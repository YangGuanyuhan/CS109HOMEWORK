package Homework;

import java.util.Scanner;

public class Homework3_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] island = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                island[i][j] = in.nextInt();

            }

        }
        int start = in.nextInt();
        int k = in.nextInt();
        int startPositionRow = 0;
        int startPositionColumn = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] == start) {
                    startPositionRow = i;
                    startPositionColumn = j;
                }
            }
        }
        int step = 0;
        outerLoop:
        for (int i = 1; i < 10000; i = i + 2) {
            if (startPositionRow < m & (startPositionColumn = startPositionColumn + i) < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                step++;
            }
            if (step == k) {
                break outerLoop;
            }
            if ((startPositionRow = startPositionRow + i) < m & startPositionColumn < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                step++;
            }
            if (step == k) {
                break outerLoop;
            }
            if (startPositionRow < m & (startPositionColumn = startPositionColumn - (i + 1)) < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                step++;
            }
            if (step == k) {
                break outerLoop;
            }
            if
            ((startPositionRow = startPositionRow - (i + 1)) < m & startPositionColumn < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                step++;
            }
            if (step == k) {
                break outerLoop;
            }


        }
        System.out.println(island[startPositionRow][startPositionColumn]);


//        System.out.println();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(island[i][j]+"\t");
//
//            }
//            System.out.println();
//
//        }
//        System.out.println(start);
//        System.out.println(k);
//        System.out.println(startPositionRow);
//        System.out.println(startPositionColumn);

    }
}
