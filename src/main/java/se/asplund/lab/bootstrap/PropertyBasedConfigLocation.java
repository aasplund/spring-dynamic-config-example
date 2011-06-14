package se.asplund.lab.bootstrap;

import org.springframework.beans.factory.annotation.Value;

public class PropertyBasedConfigLocation {// implements ConfigLocationProvider {
	@Value("#{props.greetings}")
	private String greetings;

	public String[] getConfigLocations() {
		return new String[] { "classpath:spring/hello-" + greetings
				+ "-config.xml" };
	}
}
