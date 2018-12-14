package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.domain.BoardVO;

@Mapper
public interface BoardMapper
{
	//글작성
	public void addBoard(BoardVO board) throws Exception;
	
	//글목록
	public List<BoardVO> getBoardList() throws Exception;
	
	//글보기
	public BoardVO getBoard(int bno) throws Exception;
	
	//조회수 증가
	public void hitPlus(int bno) throws Exception;
	
	//글수정
	public void updateBoard(BoardVO board) throws Exception;
	
	//글삭제
	public void deleteBoard(int bno) throws Exception;
}
