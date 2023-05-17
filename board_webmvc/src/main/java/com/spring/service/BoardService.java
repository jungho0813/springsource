package com.spring.service;

import java.util.List;

import com.spring.domain.BoardDTO;

public interface BoardService {
	
	//전체리스트가져오기
	public List<BoardDTO> getList();
	//글등록
	public boolean insert(BoardDTO dto);
}
