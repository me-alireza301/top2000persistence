/**
 * 
 */
package nl.wowww.top2000.service;

import java.util.List;

import nl.wowww.top2000.model.Album;
import nl.wowww.top2000.model.Artist;
import nl.wowww.top2000.model.Song;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
public interface MusicService {

    List<Artist> findAllArtists();
    List<Album> findAllAlbums();
    List<Song> findAllSongs();
    
    List<Artist> findAllArtistsSortByArtistsName(boolean flag);
    List<Artist> findAllArtistsSortByAge(boolean flag);
    
    Artist getArtist(long id);
    Album getAlbum(long id);
    Song getSong(long id);
    
    Artist saveArtist(Artist artist);
    Album saveAlbum(Album album);
    Song saveSong(Song song);
    
    void deleteArtist(Artist artist);
    void deleteAlbum(Album album);
    void deleteSong(Song song);
    
    void deleteArtists(List<Artist> artists);
    void deleteAlbums(List<Album> albums);
    void deleteSongs(List<Song> songs);
    
}
