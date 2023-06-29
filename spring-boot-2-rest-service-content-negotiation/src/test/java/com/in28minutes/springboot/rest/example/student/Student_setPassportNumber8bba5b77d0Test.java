package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentSetNameTest {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSetName() {
        String name = "John Doe";
        student.setName(name);
        assertEquals(name, student.getName());
    }

    @Test
    public void testSetNameNull() {
        String name = null;
        assertThrows(NullPointerException.class, () -> student.setName(name));
    }
}