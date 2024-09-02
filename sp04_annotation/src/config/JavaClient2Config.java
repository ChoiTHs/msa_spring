package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Client2;

@Configuration
public class JavaClient2Config {
	
	@Bean(initMethod ="connect", destroyMethod ="close")
	@Scope("prototype")
	public Client2 client2() {
		
		Client2 client2 = new Client2();
		client2.setHost("server2!!!");
		
		return client2;
	}
}	
