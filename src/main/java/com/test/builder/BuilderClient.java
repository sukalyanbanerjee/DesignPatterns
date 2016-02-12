package com.test.builder;

public class BuilderClient {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Sukalyan", "Banerjee")
				.age(29)
				.salary(35000)
				.address("Chinchuria").build();
		System.out.println(user);
		
	}

}
