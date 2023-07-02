package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		System.out.println("GetALLBooks ** Now this will have problem has been called");
		return Arrays.asList(
				new Book(1l, "Spring Boot 3.0", "Syed Hyder"));
	}

	@GetMapping("/message")
	public String getGreetings() {
		System.out.println("conflict may arise once again chal bey");
		System.out.println("AMER ALI");
		return "Hello Syed Hyder";
	}
}
