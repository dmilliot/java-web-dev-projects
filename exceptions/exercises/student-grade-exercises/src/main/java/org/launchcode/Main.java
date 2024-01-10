package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            int result = Divide(10, 2);
            System.out.println("Result: " + result);
//            result = Divide(5,0);
//            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension((studentFiles.get(student)));
                System.out.println(student + " scored " + points + " points.");
            } catch (InvalidFileException e) {
                System.out.println("Error in CheckFileExtension(): " + e.getMessage());
            }
        }
    }
        public static int Divide ( int x, int y){
            try {
                if (y == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                return x / y;
            } catch (ArithmeticException e) {
                System.out.println("Error in Divide(): " + e.getMessage());
                throw e;
            }
        }

        public static int CheckFileExtension (String fileName)  throws InvalidFileException {
            try {
                if (fileName == null || fileName.isEmpty()) {
                    throw new InvalidFileException("File name is null or empty!");
                }
                if (fileName.endsWith(".java")) {
                    return 1;
                } else {
                    return 0;
                }
            } catch (InvalidFileException e) {
                System.out.println("Error in CheckFileExtension(): " + e.getMessage());
                throw e;
            }
        }
    }