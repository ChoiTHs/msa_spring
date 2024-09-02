package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Client;

@Configuration // 설정 파일임을 선언
public class JavaClientConfig {
//	Client.java, xml 기반 설정이 아닌 자바기반 설정, ~Ctx.xml 대체
	
	@Bean // <bean id="client" class="model.client">
	public Client client(){
		Client client = new Client();
		client.setHost("server!!!");
		
		return client;
	}
}
