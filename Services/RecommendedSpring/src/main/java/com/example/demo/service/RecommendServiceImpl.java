package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Recommend;
import com.example.demo.repository.RecommendRepo;



@Service
public class RecommendServiceImpl implements RecommendService{

	
	@Autowired
    RecommendRepo fr;
	
	public Recommend saveFavourite(Recommend f) {
		return fr.save(f);
				
	}

	@Override
	public List<Recommend> getAllFavourites(String username) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public long deleteFromFavourite(String id,String username) 
//	{
//		
//		 long  f =fr.deleteByIdAndUsername(id,username);	
//		return f;
//	}

	@Override
	public List<Recommend> getAllFavouriteDetails() {
		List<Recommend> f= new ArrayList<>();
		fr.findAll().forEach(f::add);
		return f;
	}
	

	@Override
	public List<Recommend> getFavouriteByIdAndUsername(String id, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public long deleteFromFavourite(String id, String rating) {
		 long  f =fr.deleteByIdAndRating(id,rating);	
			return f;
	}


	
	
}
