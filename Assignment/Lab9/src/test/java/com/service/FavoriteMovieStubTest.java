//ยศภัทร สองเมือง 663380230-6
package com.service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import service.FavoriteMovie;

public class FavoriteMovieStubTest {
	@Test
    public void testGetMoviesFromPlaylist_Action() {
        MovieServiceStub stub = new MovieServiceStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(stub);

        List<String> actionMovies = favoriteMovie.getMoviesFromPlaylist("john", "action");

        assertEquals(4, actionMovies.size());
        assertTrue(actionMovies.contains("John Wick"));
        assertTrue(actionMovies.contains("The Dark Knight"));
    }

    @Test
    public void testPlaylistNotFound() {
        MovieServiceStub stub = new MovieServiceStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(stub);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            favoriteMovie.getMoviesFromPlaylist("john", "sci-fi");
        });

        assertTrue(exception.getMessage().contains("Playlist 'sci-fi' not found"));
    }

}
