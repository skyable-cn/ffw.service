package com.ffw.service.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ffw.service.plugin.PagePlugin;

@Configuration
public class CommonConfig {

	@Bean
	public PagePlugin pagePlugin() {
		PagePlugin pagePlugin = new PagePlugin();
		Properties properties = new Properties();
		properties.setProperty("dialect", "mysql");
		properties.setProperty("pageSqlId", ".*listPage.*");
		pagePlugin.setProperties(properties);
		return pagePlugin;
	}
}
