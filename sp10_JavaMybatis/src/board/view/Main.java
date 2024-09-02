package board.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import board.controller.MybartisBoardDAO;
import board.model.MybatisBoardVO;

public class Main {
	public static void main(String[] args) {
		MybartisBoardDAO dao = new MybartisBoardDAO();
		MybatisBoardVO vo = null;
		List<MybatisBoardVO> list = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1. select |2. insert |3. update |4. delete");
		switch (sc.nextInt()) {
		case 1:
			list = dao.selectAll();
			for (MybatisBoardVO board : list) {
				System.out.println(board);
			}
			break;
		case 2:
			vo = new MybatisBoardVO();
			System.out.println("컨텐츠, 제목, 작성자?");
			vo.setContent(sc.next());
			vo.setTitle(sc.next());
			vo.setWriter(sc.next());
			dao.insert(vo);
			
			list = dao.selectAll();
			for (MybatisBoardVO board : list) {
				System.out.println(board);
			}
			break;
		case 3:
			vo = new MybatisBoardVO();
			System.out.println("컨텐츠, 제목, 작성자, 번호?");
			vo.setContent(sc.next());
			vo.setTitle(sc.next());
			vo.setWriter(sc.next());
			vo.setSeq(sc.nextInt());
			dao.update(vo);
			
			list = dao.selectAll();
			for (MybatisBoardVO board : list) {
				System.out.println(board);
			}
			break;
		case 4:
			vo = new MybatisBoardVO();
			System.out.println("제거할 번호?");
			vo.setSeq(sc.nextInt());
			dao.delete(vo);
			
			list = dao.selectAll();
			for (MybatisBoardVO board : list) {
				System.out.println(board);
			}
			break;
		default:
			break;
		}
	}
}
