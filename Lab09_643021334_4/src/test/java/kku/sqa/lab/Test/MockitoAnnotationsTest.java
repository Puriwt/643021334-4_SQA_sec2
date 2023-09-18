package kku.sqa.lab.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.service.FavoriteMoive;
import stub.MovieServiceStub;

class MockitoAnnotationsTest {

	@Mock
    private MovieService movieService;

    private FavoriteMoive favoriteMovie;

    @BeforeEach
    public void setUp() {
        // กำหนดการทำงานของ Mock
        MockitoAnnotations.initMocks(this);
        favoriteMovie = new FavoriteMoive(movieService);
    }

    @Test
    public void testGetFilteredMovies() {
        
        Mockito.when(movieService.getMovie("Garfiw", "horror")).thenReturn(
                Arrays.asList("The Conjuring", "Insidious", "Annabelle")
        );

        List<String> filteredMovies = favoriteMovie.getMoviePortal("Garfiw", "horror");

        assertEquals(3, filteredMovies.size());
    }
    
    @Test
    public void testGetFilteredMoviesAction() {
        
        Mockito.when(movieService.getMovie("Garfiw", "action")).thenReturn(
                Arrays.asList("Spider-Man: Into the Spider-Verse", "Red Notice", "Valerian","Star Trek","Salt","Anna","Vesper","Blood Red Sky")
        );

        List<String> filteredMovies = favoriteMovie.getMoviePortal("Garfiw", "action");

        assertEquals(8, filteredMovies.size());
    }
}
