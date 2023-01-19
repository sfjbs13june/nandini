package com.nandini.app.controller;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({OperationController.class})
public class OperationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testOperationControlleradd() throws Exception {
        String a="20.0";
        String b="4.0";
        ResultActions responseEntity  = mockMvc.perform(get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        Assertions.assertEquals("24.0", result);
    }



}
