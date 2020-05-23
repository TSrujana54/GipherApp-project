package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repository.RecommendRepo;
import com.example.demo.service.RecommendService;


@RunWith(SpringRunner.class)
@SpringBootTest
class RecommendedSpringApplicationTests {
	
	@Autowired
	private RecommendService rs;
	
	
	@MockBean
	private RecommendRepo rr;
	
	

	@Test
	void contextLoads() {
		
	//	when(rr.findAll()).thenReturn(Stream.of(new ))
	}

}
