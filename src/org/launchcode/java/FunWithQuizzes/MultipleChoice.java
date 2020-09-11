package org.launchcode.java.FunWithQuizzes;

import java.util.Scanner;

public class MultipleChoice extends Question{
    private int score;

    public MultipleChoice(String prompt, String answer){

        super(prompt, answer);
        this.score = 0;
    }

    public void takeQuiz(String input){
        if (this.getAnswer().equals(input)){
            this.score = 1;
        }
    }

    public int getScore(){
        return this.score;
    }
}
