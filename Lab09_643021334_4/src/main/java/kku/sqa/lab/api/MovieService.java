package kku.sqa.lab.api;

import java.util.List;

public interface MovieService {

	public List<String> getMovie(String username, String playlistName);
}
