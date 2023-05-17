package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class ChangeDTO {
	private String userid;
	private String CurrentPassword;
	private String NewPassword;
	private String confirmPassword;
	
	public boolean passwordEquals() {
		return NewPassword.equals(confirmPassword);
	}
}
