/**
 * 
 */
package nl.wowww.top2000.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nl.wowww.top2000.dao.ArtistDAO;
import nl.wowww.top2000.model.Artist;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @Company wowww.nl
 *
 */
public class ArtistDAOImpl implements ArtistDAO {
    
    @PersistenceContext(unitName="top2000")
    private EntityManager em;

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#findAll()
     */
    @SuppressWarnings("unchecked")
    public List<Artist> findAll() {
        return (List<Artist>) em.createQuery("from Artist").getResultList();
    }
    
    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#findAllArtistsSortByArtistsName(boolean)
     */
    @SuppressWarnings("unchecked")
    public List<Artist> findAllArtistsSortByArtistsName(boolean flag) {
        return (List<Artist>) em.createQuery("from Artist order by artistsName " + ((flag)?"desc":"asc")).getResultList();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#findAllArtistsSortByAge(boolean)
     */
    @SuppressWarnings("unchecked")
    public List<Artist> findAllArtistsSortByAge(boolean flag) {
        return (List<Artist>) em.createQuery("from Artist order by age " + ((flag)?"desc":"asc")).getResultList();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#get(java.io.Serializable)
     */
    public Artist get(Serializable id) {
        return em.find(Artist.class, id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#remove(nl.wowww.top2000.model.Artist)
     */
    public void remove(Artist artist) {
        artist = em.getReference(Artist.class, artist.getId());
        em.remove(artist);
        em.flush();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.dao.ArtistDAO#save(nl.wowww.top2000.model.Artist)
     */
    public Artist save(Artist artist) {
        return em.merge(artist);
    }

}
