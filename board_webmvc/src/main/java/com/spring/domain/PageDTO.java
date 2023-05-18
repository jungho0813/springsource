package com.spring.domain;
// ������ ������ ���� ��ü
// ��û�� ������ : pageNum
// �� �������� ��� �� : amount
// ����������(startPage), ������������(endPage) => 1	5	10
//											11	15	20
// ������ ������ ����(realEnd)
// ��ü �Խù� ����(total)
// ��ü �Խù� 35 �� , �� �������� 10���� �����ֱ� => 1 2 3 4 

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	private int total;
	
	private Criteria cri;
	
	public PageDTO(Criteria cri,int total) {
		this.total = total;
		this.cri = cri;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage -9;
		
		int realEnd = (int)(Math.ceil((total / 1.0) / cri.getAmount()));
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
