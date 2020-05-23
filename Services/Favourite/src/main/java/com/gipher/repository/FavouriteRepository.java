package com.gipher.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gipher.model.Favourite;


@Repository
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface FavouriteRepository extends MongoRepository<Favourite,String>
{
	 
	//public List<Favourites> findBygifidAndusername(String id, String username);

	//public Favourites deleteBygifidAndusername(String id, String username);

	
	public List<Favourite> findByUsername(String username);

	public Favourite deleteByIdAndUsername(String id,String username);
	
	public List<Favourite> findByIdAndUsername(String id,String username);

}
