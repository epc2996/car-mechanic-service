package com.pe.car.mechanic.service.engine.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.google.gson.GsonBuilder;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { ConfigurationConstant.BASE_PACKAGE})
public class ApplicationConfigurerAdapter extends WebMvcConfigurerAdapter {
	
	public static final String DATE_FORMAT_ISO8601_EXT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(converter());
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix(ConfigurationConstant.VIEW_PREFIX);
		viewResolver.setSuffix(ConfigurationConstant.VIEW_SUFFIX);
		return viewResolver;
	}

	@Bean
	public GsonHttpMessageConverter converter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		converter.setGson(new GsonBuilder().setDateFormat(DATE_FORMAT_ISO8601_EXT).create());
		return converter;
	}
}
