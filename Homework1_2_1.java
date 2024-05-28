import java.util.Arrays;
import java.util.Scanner;

public class Homework1_2_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for (int i = 0; i <times ; i++) {


            long number = in.nextLong();
            String seven = Long.toString(number, 7);
            System.out.println(seven);
        }
    }
}
