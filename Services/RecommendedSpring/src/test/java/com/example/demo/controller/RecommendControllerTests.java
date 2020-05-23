package com.example.demo.controller;
//
//
//
////package com.team2.gipher.controller;
//
//
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.verifyNoMoreInteractions;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.demo.model.Recommend;
//import com.example.demo.service.RecommendService;
//import com.fasterxml.jackson.databind.ObjectMapper;
////import com.team2.gipher.model.Favourite;
////import com.team2.gipher.service.FavouriteService;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = RecommendController.class)
//
////@WebMvcTest(controllers = FavouriteController.class)
////public class FavouriteControllerTest {
	public class RecommendControllerTests {
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private RecommendService service;
//	private List<Recommend> listfav;
//	private  Recommend fav;
//	private Optional<Recommend> optfav;
//	private String token;
//	
//	@Before
//	public void setUp() throws Exception {
//		token=Jwts.builder().setId("padma").setIssuedAt(new Date())
//				.signWith(SignatureAlgorithm.HS256, "usersecretkey").compact();
//		fav = new Recommend();
//		fav.setId("1004");
//		fav.setUsername("sariarun");
//		fav.setRating("g");
//		fav.setImages("image");
//		
//	}
//	
//	@After
//	public void tearDown() throws Exception {
//	}
//	
//	@Test
//	public void testAddBookToFavSuccess() throws Exception
//	{
//		when(service.saveFavourite(Mockito.any(Recommend.class)))
//		.thenReturn(fav);
//		String favourjson= new ObjectMapper().writeValueAsString(fav);
//		mockMvc.perform(post("/favour/addToFavourite").header("Authorization","Bearer " +token)
//		            .contentType(MediaType.APPLICATION_JSON)
//		            .content(favourjson))
//                    .andExpect(status().isCreated());
//		verify(service).saveFavourite(Mockito.any(Recommend.class));
//		verifyNoMoreInteractions(service);
//	}
//	
//	@Test
//	public void testAddBookToFavFailure() throws Exception 
//	{
//		when(service.saveFavourite(Mockito.any(Recommend.class))).
//				thenReturn(null);
//		String favjson=new ObjectMapper().writeValueAsString(fav);
//		mockMvc.perform(post("/favour/addToFavourite").header("Authorization","Bearer " +token)
//		       .contentType(MediaType.APPLICATION_JSON)
//                .content(favjson))
//				.andExpect(status().isInternalServerError())
//				.andDo(print());
//		verify(service).saveFavourite(Mockito.any(Recommend.class));
//	}
//
////	@Test
////	public void testDeleteFav() throws Exception 
////	{
////		when(service.deleteFromFavourite(Mockito.anyString(),Mockito.anyString())).thenReturn(fav);
////		mockMvc.perform(delete("/favour/deleteFromFavourite/1004/saiarun").header("Authorization","Bearer " +token))
////		.andDo(print());
////          verify(service,times(1)).deleteFromFavourite(Mockito.anyString(),Mockito.anyString());
////    }
//	
//	@Test
//	public void testGetBYNameAndId() throws Exception  
//	{
//		when(service.getFavouriteByIdAndUsername(Mockito.anyString(),Mockito.anyString())).thenReturn(listfav);
//		mockMvc.perform(get("/favour/getFavouriteByIdAndUsername/1004/saiarun").header("Authorization","Bearer " +token))
//		.andExpect(status().isOk())
//		.andDo(print());
//          verify(service,times(1)).getFavouriteByIdAndUsername(Mockito.anyString(),Mockito.anyString());
//	}
//	
//	@Test(expected=Exception.class)
//	public void testGetBYNameAndIdFailure() throws Exception 
//	{
//		when(service.getFavouriteByIdAndUsername(Mockito.anyString(),Mockito.anyString()))
//		           .thenReturn(null).thenThrow(Exception.class);
//		String favjson=new ObjectMapper().writeValueAsString(listfav);
//		mockMvc.perform(get("/favour/getFavouriteByIdAndUsernam/1004/saiarun").header("Authorization","Bearer " +token)
//			    .contentType(MediaType.APPLICATION_JSON)
//                .content(favjson))
//				.andExpect(status().isConflict())
//				.andDo(print());
//          verify(service,times(1)).getFavouriteByIdAndUsername(Mockito.anyString(),Mockito.anyString());
//	}
}