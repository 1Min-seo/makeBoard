package com.care.board.service;

import java.util.List;

import com.care.board.vo.BoardVO;

public interface BoardService {
	
	//�Խñ� �ۼ�
	public void write(BoardVO boardVO)throws Exception;
	
	//�Խñ� ��� ��ȸ
	public List<BoardVO> list() throws Exception;
	
}
