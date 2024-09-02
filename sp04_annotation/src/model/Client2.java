package model;

public class Client2 {
	private String host;

	public void setHost(String host) {
		this.host = host;
	}
	
	public void connect() throws Exception{
		System.out.println("Client2.Connet() 호출 - 초기화 메소드");
	}
	
	public void send() {
		System.out.println("Client2.send() 실행 :" + host);
	}
	
	public void close() throws Exception {
		System.out.println("Client2.close 호출 - 소멸 메소드");
	}
	
}
