package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.domain.BookDTO;

@Mapper
public interface BookMapper {
	public List<BookDTO> getRows();
	public int insert(BookDTO dto);
	public BookDTO read(int code);
	public int update(BookDTO dto);
}
