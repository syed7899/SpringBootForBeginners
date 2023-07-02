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


	@GetMapping("/m1")
	public void m1(){
		System.out.println(" M1 method");
	}


	@GetMapping("/m2")
	public void M2() {
		System.out.println("M2 Method");
	}

	@GetMapping("/m3")
	public void M3() {
		System.out.println("M3 Method");
	}

	@GetMapping("/m4")
	public void M4() {
		System.out.println("M4 Method");
	}

	@GetMapping("/m5")
	public void M5() {
		System.out.println("HYder M5");
	}
}
