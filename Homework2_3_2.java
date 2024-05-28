package Homework;

import java.util.Scanner;

public class Homework2_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rows = in.nextInt();
        int columns = in.nextInt();
        int count = 0;
        int[][] playground = new int[rows + 2][columns];
        for (int i = 0; i < playground.length - 2; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                playground[i + 1][j] = in.nextInt();
            }

        }
        for (int i = 1; i < rows + 1; i++) {//判断灯笼上下
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i - 1][j] == 1 || playground[i + 1][j] == 1) {
                    playground[i][j] = 2;
                }

            }


        }
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j] == 0) {
                    count++;
                    playground[i + 1][j] = 3;

                }
            }
        }
        if (count >= num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
