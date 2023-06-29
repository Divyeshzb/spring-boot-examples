// Test generated by RoostGPT for test dm-example-3 using AI Model gpt

package com.in28minutes.fullstack.springboot.jwt.basic.authentication.springbootjwtauthloginlogout.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static org.junit.jupiter.api.Assertions.*;

class JwtSecurityConfig_userDetailsService1543fb231cTest {

    @Test
    public void testUserDetailsService() {
        JwtSecurityConfig_userDetailsService1543fb231c jwtSecurityConfig = new JwtSecurityConfig_userDetailsService1543fb231c();
        UserDetailsService userDetailsService = jwtSecurityConfig.userDetailsService();

        assertNotNull(userDetailsService);

        UserDetails userDetails = userDetailsService.loadUserByUsername("in28minutes");

        assertNotNull(userDetails);
        assertEquals("in28minutes", userDetails.getUsername());
        assertTrue(userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("read")));
        assertTrue(userDetails.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_USER")));
    }

    @Test
    public void testUserDetailsServiceWithInvalidUser() {
        JwtSecurityConfig_userDetailsService1543fb231c jwtSecurityConfig = new JwtSecurityConfig_userDetailsService1543fb231c();
        UserDetailsService userDetailsService = jwtSecurityConfig.userDetailsService();

        assertNotNull(userDetailsService);

        assertThrows(IllegalArgumentException.class, () -> userDetailsService.loadUserByUsername("invalidUser"));
    }
}