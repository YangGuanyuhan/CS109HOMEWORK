package Homework;

import java.util.Scanner;

public class Homework2_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timesQuestion = in.nextInt();
        int[] scorePerQuestion = new int[timesQuestion];
        for (int i = 0; i < scorePerQuestion.length; i++) {
            scorePerQuestion[i] = in.nextInt();

        }
        int[] qiAnswer = new int[timesQuestion];
        for (int i = 0; i < qiAnswer.length; i++) {
            qiAnswer[i] = in.nextInt();

        }
        int[] competitorAnswer = new int[timesQuestion];
        for (int i = 0; i < competitorAnswer.length; i++) {
            competitorAnswer[i] = in.nextInt();
        }
        double scoresqi = 0;
        double scorecompetitor = 0;
        for (int i = 0; i < timesQuestion; i++) {
            switch (qiAnswer[i]) {
                case 2:
                    scoresqi = (double) scoresqi + scorePerQuestion[i];
                    break;
                case 1:
                    scoresqi = (double) scoresqi - scorePerQuestion[i];
                    break;
                case 0:
                    scoresqi = (double) scoresqi - (double)scorePerQuestion[i] / 2;
                    break;

            }


        }
        for (int i = 0; i < timesQuestion; i++) {
            switch (competitorAnswer[i]) {
                case 2:
                    scorecompetitor = (double) scorecompetitor + scorePerQuestion[i];
                    break;
                case 1:
                    scorecompetitor = (double) scorecompetitor - scorePerQuestion[i];
                    break;
                case 0:
                    scorecompetitor = (double) scorecompetitor - (double)scorePerQuestion[i] / 2;
                    break;

            }


        }
        if(scoresqi>scorecompetitor){
            System.out.println("Qi won");
        }else if(scoresqi<scorecompetitor){
            System.out.println("Qi lost");
        }
        else{
            System.out.println("Qi need another round");
        }
    }
}
