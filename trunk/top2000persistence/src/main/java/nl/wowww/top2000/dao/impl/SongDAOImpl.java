/**
 * 
 */
package nl.wowww.top2000.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nl.wowww.top2000.dao.SongDAO;
import nl.wowww.top2000.model.Song;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
public class SongDAOImpl implements SongDAO {
    
    @PersistenceContext(unitName="top2000")
    private EntityManager em;

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.SongDAO#findAll()
     */
    @SuppressWarnings("unchecked")
    public List<Song> findAll() {
        return (List<Song>) em.createQuery("from Song").getResultList();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.SongDAO#get(java.io.Serializable)
     */
    public Song get(Serializable id) {
        return em.find(Song.class, id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.SongDAO#remove(nl.wowww.top2000.model.Song)
     */
    public void remove(Song song) {
        em.remove(em.getReference(Song.class, song.getId()));
        em.flush();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.SongDAO#save(nl.wowww.top2000.model.Song)
     */
    public Song save(Song song) {
        return em.merge(song);
    }

}
