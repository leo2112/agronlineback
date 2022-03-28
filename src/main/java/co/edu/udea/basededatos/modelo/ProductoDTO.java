package co.edu.udea.basededatos.modelo;

import co.edu.udea.basededatos.entity.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductoDTO {

    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private BigDecimal costo;
    private String observacion;
    @NotNull
    private Boolean disponible;
    @NotNull
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Long fkAdministrador;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario administrador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Long getFkAdministrador() {
        return fkAdministrador;
    }

    public void setFkAdministrador(Long fkAdministrador) {
        this.fkAdministrador = fkAdministrador;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }
}
