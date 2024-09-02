package ex02.nonDI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewRecord {  // DTO, VO, TO class

	private int kor, eng, math, com;

	public void disp() {
		System.out.println("kor : " + kor);
	}

	public int  total() {
		return this.kor+this.eng+this.math+this.com;
	}

	public float avg() {
		return total() / 4.0f;
	}
}







