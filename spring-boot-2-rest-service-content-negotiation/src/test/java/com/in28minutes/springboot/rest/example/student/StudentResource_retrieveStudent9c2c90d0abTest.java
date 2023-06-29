package com.in28minutes.springboot.rest.example.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentResource_retrieveStudent9c2c90d0abTest {

    @InjectMocks
    private StudentResource studentResource;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRetrieveStudent() {
        Student student = new Student(1L, "John", "A1234567");
        when(studentRepository.findById(1L)).thenReturn(Optional.of(student));

        Student result = studentResource.retrieveStudent(1L);

        assertEquals("John", result.getName());
        assertEquals("A1234567", result.getPassportNumber());
    }

    @Test
    public void testRetrieveStudent_notFound() {
        when(studentRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(StudentNotFoundException.class, () -> {
            studentResource.retrieveStudent(1L);
        });
    }
}
