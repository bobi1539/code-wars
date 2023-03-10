package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleTest {
    @Test
    public void testSample() {
        People person = People.builder().name("Adam").lastName("Savage").age(25).city("San Francisco").job("Unchained Reaction").build();
        assertEquals(
                "Adam",
                person.getName()
        );
        assertEquals(
                "hello my name is Adam",
                person.greet()
        );
    }
}
