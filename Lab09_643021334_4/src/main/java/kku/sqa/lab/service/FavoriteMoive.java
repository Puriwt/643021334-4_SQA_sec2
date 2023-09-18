package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.MovieService;

public class FavoriteMoive {
	
	private MovieService movieservice;
	
	public FavoriteMoive (MovieService movieservice) {
		super();
		this.movieservice = movieservice;
	}
	
	public List<String> getMoviePortal(String username, String playlistName) {
        List<String> MoviePortal = new ArrayList<>();
        List<String> allMovies = movieservice.getMovie(username, playlistName);

        // คัดกรองรายการภาพยนต์ตาม playlistName
        for (String movie : allMovies) {
        	MoviePortal.add(movie);
        }

        return MoviePortal;
    }
	// แสดงชื่อผู้ใช้งาน,เพลย์ลิสและชือหนัง
	public void printMoviesInPlaylist(String username, String playlistName) {
        List<String> movies = getMoviePortal(username, playlistName);

        if (movies.isEmpty()) {
            System.out.println("No movies found in the playlist.");
        } else {
            System.out.println("Movies in the " + playlistName + " playlist By " + username +":");
            for (String movie : movies) {
                System.out.println(movie);
            }
        }
    }
}
