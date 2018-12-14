package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.BoardVO;
import com.test.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService
{
	@Autowired
	BoardMapper boardMapper;

	@Override
	public void addBoard(BoardVO board) throws Exception
	{
		boardMapper.addBoard(board);
	}

	@Override
	public List<BoardVO> getBoardList() throws Exception
	{
		return boardMapper.getBoardList();
	}

	@Override
	public BoardVO getBoard(int bno) throws Exception
	{
		return boardMapper.getBoard(bno);
	}

	@Override
	public void hitPlus(int bno) throws Exception
	{
		boardMapper.hitPlus(bno);
	}

	@Override
	public void updateBoard(BoardVO board) throws Exception
	{
		boardMapper.updateBoard(board);
	}

	@Override
	public void deleteBoard(int bno) throws Exception
	{
		boardMapper.deleteBoard(bno);
	}
}
