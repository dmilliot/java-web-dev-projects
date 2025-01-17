package org.launchcode;

import java.util.Scanner;

public class WordCut {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it. 'and what is the use of" +
                " a book, ' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you want to find/remove.");
        String word = input.next();
        Integer index = alice.indexOf(word);
        Integer length = word.length();

        System.out.println("This word is first found at index" + index + " of the sentence and is " + length + " letters long.");

        String cutSentence = alice.replace(word, "");
        System.out.println(cutSentence);
    }
}
