import java.util.Scanner;

public class Homework1_1_ {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberleft = in.nextInt();
    int numberright = in.nextInt();
    int number = numberleft;
    int counter = 0;

    while (number <= numberright) {
        String numberString = Integer.toString(number);
        if (number == 0 || number % 7 == 0 || numberString.contains("7")) {
            counter++;
        }
        number++;
    }

    System.out.println(counter);
}
}
