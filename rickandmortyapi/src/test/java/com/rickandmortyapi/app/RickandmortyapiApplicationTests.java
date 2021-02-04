package com.rickandmortyapi.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class RickandmortyapiApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objectMapper;

	@Test
	public void episodeTest() throws Exception {
		MvcResult result = this.mockMvc.perform(get("/episode/1")).andReturn();
		String expeted = "{\"episode\":1,\"episodeName\":\"The Ricklantis Mixup\",\"characters\":[{\"name\":\"Rick Sanchez\",\"species\":\"Human\",\"gender\":\"Male\",\"image\":\"https://reckandmortyapi.com/character/1.jpeg\",\"location\":{\"name\":\"Earth\",\"type\":\"Planet\",\"dimension\":\"Replacemt Dimension\"}},{\"name\":\"Morty Smit\",\"species\":\"Human\",\"gender\":\"Male\",\"image\":\"https://reckandmortyapi.com/character/2.jpeg\",\"location\":{\"name\":\"Earth\",\"type\":\"Planet\",\"dimension\":\"Replacemt Dimension\"}}]}";
		JSONAssert.assertEquals(expeted, result.getResponse()
				.getContentAsString(), true);
	}
	
	@Test
	public void ishappyTest() throws Exception {
		MvcResult result = this.mockMvc.perform(get("/ishappy").param("numList", "82,89")).andReturn();
		JSONAssert.assertEquals("{\"numbers\":[{\"happy\":true,\"munber\":82},{\"happy\":false,\"munber\":89}]}", result.getResponse()
				.getContentAsString(), true);
	}
	
	@Test
	public void calcTest() throws Exception {
		this.mockMvc.perform(get("/calc/5"))
			.andDo(print()).andExpect(status().isOk())
			.andExpect(jsonPath("$.result").value(15));
		this.mockMvc.perform(get("/calc/10"))
			.andDo(print()).andExpect(status().isOk())
			.andExpect(jsonPath("$.result").value(55));
	}
}
