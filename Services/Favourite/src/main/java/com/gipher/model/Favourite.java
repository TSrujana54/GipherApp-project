package com.gipher.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "favourites1")
public class Favourite {
	@Id
	private String id;
    private String username;
    private String rating;
    private String images;
	
    public Favourite() {
		super();
	}

	public Favourite(String id, String username, String rating, String images) {
		super();
		this.id = id;
		this.username = username;
		this.rating = rating;
		this.images = images;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
    
    
    
    
	
}
