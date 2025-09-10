//ยศภัทร สองเมือง 663380230-6
package api;

import java.util.List;
import java.util.Map;

public interface MovieService {
	Map<String, List<String>> getMoviesByPlaylist(String username);
}
