/**
 * 
 */
package nl.wowww.top2000.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
@Entity
public class Song implements Serializable {

    private static final long serialVersionUID = -3910617135533497145L;
    private long id;
    private String title;
    private long duration;
    private String lyricsUrl;
    private String youTubeUrl;
    private Album album;

    /**
     * @return the album
     */
    @ManyToOne
    protected  Album getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    protected  void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public  long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public  void setId(long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public  String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public  void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the duration
     */
    public  long getDuration() {
        return duration;
    }
    /**
     * @param duration the duration to set
     */
    public  void setDuration(long duration) {
        this.duration = duration;
    }
    /**
     * @return the lyricsUrl
     */
    public  String getLyricsUrl() {
        return lyricsUrl;
    }
    /**
     * @param lyricsUrl the lyricsUrl to set
     */
    public  void setLyricsUrl(String lyricsUrl) {
        this.lyricsUrl = lyricsUrl;
    }
    /**
     * @return the youTubeUrl
     */
    public  String getYouTubeUrl() {
        return youTubeUrl;
    }
    /**
     * @param youTubeUrl the youTubeUrl to set
     */
    public  void setYouTubeUrl(String youTubeUrl) {
        this.youTubeUrl = youTubeUrl;
    }
    
    
    
}
