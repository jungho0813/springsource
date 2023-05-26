package com.spring.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int page; //��������ȣ
	private int amount;  //�� �������� �� ���� �Խù��� ������ ������	
	private String type; //�˻�����
	private String keyword; //�˻���	
	public Criteria() {
		this(1,10);
	}
	public Criteria(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}	
	
	public String[] getTypeArr() {
		return type == null ? new String[] {} : type.split("");
	}
}