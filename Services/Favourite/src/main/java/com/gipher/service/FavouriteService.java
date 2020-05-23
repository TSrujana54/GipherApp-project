package com.gipher.service;

import java.util.List;

import com.gipher.model.Favourite;

public interface FavouriteService 
{
	
	public Favourite saveFavourite(Favourite f);
	
	public List<Favourite> getAllFavourites(String username);
	
	public Favourite deleteFromFavourite(String id, String username);
	
	public List<Favourite> getAllFavouriteDetails();
	
	public List<Favourite> getFavouriteByIdAndUsername(String id, String username);
}
