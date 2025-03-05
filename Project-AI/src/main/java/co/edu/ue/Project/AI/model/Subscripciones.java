package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="subscripciones")
@NamedQuery(name="SubscripcionesfindAll", query="SELECT m FROM Subscripciones m")
public class Subscripciones implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="sub_id")
    private int sub_id;

    @Column(name="usu_id")
    private int usu_id;
    
    @Column(name="sub_tipo_notificacion")
    private String sub_tipo_notificacion;

    @Column(name="sub_activo")
    private String sub_activo;


    

    public Subscripciones() {
    }
    

}