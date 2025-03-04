package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="categorias")
@NamedQuery(name="Categorias.findAll", query="SELECT m FROM Categorias m")
public class Categorias implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cat_id")
    private int cat_id;
    
    @Column(name="cat_nombre")
    private String cat_nombre;

    @Column(name="cat_descripcion")
    private String cat_descripcion;


    public Categorias() {
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }

    public String getCat_descripcion() {
        return cat_descripcion;
    }

    public void setCat_descripcion(String cat_descripcion) {
        this.cat_descripcion = cat_descripcion;
    }

}
