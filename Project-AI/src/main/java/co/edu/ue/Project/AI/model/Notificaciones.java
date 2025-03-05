package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="notificaciones")
@NamedQuery(name="Notificaciones.findAll", query="SELECT m FROM Notificaciones m")
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

    public int getNot_id() {
        return not_id;
    }

    public void setNot_id(int not_id) {
        this.not_id = not_id;
    }

    public int getEve_id() {
        return eve_id;
    }

    public void setEve_id(int eve_id) {
        this.eve_id = eve_id;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getNot_tipo() {
        return not_tipo;
    }

    public void setNot_tipo(String not_tipo) {
        this.not_tipo = not_tipo;
    }

    public String getNot_contenido() {
        return not_contenido;
    }

    public void setNot_contenido(String not_contenido) {
        this.not_contenido = not_contenido;
    }

    public String getNot_fecha_envio() {
        return not_fecha_envio;
    }

    public void setNot_fecha_envio(String not_fecha_envio) {
        this.not_fecha_envio = not_fecha_envio;
    }

    public String getNot_leida() {
        return not_leida;
    }

    public void setNot_leida(String not_leida) {
        this.not_leida = not_leida;
    }

    public Notificaciones() {
    }
}