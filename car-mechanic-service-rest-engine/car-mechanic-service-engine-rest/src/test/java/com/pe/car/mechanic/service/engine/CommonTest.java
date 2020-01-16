package com.pe.car.mechanic.service.engine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.pe.car.mechanic.service.engine.configuration.ApplicationConfigurerAdapter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfigurerAdapter.class })
@WebAppConfiguration
public abstract class CommonTest {
	
	private static final Logger LOGGER = LogManager.getLogger(CommonTest.class);
	
	@Autowired
	private WebApplicationContext context;

	protected MockMvc mockMvc;
	
	private String languageHeader;
	
	private String language;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders
				.webAppContextSetup(context)
				.build();
		this.language="es-PE";
		this.languageHeader="Accept-Language";
	}

	protected String getLanguage() {
		return language;
	}

	protected void setLanguage(String language) {
		this.language = language;
	}

	protected String getLanguageHeader() {
		return languageHeader;
	}

	protected void setLanguageHeader(String languageHeader) {
		this.languageHeader = languageHeader;
	}

	
	
}
