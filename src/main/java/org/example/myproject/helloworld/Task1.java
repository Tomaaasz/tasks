package org.example.myproject.helloworld;

public class Task1 {
    public static void main(String[] args) {
        String s = "Tomek1";

        if (s.length() % 2 == 0) {
            System.out.println(s + " has an even number of characters");
        } else {
            System.out.println("if you added 1 more character to " + s + " it would have an even number of characters");
        }
    }
}