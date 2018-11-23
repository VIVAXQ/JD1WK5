package com.kolesnikov.jd1.task1;

public class TaskPalindrome {

    public boolean isItPalindromeChars(String stringWeCheck) {
        return stringWeCheck.replaceAll("\\W", "").equalsIgnoreCase(new StringBuilder(stringWeCheck
                .replaceAll("\\W", "")).reverse().toString());
    }

    public boolean isItPalindrome(String stringWeCheck) {
        return stringWeCheck.equalsIgnoreCase(new StringBuilder(stringWeCheck).reverse().toString());
    }
}
