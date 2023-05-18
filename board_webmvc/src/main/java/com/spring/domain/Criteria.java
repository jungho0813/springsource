package com.spring.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Criteria {
	private int pageNum; // ������ ��ȣ
	private int amount;  // �������� �Խù� ����
	
	private String type;	// �˻�����
	private String keyword; // �˻���
	
	public Criteria() {
		this(1,10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
}
