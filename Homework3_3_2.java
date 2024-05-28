package Homework;

import java.util.Scanner;

public class Homework3_3_2 {
    static int m, n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
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
            for (int j = 0; j < i; j++) {
                if (startPositionRow < m & (startPositionColumn = startPositionColumn + 1) < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                    step++;
                }
                if (step == k) {
                    break outerLoop;
                }
            }
            for (int j = 0; j < i; j++) {
                if ((startPositionRow = startPositionRow + 1) < m & startPositionColumn < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                    step++;
                }
                if (step == k) {
                    break outerLoop;
                }
            }
            for (int j = 0; j < i + 1; j++) {
                if (startPositionRow < m & (startPositionColumn = startPositionColumn - 1) < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                    step++;
                }
                if (step == k) {
                    break outerLoop;

                }
            }
            for (int j = 0; j < i + 1; j++) {
                if ((startPositionRow = startPositionRow - 1) < m & startPositionColumn < n & startPositionColumn >= 0 & startPositionRow >= 0) {
                    step++;
                }
                if (step == k) {
                    break outerLoop;

                }
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
//        int direction = 0;
        outerLoop:
        for (int i = 1; i < 10000; i += 2) {
            for (int direction = 0; direction < 4; direction++) {
//                int len = i;
//                if (direction >= 2) {
//                    len = i + 1;
//                }
                int len = (direction >= 2) ? i : i + 1;
                for (int j = 0; j < len; j++) {
                    Point2D res = getNextPos(startPositionRow, startPositionColumn, direction);
                    startPositionRow = res.x;
                    startPositionColumn = res.y;
                    if (checkBound(startPositionRow, startPositionColumn)) {
                        step++;
                    }
                    if (step == k) {
                        break outerLoop;
                    }
                }
            }
        }
    }

    static Point2D getNextPos(int x, int y, int direction) {
        switch (direction) {
            case 0: {
                return new Point2D(x, y + 1);
            }
            case 1: {
                return new Point2D(x + 1, y);
            }
            case 2: {
                return new Point2D(x, y - 1);
            }
            case 3: {
                return new Point2D(x - 1, y);
            }
        }
        return null;
    }

    static class Point2D {
        int x, y;

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean checkBound(int x, int y) {
        return x < m &&
                y < n &&
                y >= 0 &&
                x >= 0;
    }
}
