package com.gipher.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gipher.model.Imagemodel;
import com.gipher.repository.ImageRepository;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "image")
public class ImageController {

	@Autowired
    ImageRepository imageRepository;

    @PostMapping("/upload")
    public Imagemodel uplaodImage(@RequestParam("myFile") MultipartFile file) throws IOException {

        Imagemodel img = new Imagemodel( file.getOriginalFilename(),file.getContentType(),file.getBytes() );


        final Imagemodel savedImage = imageRepository.save(img);


       


        return savedImage;


}
}