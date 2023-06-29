However, if the main method of the SpringBootFullStackJwtAuthLoginLogoutApplication class is doing something that affects the Spring context (like manually closing it), it could make the context unavailable for the second test. In this case, you could try to move the invocation of the main method to a @BeforeAll method, so it is executed before the tests, and not in the middle of them:

```java
package com.in28minutes.fullstack.springboot.jwt.basic.authentication.springbootjwtauthloginlogout;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SpringBootFullStackJwtAuthLoginLogoutApplication_main5ccb4e3b4fTest {

    @Autowired
    private ApplicationContext context;

    @BeforeAll
    public static void init() {
        SpringBootFullStackJwtAuthLoginLogoutApplication.main(new String[] {});
    }

    @Test
    public void contextLoads() {
        assertThat(context).isNotNull();
    }

    @Test
    public void main() {
        assertThat(context).isNotNull();
    }
}