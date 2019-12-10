package com.triconinfotech.inmemoryCRUD.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestController1 {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getAllUserDetails_shouldReturnDetails() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8900/details"))
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("userName").value("Shubham"))
                    .andExpect(jsonPath("userEmail").value("shubham.1510151@gmail.com"))
                    .andExpect(jsonPath("phoneNo").value(45))
                    .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAllUserDetails_NoUsersFound() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8900/details"))
                    .andExpect(status().isNotFound());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
