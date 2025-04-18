package com.mcfarland.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class JobControllerTest {
    
    @Autowired
	private MockMvc mvc;

	@Test
	public void getJobs() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/jobs").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

        
                
                
	}


}
