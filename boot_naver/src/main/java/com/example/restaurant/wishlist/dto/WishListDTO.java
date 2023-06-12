package com.example.restaurant.wishlist.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishListDTO {
	// 화면에 보여줄 내용 + db에서 가져온 값
	private Long idx;
	
	// SearchLocalItem + SearchImageItem
	private String title;
	private String category;
	private String address;
	private String roadAddress;
	private String homePageLink;
	private String imageLink;
	
	
	
	private boolean isVisit;
	private int visitCount;
	private LocalDateTime lastVisitDate;
	
}
