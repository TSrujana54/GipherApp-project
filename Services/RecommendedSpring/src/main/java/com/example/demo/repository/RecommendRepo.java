package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Recommend;



@Repository
public interface RecommendRepo extends MongoRepository<Recommend,String> {

	
	
	public List<Recommend> findByUsername(String username);

	public long deleteByIdAndUsername(String id,String username);
//	public long deleteByIdAndRating(String id,String rating);
	public List<Recommend> findByIdAndUsername(String id,String username);

	public long deleteByIdAndRating(String id, String rating);

}
