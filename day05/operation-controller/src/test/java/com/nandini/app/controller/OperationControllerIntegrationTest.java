package com.nandini.app.controller;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({OperationController.class})
public class OperationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testOperationControlleradd() throws Exception {
        long a = 20;
        long b = 4;
        ResultActions result = mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData=result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("24", resultData);
    }
    @Test
    public void testOperationControllersub() throws Exception {
        long a = 20;
        long b = 4;
        ResultActions result = mockMvc.perform(post("/sub").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData=result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("16", resultData);
    }
    @Test
    public void testOperationControllermul() throws Exception {
        long a = 20;
        long b = 4;
        ResultActions result = mockMvc.perform(put("/mul").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData=result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals("80", resultData);
    }
}
