package com.test.builder;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String address;
	
	private User(String firstName, String lastName, int age, double salary, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	public static class UserBuilder {
	
		private String firstName;
		private String lastName;
		private int age;
		private double salary;
		private String address;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this.firstName, this.lastName, this.age, this.salary, this.address);
			return user;
		}
	}
	
	public String toString() {
		return "[" + firstName + " "
				+ lastName + " "
				+ age + " "
				+ salary + " "
				+ address + "]";
	}
}
