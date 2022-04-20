package com.springboot.basic.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return  List.of(new Book(1,"dsa","bala"));  
		
	}

}
