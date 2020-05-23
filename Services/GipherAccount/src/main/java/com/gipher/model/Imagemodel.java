package com.gipher.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Imagemodel
{
	    @Id
       @Column(name = "id")
       @GeneratedValue
	    private Long id;

	    @Column(name = "name")
	    private String name;
        @Column(name = "type")
	    private String type;

	    @Lob
	    @Column(name = "pic")
	    private byte[] pic;

		public Imagemodel( String name, String type, byte[] pic) {
			super();
	
			this.name = name;
			this.type = type;
			this.pic = pic;
		}

		public Imagemodel() {
			super();
		}
        
	
	    
	}

