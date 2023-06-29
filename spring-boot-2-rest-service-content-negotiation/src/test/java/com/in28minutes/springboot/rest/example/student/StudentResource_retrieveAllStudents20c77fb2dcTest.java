package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class StudentResource_retrieveAllStudents20c77fb2dcTest {

    @InjectMocks
    StudentResource studentResource;

    @Mock
    StudentRepository studentRepository;

    @Test
    public void testRetrieveAllStudents() {
        // TODO: change the student names and details as per your requirement
        Student student1 = new Student();
        student1.setName("John");
        student1.setPassportNumber("A1234567");

        Student student2 = new Student();
        student2.setName("Jane");
        student2.setPassportNumber("B1234567");

        List<Student> expectedStudents = Arrays.asList(student1, student2);

        when(studentRepository.findAll()).thenReturn(expectedStudents);

        List<Student> actualStudents = studentResource.retrieveAllStudents();

        assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testRetrieveAllStudents_empty() {
        // TODO: change the student names and details as per your requirement
        List<Student> expectedStudents = Arrays.asList();

        when(studentRepository.findAll()).thenReturn(expectedStudents);

        List<Student> actualStudents = studentResource.retrieveAllStudents();

        assertEquals(expectedStudents, actualStudents);
    }
}
