package org.example;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbersArray = {1, 1, 2, 3, 5, 8};

        for (int i=0; i<numbersArray.length; i++) {
            if (numbersArray[i]%2!=0) {
                System.out.println(numbersArray[i]);
            }
        }

        String phrase = "I would not, could not, in a box." +
                "I would not, could not with a fox." +
                "I will not eat them with a mouse.";
        String[] wordArray = phrase.split(" ");
        System.out.println(Arrays.toString(wordArray));

        String[] sentenceArray = phrase.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
