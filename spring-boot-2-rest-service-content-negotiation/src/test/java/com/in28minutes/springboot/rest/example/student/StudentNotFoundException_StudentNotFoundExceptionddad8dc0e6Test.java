// Test generated by RoostGPT for test dm-java-example1 using AI Model gpt

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentNotFoundException_StudentNotFoundExceptionddad8dc0e6Test {

    @InjectMocks
    private StudentNotFoundException studentNotFoundException;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStudentNotFoundException_withValidExceptionMessage() {
        // Arrange
        String expectedExceptionMessage = "Student not found";

        // Act
        StudentNotFoundException exception = new StudentNotFoundException(expectedExceptionMessage);

        // Assert
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }

    @Test
    public void testStudentNotFoundException_withEmptyExceptionMessage() {
        // Arrange
        String expectedExceptionMessage = "";

        // Act
        StudentNotFoundException exception = new StudentNotFoundException(expectedExceptionMessage);

        // Assert
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }
}
