/**
 * 
 */
package nl.wowww.top2000.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import nl.wowww.top2000.dao.AlbumDAO;
import nl.wowww.top2000.dao.ArtistDAO;
import nl.wowww.top2000.dao.SongDAO;
import nl.wowww.top2000.model.Album;
import nl.wowww.top2000.model.Artist;
import nl.wowww.top2000.model.Song;
import nl.wowww.top2000.service.MusicService;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
@Transactional
public class MusicServiceImpl implements MusicService {
    
	@Autowired
    private ArtistDAO artistDAO;
	@Autowired
    private AlbumDAO albumDAO;
	@Autowired
    private SongDAO songDAO;

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteAlbum(nl.wowww.top2000.model.Album)
     */
    public final void deleteAlbum(Album album) {
        albumDAO.remove(album);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteArtist(nl.wowww.top2000.model.Artist)
     */
    public final void deleteArtist(Artist artist) {
        artistDAO.remove(artist);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteSong(nl.wowww.top2000.model.Song)
     */
    public final void deleteSong(Song song) {
        songDAO.remove(song);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#findAllAlbums()
     */
    public final List<Album> findAllAlbums() {
        return albumDAO.findAll();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#findAllArtists()
     */
    public final List<Artist> findAllArtists() {
        return artistDAO.findAll();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#findAllSongs()
     */
    public final List<Song> findAllSongs() {
        return songDAO.findAll();
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#getAlbum(long)
     */
    public final Album getAlbum(long id) {
        return albumDAO.get(id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#getArtist(long)
     */
    public final Artist getArtist(long id) {
        return artistDAO.get(id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#getSong(long)
     */
    public final Song getSong(long id) {
        return songDAO.get(id);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#saveAlbum(nl.wowww.top2000.model.Album)
     */
    public final Album saveAlbum(Album album) {
        return albumDAO.save(album);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#saveArtist(nl.wowww.top2000.model.Artist)
     */
    public final Artist saveArtist(Artist artist) {
        return artistDAO.save(artist);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#saveSong(nl.wowww.top2000.model.Song)
     */
    public final Song saveSong(Song song) {
        return songDAO.save(song);
    }
    
    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteArtists(java.util.List)
     */
    public void deleteArtists(List<Artist> artists) {
        for (Artist artist : artists) {
            artistDAO.remove(artist);
        }
     }
    
    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteAlbums(java.util.List)
     */
    public void deleteAlbums(List<Album> albums) {
        for (Album album : albums) {
            albumDAO.remove(album);
        }
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#deleteSongs(java.util.List)
     */
    public void deleteSongs(List<Song> songs) {
        for (Song song : songs) {
            songDAO.remove(song);
        }
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#findAllArtistsSortByAge(boolean)
     */
    public List<Artist> findAllArtistsSortByAge(boolean flag) {
        return artistDAO.findAllArtistsSortByAge(flag);
    }

    /* (non-Javadoc)
     * @see nl.wowww.top2000.service.MusicService#findAllArtistsSortByArtistsName(boolean)
     */
    public List<Artist> findAllArtistsSortByArtistsName(boolean flag) {
        return artistDAO.findAllArtistsSortByArtistsName(flag);
    }

    /**
     * @param artistDAO the artistDAO to set
     */
    public final void setArtistDAO(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    /**
     * @param albumDAO the albumDAO to set
     */
    public final void setAlbumDAO(AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }

    /**
     * @param songDAO the songDAO to set
     */
    public final void setSongDAO(SongDAO songDAO) {
        this.songDAO = songDAO;
    }
    
    

}
