package com.spring.service;

import java.util.List;

import com.spring.domain.BoardDTO;

public interface BoardService {
	
	//��ü����Ʈ��������
	public List<BoardDTO> getList();
	//�۵��
	public boolean insert(BoardDTO dto);
}
