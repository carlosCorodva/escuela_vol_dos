/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades;

/**
 *
 * @author carlos
 */
public class bloqueo {
    private Long id_bloqueo;
    private Long matricula;
    private Long calificacion;
    private Long id_sucursal_bloqueo;

    public bloqueo() {
    }

    public bloqueo(Long id_bloqueo, Long matricula, Long calificacion, Long id_sucursal_bloqueo) {
        this.id_bloqueo = id_bloqueo;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.id_sucursal_bloqueo = id_sucursal_bloqueo;
    }

    public Long getId_bloqueo() {
        return id_bloqueo;
    }

    public void setId_bloqueo(Long id_bloqueo) {
        this.id_bloqueo = id_bloqueo;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public Long getId_sucursal_bloqueo() {
        return id_sucursal_bloqueo;
    }

    public void setId_sucursal_bloqueo(Long id_sucursal_bloqueo) {
        this.id_sucursal_bloqueo = id_sucursal_bloqueo;
    }


    
}
