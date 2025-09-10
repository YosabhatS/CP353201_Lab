//ยศภัทร สองเมือง 663380230-6
package com.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import api.MovieService;

public class MovieServiceStub implements MovieService {
    @Override
    public Map<String, List<String>> getMoviesByPlaylist(String username) {
        Map<String, List<String>> playlists = new HashMap<>();

        playlists.put("datenight", Arrays.asList(
                "The Notebook", "50 First Dates", "A Walk to Remember", "First Love", "The Lucky One"
        ));

        playlists.put("horror", Arrays.asList(
                "The Conjuring", "Insidious", "It", "A Quiet Place"
        ));

        playlists.put("action", Arrays.asList(
                "Mad Max: Fury Road", "John Wick", "Die Hard", "The Dark Knight"
        ));

        return playlists;
    }
}