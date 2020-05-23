package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentRepository cp;
	@PostMapping("/comment")
	public ResponseEntity<Comment> saveCustomer(@RequestBody Comment c) {
		Comment bk=cp.save(c);
		return new ResponseEntity<Comment>(bk,HttpStatus.OK);
	}
	@GetMapping("/getComment/{custId}")
	public ResponseEntity<Comment> getCustomer(@PathVariable("custId") int id) {
		Optional<Comment> b = cp.findById(id);
		if(b.isPresent()) {
		Comment bk=b.get();
		return new ResponseEntity<Comment>(bk,HttpStatus.OK);
	}
		return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
}
	@DeleteMapping("/deleteComment/{custId}")
	public ResponseEntity<Comment> deleteCustomerById(@PathVariable("custId") int id) {
		if(cp.existsById(id)) {
		cp.deleteById(id);
		return new ResponseEntity<Comment>(HttpStatus.NO_CONTENT);
	}
		return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
}
	@GetMapping("/getCommentDetails")
	public ResponseEntity<List<Comment>> getAllCustomerDetails() {
		List<Comment> lstCustomer = cp.findAll();
		return new ResponseEntity<List<Comment>>(lstCustomer,HttpStatus.OK);
}

}
