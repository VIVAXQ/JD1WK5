package com.kolesnikov.jd1.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskRomeArabTest {

    @Test
    public void convertRomeToArab() throws Exception {
        assertEquals(3477, new TaskRomeArab().convertRomeToArab("MMMCDLXXVII"));
        // так и не понял как корректнее объявлять класс, как в первом тесте или как в этом
    }
}