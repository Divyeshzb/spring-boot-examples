package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class Student_getId68eb246cfdTest {

    @Mock
    private Student student;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        when(student.getId()).thenReturn(expectedId);
        Long actualId = student.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 2L;
        when(student.getId()).thenReturn(1L);
        Long actualId = student.getId();
        assertNotEquals(unexpectedId, actualId, "The unexpected ID matches the actual ID");
    }
}