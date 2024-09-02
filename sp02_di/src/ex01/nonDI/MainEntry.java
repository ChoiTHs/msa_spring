package ex01.nonDI;

public class MainEntry {

	//is-a        ,       has-a
	//상속                  포함
	// has-a 관

	public static void main(String[] args) {
		NewRecordView view = new NewRecordView(1, 2, 3, 4);
		view.print();
	}
}
