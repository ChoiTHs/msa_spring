package board.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.model.MybatisBoardVO;
import config.SqlSessionFactoryBean;

public class MybartisBoardDAO {

	private SqlSession sqlSession;
	
	public MybartisBoardDAO(){
		sqlSession = SqlSessionFactoryBean.getSqlSessionInstance();
		System.out.println("연결 성공");
	}
	public List<MybatisBoardVO> selectAll(){
		return sqlSession.selectList("dao.selectAll");
		//mappers/boardMapper.xml의 <mapper namespace="dao"> 안의 selectAll을 반환한다.
	}
	public void insert(MybatisBoardVO vo){
		sqlSession.insert("dao.insert", vo);
		sqlSession.commit();
	}
	public void update(MybatisBoardVO vo) {
		sqlSession.update("dao.update",vo);
		sqlSession.commit();
	}
	public void delete(MybatisBoardVO vo) {
		sqlSession.delete("dao.delete", vo);
		sqlSession.commit();
	}
	
	
	/*
	 * 닫을 수 있다
	 * public void close() { sqlSession.close(); }
	 */
}
