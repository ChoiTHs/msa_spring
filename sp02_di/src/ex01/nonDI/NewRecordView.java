package ex01.nonDI;

public class NewRecordView {

	private NewRecord record;

	public NewRecordView(int kor, int eng, int com, int math) {
		record = new NewRecord(kor, eng, math, com);
	}

	public void print() {
		System.out.println("KOR : " + record.getKor());
		System.out.println(record.total() + " /  " + record.avg());
		System.out.println("+++++++++++++++");
		record.disp();
		System.out.println(record);  // toString() �Լ� ȣ��
	}

}
