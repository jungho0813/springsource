package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchImageItem {
	private String title;
	private String link;
	private String thumnail;
	private String sizeheight;
	private String sizewidth;
}
