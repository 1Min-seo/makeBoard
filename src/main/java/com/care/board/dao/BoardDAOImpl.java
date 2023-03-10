package com.care.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.board.vo.BoardVO;
import com.care.board.vo.Criteria;

@Repository
public  class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	//게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert",boardVO);
		
	}
	
	//게시글 목록 조회
	@Override
	public List<BoardVO> list(Criteria cri) throws Exception{
		return sqlSession.selectList("boardMapper.listPage",cri);
		
	}
	
	//게시글 총 갯수
	public int listCount()throws Exception{
		return sqlSession.selectOne("boardMapper.listCount");
	}
	
	//게시글 조회
	@Override
	public BoardVO read(int bno) throws Exception{
		return sqlSession.selectOne("boardMapper.read", bno);
	}
	
	//게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception{
		sqlSession.update("boardMapper.update",boardVO);
	}
	
	//게시글 삭제
	@Override
	public void delete(int bno)throws Exception{
		sqlSession.delete("boardMapper.delete",bno);
	}
	
	
}
