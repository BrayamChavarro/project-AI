package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="fuentes")
@NamedQuery(name="Fuentes.findAll", query="SELECT m FROM Fuentes m")
public class Fuentes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="fue_id")
    private int fue_id;

    @Column(name="fue_nombre")
    private String fue_nombre;
    
    @Column(name="fue_url")
    private String fue_url;

    @Column(name="fue_tipo")
    private String fue_tipo;

    @Column(name="fue_activo")
    private String fue_activo;

    @Column(name="fue_parametros_extraccion")
    private String fue_parametros_extraccion;

    @Column(name="fue_ultimo_escaneo")
    private String fue_ultimo_escaneo;


    public Fuentes() {
    }
    

}