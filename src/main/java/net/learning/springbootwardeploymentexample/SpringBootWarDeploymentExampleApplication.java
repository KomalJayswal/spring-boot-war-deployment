package net.learning.springbootwardeploymentexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Initialize the Servlet Context required by the Tomcat by extends the SpringBootServletInitializer interface
 */
@SpringBootApplication
public class SpringBootWarDeploymentExampleApplication extends SpringBootServletInitializer {
	/**
	 * Override the Configure method
	 * @param application
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(SpringBootWarDeploymentExampleApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDeploymentExampleApplication.class, args);
	}

}
