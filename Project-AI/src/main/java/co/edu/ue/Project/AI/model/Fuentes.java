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


    public int getFue_id() {
        return fue_id;
    }


    public void setFue_id(int fue_id) {
        this.fue_id = fue_id;
    }


    public String getFue_nombre() {
        return fue_nombre;
    }


    public void setFue_nombre(String fue_nombre) {
        this.fue_nombre = fue_nombre;
    }


    public String getFue_url() {
        return fue_url;
    }


    public void setFue_url(String fue_url) {
        this.fue_url = fue_url;
    }


    public String getFue_tipo() {
        return fue_tipo;
    }


    public void setFue_tipo(String fue_tipo) {
        this.fue_tipo = fue_tipo;
    }


    public String getFue_activo() {
        return fue_activo;
    }


    public void setFue_activo(String fue_activo) {
        this.fue_activo = fue_activo;
    }


    public String getFue_parametros_extraccion() {
        return fue_parametros_extraccion;
    }


    public void setFue_parametros_extraccion(String fue_parametros_extraccion) {
        this.fue_parametros_extraccion = fue_parametros_extraccion;
    }


    public String getFue_ultimo_escaneo() {
        return fue_ultimo_escaneo;
    }


    public void setFue_ultimo_escaneo(String fue_ultimo_escaneo) {
        this.fue_ultimo_escaneo = fue_ultimo_escaneo;
    }


    public Fuentes() {
    }
    

}