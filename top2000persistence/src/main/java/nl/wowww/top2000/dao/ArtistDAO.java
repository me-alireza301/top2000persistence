/**
 * 
 */
package nl.wowww.top2000.dao;

import java.io.Serializable;
import java.util.List;

import nl.wowww.top2000.model.Artist;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @Company wowww.nl
 *
 */
public interface ArtistDAO {

    Artist get(Serializable id);
    List<Artist> findAll();
    Artist save(Artist artist);
    void remove(Artist artist);
    List<Artist> findAllArtistsSortByArtistsName(boolean flag);
    List<Artist> findAllArtistsSortByAge(boolean flag);
    
}
