package com.spring.mapper;

import java.util.List;

import com.spring.domain.BookDTO;

public interface BookMapper {
	public int insert(BookDTO dto);
	public int update(int price,int code);
	public int delete(int code);
	public BookDTO selectOne(int code);
	public List<BookDTO> selectAll();
}
