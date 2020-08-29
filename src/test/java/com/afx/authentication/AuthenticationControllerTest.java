package com.afx.authentication;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.*;
import org.springframework.test.web.servlet.MockMvc;

public class AuthenticationControllerTest {
    private AuthenticationController rest;
    private MockMvc endpoint;

    @Before
    public void setup() {
        rest = new AuthenticationController();
        endpoint = standaloneSetup(rest).build();
    }

    @Test
    public void create_ok() throws Exception {
        endpoint
            .perform(get("/auth/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello"));
    }
}