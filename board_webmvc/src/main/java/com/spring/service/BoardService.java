package com.spring.service;

import java.util.List;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;

public interface BoardService {
	
	//��ü����Ʈ��������
	public List<BoardDTO> getList(Criteria cri);
	//�۵��
	public boolean insert(BoardDTO dto);
	//Ư�� �Խñ� ��ȸ
	public BoardDTO getRow(int bno);
	//�Խù� ����
	public boolean update(BoardDTO dto);
	//�Խù� ����
	public boolean remove(int bno);
	//��ü �Խù� ����
	public int getTotalCnt();
}
