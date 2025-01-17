package QuizStudio;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public abstract class Question {
    private String questionName;
    private String question;
    private List<String> potentialAnswers;

    public Question(String questionName, String question, List<String> potentialAnswers) {
        this.questionName = questionName;
        this.question = question;
        this.potentialAnswers = potentialAnswers;
    }

    public abstract void askQuestion();

    public abstract boolean checkIfCorrect();

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getPotentialAnswers() {
        return potentialAnswers;
    }

    public void setPotentialAnswers(List<String> potentialAnswers) {
        this.potentialAnswers = potentialAnswers;
    }
}
