package edu.kosa.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao_di.UserDAO;
import edu.kosa.model.UserVO;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("ctx.xml");
		
		UserDAO  dao = ctx.getBean("dao", UserDAO.class);
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			dao.menu();
			n = sc.nextInt();
			switch (n) {
				case 1:
						UserVO vo = new UserVO();
						System.out.print("user id= ");				vo.setId(sc.next());
						System.out.print("user name= ");			vo.setName(sc.next());
						System.out.print("user pass = ");			vo.setPassword(sc.next());
						
						dao.insert(vo);
						System.out.println(vo.getId() + "추가 성공!!");
						System.out.println("----------------------------");
						break;
						
				case 2:  // selectAll
					dao.selectAll();
					break;
					
				case 3:  // selectById
					System.out.println("id를 입력하세요");
					String id = sc.next();
					dao.selectById(id);
					break;
				case 4:
					System.out.println("id를 입력하세요");
					id = sc.next();
					System.out.println("변경할 이름을 입력하세요");
					String name = sc.next();
					System.out.println("변경할 비밀번호를 입력하세요");
					String pwd = sc.next();
					dao.updateById(id, name, pwd);
					break;
				case 5:  // deleteById
					System.out.println("id를 입력하세요");
					id = sc.next();
					dao.deleteById(id);
					break;
				default:
					break;
			}
		}while(n != 0);
		sc.close();
		/*
		UserDAO dao = new OracleUserDAOImpl();
		Scanner sc = new Scanner(System.in);

		dao.menu();
		switch (sc.nextInt()) {
			case 1:
					UserVO vo = new UserVO();
					System.out.print("user id= ");				vo.setId(sc.next());
					System.out.print("user name= ");			vo.setName(sc.next());
					System.out.print("user pass = ");			vo.setPassword(sc.next());
					
					dao.insert(vo);
					System.out.println(vo.getId() + "추가 성공!!");
					System.out.println("----------------------------");
					break;
					
			case 2:  // selectAll
				dao.selectAll();
				break;
			case 3:
	
				break;
			default:
				break;
		}
		*/
	}
}
