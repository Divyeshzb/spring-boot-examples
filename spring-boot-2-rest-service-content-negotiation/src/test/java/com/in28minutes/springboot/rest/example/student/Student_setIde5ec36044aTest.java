```java
package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Student {
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

public class StudentTest {

    @InjectMocks
    Student student;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetIdSuccess() {
        Long expectedId = 123L;
        student.setId(expectedId);
        assertEquals(expectedId, student.getId(), "The set ID should match the expected ID");
    }

    @Test
    public void testSetIdNull() {
        student.setId(null);
        assertEquals(null, student.getId(), "The set ID should be null");
    }
}