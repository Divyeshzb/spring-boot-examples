package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StudentGetNameTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    public void testGetName() {
        String expectedName = "John Doe";
        student.setName(expectedName);
        String actualName = student.getName();
        assertEquals(expectedName, actualName, "The name returned by getName() should match the name set.");
    }

    @Test
    public void testGetNameWhenNameNotSet() {
        String actualName = student.getName();
        assertNull(actualName, "The name should be null if it was not set.");
    }
}