package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Book;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService aservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Book b) {
		return aservice.addDetails(b);
	}
	
	@GetMapping("/get")
	public List<Book> get(){
		return aservice.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Book> getId(@PathVariable int id){
		return aservice.getById(id);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Book b) {
		return aservice.update(b);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return aservice.delete(id);
	}

}
