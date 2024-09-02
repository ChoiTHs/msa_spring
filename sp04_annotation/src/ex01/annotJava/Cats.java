package ex01.annotJava;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cats {
	
//	@Autowired
	private MyCats myCats; //갑을 가짐

	public void setMyCats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	public void getMyCatInfo() {
		System.out.println("cats Name : " + myCats.getName());
		System.out.println("cats Age : " + myCats.getAge());
		System.out.println("cats Hobby : " + myCats.getHobbys());
		System.out.println("cats Weight : " + myCats.getWeight());
		System.out.println("cats Color: " + myCats.getColor());
		
	}
	
}
