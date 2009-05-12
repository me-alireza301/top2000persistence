/**
 * 
 */
package nl.wowww.top2000.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import nl.wowww.top2000.model.Album;
import nl.wowww.top2000.model.Artist;
import nl.wowww.top2000.model.Song;
import nl.wowww.top2000.testdata.TestDataUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
public class MusicServiceTest {
    
    private MusicService service;

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp() 
     */
    @Before public void setUp() throws Exception {
        String[] xmlFiles = {"/ApplicationContext-dao-test.xml","/ApplicationContext-service-test.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlFiles);
        service = (MusicService)context.getBean("musicService");

    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @After public void tearDown() throws Exception {
        service = null;
    }

    /**
     * Test method for {@link nl.wowww.top2000.service.impl.MusicServiceImpl#saveAlbum(nl.wowww.top2000.model.Album)}.
     */
    @Test public void testSaveAlbum() {
        service.saveAlbum(TestDataUtil.getAlbum());
        List<Album> albums = service.findAllAlbums();
        assertEquals(1, albums.size());
    }

    /**
     * Test method for {@link nl.wowww.top2000.service.impl.MusicServiceImpl#saveArtist(nl.wowww.top2000.model.Artist)}.
     */
    @Test public void testSaveArtist() {
        service.saveArtist(TestDataUtil.getArtist());
        List<Artist> artists = service.findAllArtists();
        assertEquals(1,artists.size());
    }

    /**
     * Test method for {@link nl.wowww.top2000.service.impl.MusicServiceImpl#saveSong(nl.wowww.top2000.model.Song)}.
     */
    @Test public void testSaveSong() {
        service.saveSong(TestDataUtil.getSong1());
        service.saveSong(TestDataUtil.getSong2());
        List<Song> songs = service.findAllSongs();
        assertEquals(6,songs.size());
    }

}
