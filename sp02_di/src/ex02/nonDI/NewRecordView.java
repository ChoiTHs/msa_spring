package ex02.nonDI;

public class NewRecordView {

	private NewRecord record;

//	필요한 객체를 setter를 사용해서 주입
//	객체의 생성이 서로 독립적이고 필요할 때 겍체에 주입
	public void setRecord(NewRecord record) {
		this.record = record;
	}

	public void print() {
		System.out.println("KOR : " + record.getKor());
		System.out.println(record.total() + " /  " + record.avg());
		System.out.println("+++++++++++++++");
		record.disp();
		System.out.println(record);  // toString()
	}



}
