package de.opengamebackend.registry;

import de.opengamebackend.util.EnableOpenGameBackendUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableOpenGameBackendUtils
public class RegistryApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(RegistryApplication.class).web(WebApplicationType.SERVLET).run(args);
	}
}
