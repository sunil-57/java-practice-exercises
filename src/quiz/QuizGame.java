package quiz;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Question question_1 = new Question("When did i pass out?", 2017,2018,2020,2021,2021);
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(question_1.getTitle());
            System.out.println(question_1.getOption_1());
            System.out.println(question_1.getOption_2());
            System.out.println(question_1.getOption_3());
            System.out.println(question_1.getOption_4());
            System.out.println("choose the answer");
            int answer = scan.nextInt();
            if(question_1.checkAnswer(answer) == true){
                System.out.println("Answer milyo");
            }else{
                System.out.println("Answer milena");
            }
        }
    }
}
