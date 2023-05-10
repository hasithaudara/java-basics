package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s2.equals(s3)); // false, because s2 and s3 refer to different objects in memory, even though they have the same content

    }
}
