package com.kolesnikov.jd1.task1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TaskPalindromeTest {

    @Test
    public void isPalindrome() throws Exception {
        TaskPalindrome taskPalindrome = new TaskPalindrome();
        assertTrue(taskPalindrome.isItPalindromeChars("as,:....dsa"));
        assertFalse(taskPalindrome.isItPalindrome("as,:....dsa"));
    }
}