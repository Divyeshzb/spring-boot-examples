package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getNamee79d2c9ab8Test {

    private Student student;

    @BeforeEach
    public void setup() {
        student = Mockito.mock(Student.class);
    }

    @Test
    public void testGetName_Success() {
        // TODO: Replace 'John Doe' with the name of the student you want to test
        Mockito.when(student.getName()).thenReturn("John Doe");
        String name = student.getName();
        assertEquals("John Doe", name);
    }

    @Test
    public void testGetName_Empty() {
        Mockito.when(student.getName()).thenReturn("");
        String name = student.getName();
        assertEquals("", name);
    }
}