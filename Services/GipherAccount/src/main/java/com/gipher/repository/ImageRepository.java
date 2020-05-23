package com.gipher.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gipher.model.Imagemodel;





public interface ImageRepository extends JpaRepository<Imagemodel, Long> 
{
     
}