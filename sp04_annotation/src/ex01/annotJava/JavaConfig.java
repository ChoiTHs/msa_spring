package ex01.annotJava;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean// = MyCats cat1 = new MyCats(); = <bean id="cat1" class="ex01.annotJava.MyCats"/>
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("뒹굴기");
		hobbys.add("추르먹기");
		
		MyCats myCats = new MyCats("냥이", 12, hobbys);
		myCats.setWeight(3.7);
		myCats.setColor("black");
		
		return myCats;
	}
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList();
		hobbys.add("뒹굴기");
		
		MyCats myCats = new MyCats("나비", 3, hobbys);
		myCats.setWeight(2.3);
		myCats.setColor("orange");
		
		return myCats;
	}
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());// ref="cats"
		return cats;
		
	}
}
