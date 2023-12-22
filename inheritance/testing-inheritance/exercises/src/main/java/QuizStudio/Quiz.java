package QuizStudio;

public class Quiz {
    public static void main(String[] args) {
        
    TrueOrFalse tfQuestion1 = new TrueOrFalse("IntelliJ Question", "We use ItelliJ for Java coding", "True", "True", "True", "False");
        tfQuestion1.askQuestion();
        System.out.println(tfQuestion1.checkIfCorrect());
    }
}
