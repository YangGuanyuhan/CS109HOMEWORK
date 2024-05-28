import java.util.Scanner;

public class Homework1_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            String seven = "";
            long numberten = in.nextLong();
            long numberseven = 0;

            if (numberten == 0) {
                seven = "0";
            } else if (numberten > 0 & numberten <= 7) {
                seven = Long.toString(numberten);
            } else {
                while (numberten > 7) {
                    numberseven = numberten % 7;
                    numberten /= 7;
                    seven = seven + numberseven;
                    seven = numberten + seven;
                }
            }

            System.out.println(seven);


        }


    }
}

