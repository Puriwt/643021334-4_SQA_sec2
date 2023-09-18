package kku.sqa.lab.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.service.FavoriteMoive;

class MockclassTest {

	//วิธีตาม ตัวอย่าง
	
	@Test
	void testUsingMockito_1() {
		MovieService movieservice = mock(MovieService.class);
		List<String> MoviePortal = Arrays.asList("The Notebook", "50 First Dates", "A Walk to Remember", "First Love", "The Lucky One");
		
		when(movieservice.getMovie("Puriwat", "datenight")).thenReturn(MoviePortal);
		
		FavoriteMoive favoritemoive = new FavoriteMoive(movieservice);
		List<String>datenightlist = favoritemoive.getMoviePortal("Puriwat", "datenight");
		
		assertEquals(5, datenightlist.size());
	}
	
	@Test
	void testUsingMockito_user2() {
		MovieService movieservice = mock(MovieService.class);
		List<String> MoviePortal = Arrays.asList("The Conjuring", "Insidious", "Annabelle");
		
		when(movieservice.getMovie("Garfiw", "horror")).thenReturn(MoviePortal);
		
		FavoriteMoive favoritemoive = new FavoriteMoive(movieservice);
		List<String>horrorlist = favoritemoive.getMoviePortal("Garfiw", "horror");
		
		assertEquals(3, horrorlist.size());
	}
	
	@Test
	void testAction() {
		MovieService movieservice = mock(MovieService.class);
		List<String> MoviePortal = Arrays.asList("Spider-Man: Into the Spider-Verse", "Red Notice", "Valerian","Star Trek","Salt","Anna","Vesper","Blood Red Sky");
		
		when(movieservice.getMovie("Garfiw", "action")).thenReturn(MoviePortal);
		
		FavoriteMoive favoritemoive = new FavoriteMoive(movieservice);
		List<String>actionlist = favoritemoive.getMoviePortal("Garfiw", "action");
		
		assertEquals(8, actionlist.size());
	}

}
