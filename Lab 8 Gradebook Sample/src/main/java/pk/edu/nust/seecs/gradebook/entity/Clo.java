package pk.edu.nust.seecs.gradebook.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;

/**
 * Returns a Course Learning Outcome entity object. 
 * <p>
 This entity class holds the general attributes of a clo. 
 Contained in this class are attributes such as name, description, plo, and BTLevel.
 */
@Entity
public class Clo implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "clo_id")
    
    private Integer cloId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String plo;
    @Column
    private String btLevel;
    /*
    * Class constructor that takes in a name, description, plo and btlevel to 
    * build this object
    */
    public Clo(String name, String description, String plo, String btLevel) {
        this.name = name;
        this.description = description;
        this.plo = plo;
        this.btLevel = btLevel;
    }
    /*
    * Class constructor.
    */
    public Clo() {
    }
    /*
    * Class constructor that creates this object by passing a string name.
    */
    public Clo(String name) {
        this.name = name;
    }
    /*
    * This method will return the id of this Course Learning Outcome.
    * Note; we have not defined any setter method for clo id, since it is 
    * to be generated by the dbms.
    */
    public Integer getCloId() {
        return cloId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlo() {
        return plo;
    }

    public void setPlo(String plo) {
        this.plo = plo;
    }

    public String getBtLevel() {
        return btLevel;
    }

    public void setBtLevel(String btLevel) {
        this.btLevel = btLevel;
    }

    @Override
    public String toString() {
        return "Clo{" + "cloId=" + cloId + ", name=" + name + ", description=" + description + ", plo=" + plo + ", btLevel=" + btLevel + '}';
    }
    public String csv(){
    return cloId+","+name+","+description+","+plo+","+btLevel;
    
    }

}
