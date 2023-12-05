package org.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class CharacterCount {
    public static void main(String[] args) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        String phrase = "If the product of two terms is zero then" +
                " common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the" +
                " terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side" +
                " of the equation to equal zero. Once you’ve done that," +
                " it’s pretty straightforward from there.";

        char[] phraseCharacters = phrase.toCharArray();
//        System.out.println(phrase);
//        System.out.println(phraseCharacters);

//        for (int i=0; i<phraseCharacters.length; i++) {
//            charMap.merge(phraseCharacters[i], 1, Integer::sum);
//        }
        for (char currentChar : phraseCharacters) {
            charMap.merge(currentChar, 1, Integer::sum);
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
           Character key = entry.getKey();
           Integer value = entry.getValue();
            System.out.println(String.format("%s: %s", key, value));
        }
    }
}
