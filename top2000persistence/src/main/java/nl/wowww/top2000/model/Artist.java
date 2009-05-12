/**
 * 
 */
package nl.wowww.top2000.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author http://www.linkedin.com/in/marcdekwant
 * @company wowww.nl
 *
 */
@Entity
public class Artist implements Serializable {

    private static final long serialVersionUID = -2503712650023924126L;
    private long id;
    private String firstName;
    private String lastName;
    private String artistsName;
    private String age;
    private Set<Album> albums;

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
     * @return the firstName
     */
    public  String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the firstName to set
     */
    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return the lastName
     */
    public  String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the artistsName
     */
    public  String getArtistsName() {
        return artistsName;
    }
    /**
     * @param artistsName the artistsName to set
     */
    public  void setArtistsName(String artistsName) {
        this.artistsName = artistsName;
    }
    /**
     * @return the age
     */
    public  String getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public  void setAge(String age) {
        this.age = age;
    }
    /**
     * @return the albums
     */
    @OneToMany(mappedBy="artist",cascade=CascadeType.ALL)
    public  Set<Album> getAlbums() {
        return albums;
    }
    /**
     * @param albums the albums to set
     */
    public  void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
    
}
