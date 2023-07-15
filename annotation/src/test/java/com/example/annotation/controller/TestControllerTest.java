package com.example.annotation.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(TestControllerTest.class)
class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void modelAttributeTest() {

    }

}