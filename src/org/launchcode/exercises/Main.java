package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(3,8));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

    }

    public static int Divide(int x, int y) {
        int studentResult = (x/y);
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero");
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            } return studentResult;
        }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName.contains(".java")){
            return 1;
        } else if
        (fileName == null || fileName == "") {
            try {
                throw new ArithmeticException("Incorrect file type");
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
            return -1;
        } else {
            return 0;
        }
    }
        //return int = # pts student receives for properly submitting file
        //if file ends in .java, they get 1 pt.
        //if not, 0
        //if null/empty string or exception, -1 pts
    }

