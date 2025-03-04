package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="monitoreo")
@NamedQuery(name="monitoreo.findAll", query="SELECT m FROM Monitoreo m")
public class Monitoreo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="mon_id")
    private int mon_id;

    @Column(name="fue_id")
    private int fue_id;
    
    @Column(name="mon_fecha_monitoreo")
    private String mon_fecha_monitoreo;

    @Column(name="mon_estado")
    private String mon_estado;

    @Column(name="mon_resultado")
    private String mon_resultado;

    

    public Monitoreo() {
    }
    

}