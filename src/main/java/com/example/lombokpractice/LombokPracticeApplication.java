package com.example.lombokpractice;

import lombok.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokPracticeApplication {

	public static void main(String[] args) {

		var person1 = Person.builder().name("Some Name").email("some email").age(-1).build();

		System.out.println(person1);

		var person2 = new Person("Some Name", "Some Email", -1);
		System.out.println(person2);

		var person3 = new Person();
		person3.setName("Some Name");
		person3.setEmail("Some email");
		person3.setAge(-1);
		System.out.println(person3);

		var car = new Car();

		SpringApplication.run(LombokPracticeApplication.class, args);
	}

}

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person{
	private String name;
	private String email;
	private int age;
}


@Data class Car {
	private String name;
	private String model;
}