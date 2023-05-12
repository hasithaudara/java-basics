package org.example.StringClassExample;

public class StringPoolExample {

    public static void main(String[] args) {

        String name = "john"; // string literal in the String Pool
        String name_2 = "john"; // String literal in the string Pool

        String name_3 = new String("john"); // String Object not in the string pool

        System.out.println(name == name_2); // returns true
        System.out.println(name == name_3); // returns false
        System.out.println(name == name_3.intern()); // returns true

    }
}
