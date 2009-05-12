/**
 * 
 */
package nl.wowww.top2000.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nl.wowww.top2000.dao.AlbumDAO;
import nl.wowww.top2000.model.Album;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @Company wowww.nl
 *
 */
public class AlbumDAOImpl implements AlbumDAO {
    
    @PersistenceContext(unitName="top2000")
    private EntityManager em;

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.AlbumDAO#findAll()
     */
    @SuppressWarnings("unchecked")
    public List<Album> findAll() {
        return (List<Album>) em.createQuery("from Album").getResultList();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.AlbumDAO#get(java.io.Serializable)
     */
    public Album get(Serializable id) {
        return em.find(Album.class, id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.AlbumDAO#remove(nl.wowww.top2000.model.Album)
     */
    public void remove(Album album) {
        em.remove(em.getReference(Album.class, album.getId()));
        em.flush();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.AlbumDAO#save(nl.wowww.top2000.model.Album)
     */
    public Album save(Album album) {
        return em.merge(album);
    }

}
