package ex02.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoniterViewer {
	
	//1. 필드에 적용
//	@Autowired
	private Recorder recorder;     // has-a

	public Recorder getRecorder() {
		return recorder;
	}

	//2. setter method 를 통한 자동 주입
//	@Autowired
//	public void setRecorder(Recorder recorder) {   // DI
//		this.recorder = recorder;
//	}
	
	//3. 일반 메소드 
	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("사용자(일반) 메소드 이용한 자동 주입");
	}
	
	
	//4. 생성자 함수를 이용한 주입
//	@Autowired
//	public MoniterViewer(Recorder recorder) {
//		super();
//		this.recorder = recorder;
//		System.out.println("나 생성자 함수 이용한 자동 주입");
//	}

	public void print() {
		System.out.println("user method 주입 : " + this.recorder);
		System.out.println("setter method");
		recorder.show();
	}
	
	
}




