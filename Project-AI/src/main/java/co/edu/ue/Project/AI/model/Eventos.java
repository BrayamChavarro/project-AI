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

    public int getEve_id() {
        return eve_id;
    }

    public void setEve_id(int eve_id) {
        this.eve_id = eve_id;
    }

    public int getFue_id() {
        return fue_id;
    }

    public void setFue_id(int fue_id) {
        this.fue_id = fue_id;
    }

    public String getEve_titulo() {
        return eve_titulo;
    }

    public void setEve_titulo(String eve_titulo) {
        this.eve_titulo = eve_titulo;
    }

    public String getEve_descripcion() {
        return eve_descripcion;
    }

    public void setEve_descripcion(String eve_descripcion) {
        this.eve_descripcion = eve_descripcion;
    }

    public String getEve_fecha_inicio() {
        return eve_fecha_inicio;
    }

    public void setEve_fecha_inicio(String eve_fecha_inicio) {
        this.eve_fecha_inicio = eve_fecha_inicio;
    }

    public String getEve_fecha_fin() {
        return eve_fecha_fin;
    }

    public void setEve_fecha_fin(String eve_fecha_fin) {
        this.eve_fecha_fin = eve_fecha_fin;
    }

    public String getEve_ubicacion() {
        return eve_ubicacion;
    }

    public void setEve_ubicacion(String eve_ubicacion) {
        this.eve_ubicacion = eve_ubicacion;
    }

    public String getEve_enlace() {
        return eve_enlace;
    }

    public void setEve_enlace(String eve_enlace) {
        this.eve_enlace = eve_enlace;
    }

    public String getEve_fecha_creacion() {
        return eve_fecha_creacion;
    }

    public void setEve_fecha_creacion(String eve_fecha_creacion) {
        this.eve_fecha_creacion = eve_fecha_creacion;
    }

    public String getEve_fecha_modificacion() {
        return eve_fecha_modificacion;
    }

    public void setEve_fecha_modificacion(String eve_fecha_modificacion) {
        this.eve_fecha_modificacion = eve_fecha_modificacion;
    }

    public String getEve_estado() {
        return eve_estado;
    }

    public void setEve_estado(String eve_estado) {
        this.eve_estado = eve_estado;
    }

    public Eventos() {
    }
    

}