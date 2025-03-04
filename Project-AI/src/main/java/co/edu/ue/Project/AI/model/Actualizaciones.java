package co.edu.ue.Project.AI.model;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="actualizaciones")
@NamedQuery(name="Actualizaciones.findAll", query="SELECT m FROM Actualizaciones m")
public class Actualizaciones implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="act_id")
    private int act_id;

    @Column(name="eve_id")
    private int eve_id;
    
    
    @Column(name="act_tipo_cambio")
    private String act_tipo_cambio;

    @Column(name="act_valor_anterior")
    private String act_valor_anterior;

    @Column(name="act_valor_nuevo")
    private String act_valor_nuevo;

    @Column(name="act_valor_actualizacion")
    private String act_valor_actualizacion;

    public int getAct_id() {
        return act_id;
    }

    public void setAct_id(int act_id) {
        this.act_id = act_id;
    }

    public int getEve_id() {
        return eve_id;
    }

    public void setEve_id(int eve_id) {
        this.eve_id = eve_id;
    }

    public String getAct_tipo_cambio() {
        return act_tipo_cambio;
    }

    public void setAct_tipo_cambio(String act_tipo_cambio) {
        this.act_tipo_cambio = act_tipo_cambio;
    }

    public String getAct_valor_anterior() {
        return act_valor_anterior;
    }

    public void setAct_valor_anterior(String act_valor_anterior) {
        this.act_valor_anterior = act_valor_anterior;
    }

    public String getAct_valor_nuevo() {
        return act_valor_nuevo;
    }

    public void setAct_valor_nuevo(String act_valor_nuevo) {
        this.act_valor_nuevo = act_valor_nuevo;
    }

    public String getAct_valor_actualizacion() {
        return act_valor_actualizacion;
    }

    public void setAct_valor_actualizacion(String act_valor_actualizacion) {
        this.act_valor_actualizacion = act_valor_actualizacion;
    }

    public Actualizaciones() {
    }

}