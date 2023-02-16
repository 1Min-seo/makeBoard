package com.care.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.board.vo.BoardVO;

@Repository
public  class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	//�Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert",boardVO);
		
	}
	
	//�Խù� ��� ��ȸ
	public List<BoardVO> list() throws Exception{
		return sqlSession.selectList("boardMapper.list");
		
	}
	
	
	
	
	
	
}
