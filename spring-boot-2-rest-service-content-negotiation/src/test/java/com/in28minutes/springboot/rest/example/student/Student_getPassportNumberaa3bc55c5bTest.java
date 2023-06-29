package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StudentSetNameTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = Mockito.mock(Student.class);
    }

    @Test
    public void testSetName() {
        String expectedName = "John";
        when(student.getName()).thenReturn(expectedName);
        String actualName = student.getName();
        assertEquals(expectedName, actualName, "The names should match");
    }

    @Test
    public void testSetNameWhenNull() {
        when(student.getName()).thenReturn(null);
        String actualName = student.getName();
        assertEquals(null, actualName, "The name should be null");
    }
}