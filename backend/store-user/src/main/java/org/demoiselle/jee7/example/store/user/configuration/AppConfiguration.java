package org.demoiselle.jee7.example.store.user.configuration;

import org.demoiselle.jee.configuration.annotation.Configuration;

@Configuration
public class AppConfiguration {

	private String appSearchUrl;

	public String getAppSearchUrl() {
		return appSearchUrl;
	}

}