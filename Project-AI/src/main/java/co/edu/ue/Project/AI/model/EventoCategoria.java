package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="evento_categoria")
@NamedQuery(name="EventoCategoria.findAll", query="SELECT m FROM EventoCategoria m")
public class EventoCategoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="eventcat_id")
    private int eventcat_id;

    @Column(name="eve_id")
    private int eve_id;

    @Column(name="cat_id")
    private int cat_id;
    

    

    public int getEventcat_id() {
        return eventcat_id;
    }




    public void setEventcat_id(int eventcat_id) {
        this.eventcat_id = eventcat_id;
    }
    public int getEve_id() {
        return eve_id;
    }




    public void setEve_id(int eve_id) {
        this.eve_id = eve_id;
    }




    public int getCat_id() {
        return cat_id;
    }




    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }




    public EventoCategoria() {
    }
    

}