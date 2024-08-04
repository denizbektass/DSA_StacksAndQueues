package com.dennis.reverseString;


import com.dennis.popForAStackThatUsesAnArrayList.Stack;

public class Main {
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        String temp = "";
        for (int i = 0; i < s.length() ; i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            temp += stack.pop();
        }
        return temp;
    }
    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }
}
