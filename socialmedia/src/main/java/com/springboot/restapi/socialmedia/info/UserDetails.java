package com.springboot.restapi.socialmedia.info;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserDetails {

	private int id;
	@Size(min = 2)
	private String name;
	@Past
	private LocalDate birthDate;

}
