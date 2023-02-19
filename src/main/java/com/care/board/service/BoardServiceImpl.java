package com.care.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.board.dao.BoardDAO;
import com.care.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;
	
	//게시글 작성
	@Override
	public void write(BoardVO boardVO)throws Exception{
		dao.write(boardVO);
	}
	
	//게시물 목록 조회
	@Override
	public List<BoardVO> list()throws Exception{
		return dao.list();
	}
	
	//게시글 조회
	@Override
	public BoardVO read(int bno)throws Exception{
		return dao.read(bno);
	}
	
	//게시글 수정
	@Override
	public void update(BoardVO boardVO)throws Exception{
		dao.update(boardVO);
	}
	
	//게시글 삭제
	public void delete(int bno)throws Exception{
		dao.delete(bno);
	}
	
	
}
