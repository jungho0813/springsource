package com.spring.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class RegisterDTO {
	private String id;
	private String password;
	private String name;
	private String email;
}
