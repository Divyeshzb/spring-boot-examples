package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentNotFoundException_StudentNotFoundExceptionddad8dc0e6Test {

    private StudentNotFoundException studentNotFoundException;

    @BeforeEach
    public void setUp() {
        studentNotFoundException = new StudentNotFoundException("Student not found");
    }

    @Test
    public void testMessageInException() {
        assertEquals("Student not found", studentNotFoundException.getMessage());
    }

    @Test
    public void testResponseStatusAnnotation() {
        ResponseStatus annotation = StudentNotFoundException.class.getAnnotation(ResponseStatus.class);
        assertEquals(HttpStatus.NOT_FOUND, annotation.value());
        assertEquals("Student Not Found", annotation.reason());
    }
}