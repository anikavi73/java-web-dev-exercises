package org.launchcode.java.FunWithQuizzes;

import java.util.Scanner;

public class RunFunQuiz {
    public static void main (String [] args){
        String q1 = "Select all the animals that are Car family? \n" + "(a) Cat\n(b) Tiger \n(c) Dog \n";
        String q2 = "What color is Avacado \n (a) Blue \n (b) Orange \n (c) Green \n";
        String q3 = "CRV belongs to Honda car company? \n true/false \n";
        int score = 0;

        CheckBox questionsCheckBox = new CheckBox(q1, "ab");
        MultipleChoice questionsMultipleChoice = new MultipleChoice(q2,"c");
        TrueFalse questionsTrueFalse = new TrueFalse(q3, "true");

        System.out.println(q1);
        Scanner keyboardInput = new Scanner(System.in);
        String input = keyboardInput.nextLine();
        questionsCheckBox.takeQuiz(input);
        score += questionsCheckBox.getScore();
        System.out.println(score);

        System.out.println(q2);
        String input1 = keyboardInput.nextLine();
        questionsMultipleChoice.takeQuiz(input1);
        score += questionsMultipleChoice.getScore();
        System.out.println(score);

        System.out.println(q3);
        String input2 = keyboardInput.nextLine();
        questionsTrueFalse.takeQuiz(input2);
        score += questionsTrueFalse.getScore();
        System.out.println(score);

        System.out.println("Your score for this quiz is " + score);

    }
 }
