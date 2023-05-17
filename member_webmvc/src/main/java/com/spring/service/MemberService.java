package com.spring.service;

import com.spring.domain.AuthDTO;
import com.spring.domain.ChangeDTO;
import com.spring.domain.LoginDTO;
import com.spring.domain.MemberDTO;

public interface MemberService {
	//�α���
	public AuthDTO login(LoginDTO loginDTO);
	//ȸ������
	public boolean register(MemberDTO memberDTO);
	//�ߺ� ���̵� üũ
	public boolean dupId(String userid);
	//ȸ�� Ż��
	public boolean remove(LoginDTO loginDTO);
	//��й�ȣ ����
	public boolean update(ChangeDTO changeDTO);
}
