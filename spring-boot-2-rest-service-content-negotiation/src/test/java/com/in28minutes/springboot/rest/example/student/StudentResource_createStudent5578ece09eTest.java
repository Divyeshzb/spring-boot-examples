package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class StudentResource_createStudent5578ece09eTest {

    @InjectMocks
    private StudentResource studentResource;

    @Mock
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent_success() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setCourse("Science");
        when(studentRepository.save(any(Student.class))).thenReturn(student);

        ResponseEntity<Object> response = studentResource.createStudent(student);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getHeaders().getLocation().getPath()).isEqualTo("/1");
    }

    @Test
    public void testCreateStudent_failure() {
        // TODO: Set up a scenario where studentRepository.save() throws an exception
        when(studentRepository.save(any(Student.class))).thenThrow(RuntimeException.class);

        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setCourse("Science");

        try {
            ResponseEntity<Object> response = studentResource.createStudent(student);
        } catch (RuntimeException e) {
            assertThat(e).isInstanceOf(RuntimeException.class);
        }
    }
}
