package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="notificaciones")
@NamedQuery(name="notificacionesfindAll", query="SELECT m FROM Notificaiones m")
public class Notificaciones implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="not_id")
    private int not_id;

    @Column(name="eve_id")
    private int eve_id;

    @Column(name="usu_id")
    private int usu_id;
    
    @Column(name="not_tipo")
    private String not_tipo;

    @Column(name="not_contenido")
    private String not_contenido;

    @Column(name="not_fecha_envio")
    private String not_fecha_envio;

    @Column(name="not_leida")
    private String not_leida;

    

    public Notificaciones() {
    }
    

}