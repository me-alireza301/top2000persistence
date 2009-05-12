/**
 * 
 */
package nl.wowww.top2000.dao;

import java.io.Serializable;
import java.util.List;

import nl.wowww.top2000.model.Song;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @Company wowww.nl
 *
 */
public interface SongDAO {

    Song get(Serializable id);
    List<Song> findAll();
    Song save(Song song);
    void remove(Song song);
    
}
