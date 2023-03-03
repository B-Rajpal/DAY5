package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo brepo;
	
	public String addDetails(Book b) {
		brepo.save(b);
		return "data saved";
	}
	
	public List<Book> getAll(){
		return brepo.findAll();
	}
	
	public Optional<Book> getById(int id){
		return brepo.findById(id);
	}
	
	public String update(Book b) {
		brepo.saveAndFlush(b);
		return " data updated";
	}
	
	public String delete(int id) {
		brepo.deleteById(id);
		return "data deleted";
	}
	
	
	

}
