package com.care.board.vo;

public class Criteria {
	private int page;
	private int perPageNum;
	private int rowStart;
	private int rowEnd;
	
	public Criteria() {
		this.page=1;
		this.perPageNum=10;
	}
	
	public void setPage(int page) {
		if(page<=0) {
			this.page=1;
			return;
		}
		this.page=page;
	}
	
	public void setPerpageNum(int perPageNum) {
		if(perPageNum<=0 || perPageNum>100) {
			this.perPageNum=10;
			return;
		}
	}
	
	public int getPage() {
		return page;
	}
	
	public int getPageStart() {
		return (this.page-1)*perPageNum;
	}
	
	public int getperPageNum() {
		return this.perPageNum;
	}
	
	public int getRowStart() {
		rowStart=((page-1)*perPageNum)+1;
		return rowStart;
	}
	
	public int getRowEnd() {
		rowEnd=rowStart+perPageNum-1;
		return rowEnd;
	}
}
