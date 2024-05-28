package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = "";
        int[] roomTheory = new int[a];
        int[] roomLab = new int[a];
        int[] roomArt = new int[a];
        int[] classTheory = new int[a];
        int[] classLab = new int[a];
        int[] classArt = new int[a];

        for (int i = 0; i < a; i++) {
            b = in.next();
            String[] parts = b.split(",");
            if (parts[0].equals("R")) {
                if (parts[1].equals("theory")) {
                    roomTheory[i] = Integer.parseInt(parts[2]);
                } else if (parts[1].equals("lab")) {
                    roomLab[i] = Integer.parseInt(parts[2]);

                } else if (parts[1].equals("art")) {
                    roomArt[i] = Integer.parseInt(parts[2]);

                }

            } else {
                if (parts[1].equals("theory")) {
                    classTheory[i] = Integer.parseInt(parts[2]);
                } else if (parts[1].equals("lab")) {
                    classLab[i] = Integer.parseInt(parts[2]);

                } else if (parts[1].equals("art")) {
                    classArt[i] = Integer.parseInt(parts[2]);

                }
            }

        }
        Arrays.sort(roomTheory);
        Arrays.sort(roomLab);
        Arrays.sort(roomArt);
        Arrays.sort(classTheory);
        Arrays.sort(classLab);
        Arrays.sort(classArt);
        int counter = 0;
        for (int i = 0; i < a; i++) {
            if (roomTheory[i] >= classTheory[i] && roomLab[i] >= classLab[i] && roomArt[i] >= classArt[i]) {
                counter++;
            }

        }
        if (counter == a) {
            System.out.println("Yes");
        } else   {
            System.out.println("No");

        }
    }
}

