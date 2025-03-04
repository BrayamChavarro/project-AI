package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="eventos")
@NamedQuery(name="Eventos.findAll", query="SELECT m FROM Eventos m")
public class Eventos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="eve_id")
    private int eve_id;

    @Column(name="fue_id")
    private int fue_id;
    
    @Column(name="eve_titulo")
    private String eve_titulo;

    @Column(name="eve_descripcion")
    private String eve_descripcion;

    @Column(name="eve_fecha_inicio")
    private String eve_fecha_inicio;

    @Column(name="eve_fecha_fin")
    private String eve_fecha_fin;

    @Column(name="eve_ubicacion")
    private String eve_ubicacion;

    @Column(name="eve_enlace")
    private String eve_enlace;

    @Column(name="eve_fecha_creacion")
    private String eve_fecha_creacion;

    @Column(name="eve_fecha_modificacion")
    private String eve_fecha_modificacion;

    @Column(name="eve_estado")
    private String eve_estado;

    public Eventos() {
    }
    

}