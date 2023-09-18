package stub;

import kku.sqa.lab.api.MovieService;
import java.util.Arrays;
import java.util.List;

public class MovieServiceStub implements MovieService {

    @Override
    public List<String> getMovie(String username, String playlistName) {
        
        if (username.equals("Puriwat") && playlistName.equals("datenight")) {
            return Arrays.asList("The Notebook", "50 First Dates", "A Walk to Remember", "First Love", "The Lucky One");
            
        } else if (username.equals("Garfiw") && playlistName.equals("horror")) {
            return Arrays.asList("The Conjuring", "Insidious", "Annabelle");
            
        } else if (username.equals("Garfiw") && playlistName.equals("action")) {
            return Arrays.asList("Spider-Man: Into the Spider-Verse", "Red Notice", "Valerian","Star Trek","Salt","Anna","Vesper","Blood Red Sky");
            
        }
        else {
            return Arrays.asList(); 
        }
    }
}
