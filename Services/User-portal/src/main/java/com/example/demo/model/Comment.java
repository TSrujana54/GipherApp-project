package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Comment {
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id
		private int id;
		private String comments;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		
		
}