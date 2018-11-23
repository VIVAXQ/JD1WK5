package com.kolesnikov.jd1.task2;

public class TaskRomeArab {

    public int convertRomeToArab(String romeNumber) {
        int[] contentCash = new int[romeNumber.length()];
        int result = 0;
        for (int i = 0; i < romeNumber.length(); i++) {
            switch (romeNumber.charAt(i)) {
                case 'M':
                    contentCash[i] = 1000;
                    break;
                case 'D':
                    contentCash[i] = 500;
                    break;
                case 'C':
                    contentCash[i] = 100;
                    break;
                case 'L':
                    contentCash[i] = 50;
                    break;
                case 'X':
                    contentCash[i] = 10;
                    break;
                case 'V':
                    contentCash[i] = 5;
                    break;
                case 'I':
                    contentCash[i] = 1;
                    break;
                default:
                    return 0000;
                    // я не знаю как делать брейк на функцию в джаве поэтому юзаю по несколько ретёнов
            }
        }
        for (int i = 0; i < romeNumber.length() - 1; i++) {
            if (contentCash[i] < contentCash[i + 1]) {
                contentCash[i] = 0 - contentCash[i];
            }
            result += contentCash[i];
        }
        // проверку на правильность исходника не делал т.к. этого нету в условии задания
        result += contentCash[romeNumber.length() - 1];
        return result;
    }
}
