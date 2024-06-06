package com.eugenevas.junit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void test() {
        Assertions.assertTrue(true);


    }


    @Test
    public void whenAssertingEquality () {
        String expected = "3.14";
        String actual = "3";

        Assertions.assertEquals(expected, actual);
    }



}
