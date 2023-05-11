package org.example.StringClassExample;

public class StringExample {

    public static void main(String[] args) {
        StringExample example = new StringExample();
        String answer = example.reversedString("samankumara");
        System.out.println(answer);
    }

    String reversedString(String inputString) {
        String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }
        return reversed;
    }
}
