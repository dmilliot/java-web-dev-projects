package QuizStudio;

import java.util.List;
import java.util.Scanner;

public class TrueOrFalse extends Question{

    private String correctAnswer;
    private String answer;

    public TrueOrFalse(String questionName, String question, String correctAnswer, String answer, String... potentialAnswers) {
        super(questionName, question, potentialAnswers);
        this.correctAnswer = correctAnswer;
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void askQuestion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Question: " + this.getQuestion() + "\n" + this.getPotentialAnswers() + "\nEnter your answer below.\n");
        answer = input.next();
    }
    public boolean checkIfCorrect(){
        if (answer.toLowerCase().equals(this.getCorrectAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

}
