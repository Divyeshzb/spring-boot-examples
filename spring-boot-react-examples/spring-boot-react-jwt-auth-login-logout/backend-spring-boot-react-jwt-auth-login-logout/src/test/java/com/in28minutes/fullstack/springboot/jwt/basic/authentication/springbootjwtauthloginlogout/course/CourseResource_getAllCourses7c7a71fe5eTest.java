However, to ensure that the test case is not causing any problems, you could try to simplify it a bit by removing the `@SpringBootTest` annotation, which is not necessary for this kind of unit tests, and by making sure that the `Course` class has a constructor that accepts three arguments. 

Here's the simplified version of your test case:

```java
package com.in28minutes.fullstack.springboot.jwt.basic.authentication.springbootjwtauthloginlogout.course;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CourseResource_getAllCourses7c7a71fe5eTest {

    @InjectMocks
    CourseResource courseResource;

    @Mock
    CourseManagementService courseManagementService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCourses() {
        Course course1 = new Course(1, "Course 1", "Description 1");
        Course course2 = new Course(2, "Course 2", "Description 2");
        List<Course> courses = Arrays.asList(course1, course2);

        when(courseManagementService.findAll()).thenReturn(courses);

        List<Course> result = courseResource.getAllCourses("user1");

        assertEquals(2, result.size());
        assertEquals(course1, result.get(0));
        assertEquals(course2, result.get(1));
    }

    @Test
    public void testGetAllCourses_noCourses() {
        when(courseManagementService.findAll()).thenReturn(Arrays.asList());

        List<Course> result = courseResource.getAllCourses("user1");

        assertEquals(0, result.size());
    }
}