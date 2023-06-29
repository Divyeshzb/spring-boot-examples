// Test generated by RoostGPT for test dm-example-3 using AI Model gpt

```java
package com.in28minutes.fullstack.springboot.jwt.basic.authentication.springbootjwtauthloginlogout.jwt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JwtTokenRequest_JwtTokenRequest644b500046Test {

    private JwtTokenRequest jwtTokenRequest;

    @BeforeEach
    public void setUp() {
        jwtTokenRequest = new JwtTokenRequest("TestUser", "TestPassword");
    }

    @Test
    public void testJwtTokenRequestUsername() {
        assertEquals("TestUser", jwtTokenRequest.username());
    }

    @Test
    public void testJwtTokenRequestPassword() {
        assertEquals("TestPassword", jwtTokenRequest.password());
    }

    @Test
    public void testJwtTokenRequestNullUsername() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new JwtTokenRequest(null, "TestPassword");
        });
        String expectedMessage = "username is marked non-null but is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testJwtTokenRequestNullPassword() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new JwtTokenRequest("TestUser", null);
        });
        String expectedMessage = "password is marked non-null but is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

}