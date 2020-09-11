package org.launchcode.java.FunWithQuizzes;

public class Question {
    private String prompt;
    private String answer;

    public Question(String prompt, String answer){
    this.prompt = prompt;
    this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

}