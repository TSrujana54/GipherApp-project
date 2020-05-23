package com.gipher.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gipher.model.Favourite;
import com.gipher.repository.FavouriteRepository;

@Service
public class FavouriteServiceImpl implements FavouriteService{
	private static Logger logger=LoggerFactory.getLogger(FavouriteServiceImpl.class);
	
	@Autowired
	FavouriteRepository fr;

	@Override
	public Favourite saveFavourite(Favourite f) 
	{
		return fr.save(f);
	}

	@Override
	public List<Favourite> getAllFavourites(String username)
	{
       List<Favourite> favour=fr.findByUsername(username);
		
		if(!favour.isEmpty())
		{
			return favour;
		}
		return null;
		
	}

	@Override
	public Favourite deleteFromFavourite(String id, String username) 
	{
		Favourite f = null;
		try
		{
		   f =fr.deleteByIdAndUsername(id,username);
			
		}
		catch(Exception e)
		{
			logger.error("Error while deleting from favourites");
		}
		
		return f;
	}

	@Override
	public List<Favourite> getAllFavouriteDetails() 
	{
		List<Favourite> f= new ArrayList<>();
		fr.findAll().forEach(f::add);
		return f;
	}
	
		

	@Override
	public List<Favourite> getFavouriteByIdAndUsername(String id, String username) 
	{
		List<Favourite> f=fr.findByIdAndUsername(id, username);
		if(!f.isEmpty())
		{
			return f;
		}
		return null;
		
	}

	
}
