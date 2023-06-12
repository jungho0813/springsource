package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchLocalItem {
	private String title;
	private String link;
	private String category;
	private String description;
	private String address;
	private String roadAddress;
	private String mapx;
	private String mapy;
}
