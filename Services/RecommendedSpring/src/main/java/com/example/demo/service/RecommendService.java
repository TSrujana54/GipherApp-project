package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Recommend;


public interface RecommendService {

	
public Recommend saveFavourite(Recommend f);
	
	public List<Recommend> getAllFavourites(String username);
	public List<Recommend> getAllFavouriteDetails();
	
	
	//public long deleteFromFavourite(String id,String username);
	public long deleteFromFavourite(String id,String rating);
	
	public List<Recommend> getFavouriteByIdAndUsername(String id, String username);


	
}
