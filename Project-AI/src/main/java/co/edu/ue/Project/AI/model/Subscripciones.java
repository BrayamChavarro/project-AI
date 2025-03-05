package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="subscripciones")
@NamedQuery(name="Subscripciones.findAll", query="SELECT m FROM Subscripciones m")
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


    

    public int getSub_id() {
        return sub_id;
    }




    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }




    public int getUsu_id() {
        return usu_id;
    }




    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }




    public String getSub_tipo_notificacion() {
        return sub_tipo_notificacion;
    }




    public void setSub_tipo_notificacion(String sub_tipo_notificacion) {
        this.sub_tipo_notificacion = sub_tipo_notificacion;
    }




    public String getSub_activo() {
        return sub_activo;
    }




    public void setSub_activo(String sub_activo) {
        this.sub_activo = sub_activo;
    }




    public Subscripciones() {
    }
    

}