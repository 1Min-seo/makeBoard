package com.care.board.dao;

import java.util.List;

import com.care.board.vo.BoardVO;

public interface BoardDAO {
	
	//�Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	
	//�Խñ� ��� ��ȸ
	public List<BoardVO> list() throws Exception;

	//�Խñ� ��ȸ
	public BoardVO read(int bno) throws Exception;
	
	//�Խñ� ����
	public void update(BoardVO boardVO)throws Exception;
	
	//�Խñ� ����
	public void delete(int bno)throws Exception;
}
