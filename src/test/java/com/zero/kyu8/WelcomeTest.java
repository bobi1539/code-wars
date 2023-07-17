package com.zero.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {
    @Test
    void greetTest() {
        String english = Welcome.greet("english");
        System.out.println(english);

        assertEquals("Welcome", Welcome.greet("english"), "Your function should have returned 'Welcome'. Try again.");
        assertEquals( "Welkom", Welcome.greet("dutch"), "Your function should have returned 'Welkom'. Try again.");
        assertEquals( "Welcome", Welcome.greet("IP_ADDRESS_INVALID"), "Your function should have returned 'Welcome'. Try again.");
    }
}
