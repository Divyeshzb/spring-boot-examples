```java
package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void init() {
        student = new Student();
    }

    @Test
    public void testSetId_PositiveNumber() {
        Long expectedId = 123L;
        student.setId(expectedId);
        assertEquals(expectedId, student.getId(), "The ID set in the student object does not match the expected ID.");
    }

    @Test
    public void testSetId_NegativeNumber() {
        Long expectedId = -123L;
        student.setId(expectedId);
        assertEquals(expectedId, student.getId(), "The ID set in the student object does not match the expected ID.");
    }
}