package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_Student79727d4203Test {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }
}

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_Studentb2349b4fdbTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }
}

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getId68eb246cfdTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetId() {
        Long expectedId = 1L;
        student.setId(expectedId);
        assertEquals(expectedId, student.getId());
    }
}

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getNamee79d2c9ab8Test {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetName() {
        String expectedName = "John Doe";
        student.setName(expectedName);
        assertEquals(expectedName, student.getName());
    }
}

package com.in28minutes.springboot.rest.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_setIde5ec36044aTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetId() {
        Long expectedId = 1L;
        student.setId(expectedId);
        assertEquals(expectedId, student.getId());
    }
}