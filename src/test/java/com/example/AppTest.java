package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", App.calculateGrade(55));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", App.calculateGrade(40));
    }
}
