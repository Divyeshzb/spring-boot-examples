package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class Student_Student79727d4203Test {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testStudentCreation() {
        assertNotEquals(null, student, "The Student object is unexpectedly null");
    }
}
```

```java
package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class Student_Studentb2349b4fdbTest {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setPassportNumber("E1234567");
    }

    @Test
    public void testStudentCreation() {
        assertNotEquals(null, student, "The Student object is unexpectedly null");
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        Long actualId = student.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }

    @Test
    public void testGetNameSuccess() {
        String expectedName = "John Doe";
        String actualName = student.getName();
        assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }

    @Test
    public void testGetPassportNumberSuccess() {
        String expectedPassportNumber = "E1234567";
        String actualPassportNumber = student.getPassportNumber();
        assertEquals(expectedPassportNumber, actualPassportNumber, "The expected passport number does not match the actual passport number");
    }
}