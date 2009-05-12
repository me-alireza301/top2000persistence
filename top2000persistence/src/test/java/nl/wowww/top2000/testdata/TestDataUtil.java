/**
 * 
 */
package nl.wowww.top2000.testdata;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;

import nl.wowww.top2000.model.Album;
import nl.wowww.top2000.model.Artist;
import nl.wowww.top2000.model.Song;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
@Ignore
public class TestDataUtil {
    
    public static Artist getArtist() {
        Artist artist = new Artist();
        artist.setAge("25");
        artist.setArtistsName("ArtistName");
        artist.setFirstName("Sjonnie");
        artist.setLastName("luidspreker");
        Set<Album> albums = new HashSet<Album>();
        albums.add(getAlbum());
        artist.setAlbums(albums);
        return artist;
    }
    
    public static Album getAlbum() {
        Album album = new Album();
        album.setPublishDate(new Date());
        album.setTitle("Album title");
        album.setCddbUrl("http//:test.org");
        Set<Song> songs = new HashSet<Song>();
        songs.add(getSong1());
        songs.add(getSong2());
        album.setSongs(songs);
        return album;
    }
    
    public static Song getSong1() {
        Song song = new Song();
        song.setTitle("My test Song");
        song.setDuration(180);
        song.setLyricsUrl("http://test.org");
        song.setYouTubeUrl("http://test.org");
        return song;       
    }
    
    public static Song getSong2() {
        Song song = new Song();
        song.setTitle("My NEXT test Song");
        song.setDuration(60);
        song.setLyricsUrl("http://test.org");
        song.setYouTubeUrl("http://test.org");
        return song;       
    }
    
   

}
