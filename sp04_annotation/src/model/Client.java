package model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
	private String defaulthst;
	private String host;
	public Client() {
		System.out.println("Client Default Constructor");
	}
	public Client(String defaulthst) {
		super();
		this.defaulthst = defaulthst;
		System.out.println("Client Constructor : " + this.defaulthst);
	}
	public String getDefaulthst() {
		return defaulthst;
	}
	public String getHost() {
		return host;
	}
	public void setDefaulthst(String defaulthst) {
		this.defaulthst = defaulthst;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void send() { /* <property name="host" value="서버"> */
		System.out.println("client.send() to : " + host);
	}

	// 내부적으로 가지고 있음, 자동 호출됨, InitializingBean의 구현부
	//afterPropertiesSet; property injection후 호출되는 함수
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet() 실행!!!");
	}
	
	// 내부적으로 가지고 있음, 자동 호출됨, DisposableBean의 구현부
	//destroy; 
	@Override
	public void destroy() throws Exception {
		System.out.println("Client.destroy() 실행");
	}
}
