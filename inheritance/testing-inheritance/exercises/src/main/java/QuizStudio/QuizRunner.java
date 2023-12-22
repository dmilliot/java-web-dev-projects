package QuizStudio;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        //Store questions
        List<String> test = new ArrayList<String>();
        test.add("True");
        test.add("False");
        TrueOrFalse tfQuestion1 = new TrueOrFalse("IntelliJ Question", "We use ItelliJ for Java coding", "True", "True", test);
        tfQuestion1.askQuestion();
        System.out.println(tfQuestion1.checkIfCorrect());
    }
}
