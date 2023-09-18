package kku.sqa.lab.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.service.FavoriteMoive;
import stub.MovieServiceStub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FavoriteMovieTest {

    private FavoriteMoive favoriteMovie;
    private MovieService movieService;

    @BeforeEach
    public void setUp() {
        movieService = new MovieServiceStub();
        favoriteMovie = new FavoriteMoive(movieService);
    }

    @Test
    public void testGetFilteredMovies_user1() {
        List<String> filteredMovies = favoriteMovie.getMoviePortal("Puriwat", "datenight");
        assertEquals(5, filteredMovies.size());
        favoriteMovie.printMoviesInPlaylist("Puriwat", "datenight");
    }
    
    @Test
    public void testGetFilteredMovies_user2() {
        List<String> filteredMovies = favoriteMovie.getMoviePortal("Garfiw", "action");
        assertEquals(8, filteredMovies.size());
        favoriteMovie.printMoviesInPlaylist("Garfiw", "action");
    }
    
}
