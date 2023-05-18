package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;

public interface BoardMapper {
	public List<BoardDTO> list(Criteria cri);
	public int insert(BoardDTO dto);
	public BoardDTO get(int bno);
	public int update(BoardDTO dto);
	public int remove(int bno);
	public int totalCnt();
}
