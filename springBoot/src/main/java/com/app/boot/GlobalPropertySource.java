package com.app.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value = "file:C:/Users/lalalal/git/stringboot/springBoot/etc/config.properties", ignoreResourceNotFound = true),
	@PropertySource(value = "file:${user.home}/etc/config.properties", ignoreResourceNotFound = true)
})
public class GlobalPropertySource {
	@Value("${datasource.url}")
	private String url;
	
	@Value("${datasource.driverClassName}")
	private String driverClassName;
	
	@Value("${datasource.username}")
	private String username;
	
	@Value("${datasource.password}")
	private String password;

	public String getUrl() {
		return url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
