/**
 * 
 */
package nl.wowww.top2000.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
@Entity
public class Album implements Serializable {
    
    private static final long serialVersionUID = -1282037587218835083L;
    private long id;
    private String title;
    private Date publishDate;
    private Set<Song> songs;
    private String cddbUrl;
    private Artist artist;
    
    /**
     * @return the artist
     */
    @ManyToOne
    protected  Artist getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    protected  void setArtist(Artist artist) {
        this.artist = artist;
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
     * @return the publishDate
     */
    public  Date getPublishDate() {
        return publishDate;
    }
    /**
     * @param publishDate the publishDate to set
     */
    public  void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    /**
     * @return the songs
     */
    @OneToMany(mappedBy="album",cascade=CascadeType.ALL)
    public  Set<Song> getSongs() {
        return songs;
    }
    /**
     * @param songs the songs to set
     */
    public  void setSongs(Set<Song> songs) {
        this.songs = songs;
    }
    /**
     * @return the cddbUrl
     */
    public  String getCddbUrl() {
        return cddbUrl;
    }
    /**
     * @param cddbUrl the cddbUrl to set
     */
    public  void setCddbUrl(String cddbUrl) {
        this.cddbUrl = cddbUrl;
    }
    
    
    

}
