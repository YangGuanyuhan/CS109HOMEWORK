package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework3_2_2 {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    int k = in.nextInt();
    int remainder = a.length() % k;
    if (remainder != 0) {
        a = a + " ".repeat(k - remainder);
    }
    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < a.length(); i += k) {
        arr.add(a.substring(i, Math.min(i + k, a.length())));
    }
    ArrayList<String> reverseArr = new ArrayList<>();
    for (int i = 0; i < arr.size(); i++) {
        StringBuilder sbi = new StringBuilder(arr.get(i));
        sbi.reverse();
        reverseArr.add(sbi.toString());
    }
    long num = 0;
    for (int i = 0; i < arr.size(); i++) {
        num = num+Long.parseLong(reverseArr.get(i).trim());
    }
    System.out.println(num);
}
}
