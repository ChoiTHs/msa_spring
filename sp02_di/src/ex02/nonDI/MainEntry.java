package ex02.nonDI;

public class MainEntry {

	// ��ü�� ������ ���� ������
	// �ʿ�� ��ü�� �ּҸ� ����
	public static void main(String[] args) {
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord(10, 20, 30, 40);

		view.setRecord(record);
		view.print();
	}
}
