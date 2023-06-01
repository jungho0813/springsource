package com.spring.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class ReplyDTO {

	private int bno;
	private int rno;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
}
