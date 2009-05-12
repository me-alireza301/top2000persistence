/**
 * 
 */
package nl.wowww.top2000.dao;

import java.io.Serializable;
import java.util.List;

import nl.wowww.top2000.model.Album;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @Company wowww.nl
 *
 */
public interface AlbumDAO {

    Album get(Serializable id);
    List<Album> findAll();
    Album save(Album album);
    void remove(Album album);
    
}
