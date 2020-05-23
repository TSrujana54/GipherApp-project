package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recommend;
import com.example.demo.service.RecommendService;




@RequestMapping("/favour1")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RecommendController {
	
	
	@Autowired
	private RecommendService fs;
	
	@PostMapping("/addToFavourite1")
	
	//save recommend
	
	public ResponseEntity<?> saveFavourite(@RequestBody Recommend f) 
	{
		ResponseEntity<?> rs=null;
		
			Recommend favour=fs.saveFavourite(f);;
			if(favour!=null)
			{
				rs=ResponseEntity.status(HttpStatus.CREATED).build();
			}
			else
			{
				rs=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			return rs;
		}
	
	
	//get all recommend details
	
	 @RequestMapping(value="/getfavourites1",method=RequestMethod.GET)
	 	public List<Recommend> getAllFavouriteDetails()
	 {
	 		return fs.getAllFavouriteDetails();
		}
	 
	 
	 //delete from recommend
	 
//	 
//	 @DeleteMapping("/deleteFromFavourite/{id}/{username}")
//	  public ResponseEntity<?> deleteCustomer(@PathVariable("id") String id,@PathVariable("username") String username) {
//	    
//	    ResponseEntity<?> rs=null;		
//			fs.deleteFromFavourite(id,username);			
//			rs=ResponseEntity.status(HttpStatus.OK).build();
//
//		return rs;
//	    
//	  }	
	 
	 @DeleteMapping("/deleteFromFavourite/{id}/{rating}")
	  public ResponseEntity<?> deleteCustomer1(@PathVariable("id") String id,@PathVariable("rating") String rating) {
	    
	    ResponseEntity<?> rs=null;		
			fs.deleteFromFavourite(id,rating);			
			rs=ResponseEntity.status(HttpStatus.OK).build();

		return rs;
	    
	  }	
//	 @DeleteMapping("/deleteFromFavourite/{id}")
//	  public ResponseEntity<?> deleteCustomer(@PathVariable("id") String id) {
//	    
//	    ResponseEntity<?> rs=null;		
//			fs.deleteFromFavourite(id);			
//			rs=ResponseEntity.status(HttpStatus.OK).build();
//
//		return rs;
//	    
//	  }	

}
