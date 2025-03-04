package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuarios.findAll", query="SELECT m FROM Usuarios m")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="usu_id")
    private int usu_id;
    
    @Column(name="usu_nombre")
    private String usu_nombre;

    @Column(name="usu_email")
    private String usu_email;

    @Column(name="usu_preferencias_notificacion")
    private String usu_preferencias_notificacion;

    @Column(name="usu_fecha_registro")
    private String usu_fecha_registro;

    public Usuarios() {
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_preferencias_notificacion() {
        return usu_preferencias_notificacion;
    }

    public void setUsu_preferencias_notificacion(String usu_preferencias_notificacion) {
        this.usu_preferencias_notificacion = usu_preferencias_notificacion;
    }

    public String getUsu_fecha_registro() {
        return usu_fecha_registro;
    }

    public void setUsu_fecha_registro(String usu_fecha_registro) {
        this.usu_fecha_registro = usu_fecha_registro;
    }
}