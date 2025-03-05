package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="monitoreo")
@NamedQuery(name="Monitoreo.findAll", query="SELECT m FROM Monitoreo m")
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

    

    public int getMon_id() {
        return mon_id;
    }



    public void setMon_id(int mon_id) {
        this.mon_id = mon_id;
    }



    public int getFue_id() {
        return fue_id;
    }



    public void setFue_id(int fue_id) {
        this.fue_id = fue_id;
    }



    public String getMon_fecha_monitoreo() {
        return mon_fecha_monitoreo;
    }



    public void setMon_fecha_monitoreo(String mon_fecha_monitoreo) {
        this.mon_fecha_monitoreo = mon_fecha_monitoreo;
    }



    public String getMon_estado() {
        return mon_estado;
    }



    public void setMon_estado(String mon_estado) {
        this.mon_estado = mon_estado;
    }



    public String getMon_resultado() {
        return mon_resultado;
    }



    public void setMon_resultado(String mon_resultado) {
        this.mon_resultado = mon_resultado;
    }



    public Monitoreo() {
    }
    

}