//ยศภัทร สองเมือง 663380230-6
package service;

import java.util.List;
import java.util.Map;

import api.MovieService;

public class FavoriteMovie {
    private final MovieService movieService;

    public FavoriteMovie(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<String> getMoviesFromPlaylist(String username, String playlistName) {
        Map<String, List<String>> playlists = movieService.getMoviesByPlaylist(username);

        if (playlists.containsKey(playlistName)) {
            return playlists.get(playlistName);
        } else {
            throw new IllegalArgumentException("Playlist '" + playlistName + "' not found for user " + username);
        }
    }
}

