```java
package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_setNameTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetName_Success() {
        String expectedName = "John";
        student.setName(expectedName);
        assertEquals(expectedName, student.getName());
    }

    @Test
    public void testSetName_Null() {
        student.setName(null);
        assertEquals(null, student.getName());
    }
}