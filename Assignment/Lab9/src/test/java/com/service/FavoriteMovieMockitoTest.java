//ยศภัทร สองเมือง 663380230-6
package com.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import api.MovieService;
import service.FavoriteMovie;


public class FavoriteMovieMockitoTest {

    @Test
    public void testGetMoviesFromPlaylist() {
        MovieService movieService = mock(MovieService.class);

        Map<String, List<String>> playlists = new HashMap<>();
        playlists.put("datenight", Arrays.asList("The Notebook", "50 First Dates"));
        playlists.put("action", Arrays.asList("John Wick", "Mad Max: Fury Road"));

        when(movieService.getMoviesByPlaylist("john")).thenReturn(playlists);

        FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);

        List<String> actionMovies = favoriteMovie.getMoviesFromPlaylist("john", "action");
        assertEquals(2, actionMovies.size());
        assertTrue(actionMovies.contains("John Wick"));
    }
}
