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
public class ma_matricula {
    public Long id_matricula;
    public Long id_usuario;
    public Long id_periodo;
    public Long id_paralelo;
    public Long id_creacion;
    public String f_creeacion;
    public Long id_actualizacion;
    public String matricula_obs;
    public String f_actualizacion;
    public String estado_matricula;
    public Double promedio_matricula;

    public ma_matricula() {
    }

    public ma_matricula(Long id_matricula, Long id_usuario, Long id_periodo, Long id_paralelo, Long id_creacion, String f_creeacion, Long id_actualizacion, String matricula_obs, String f_actualizacion, String estado_matricula, Double promedio_matricula) {
        this.id_matricula = id_matricula;
        this.id_usuario = id_usuario;
        this.id_periodo = id_periodo;
        this.id_paralelo = id_paralelo;
        this.id_creacion = id_creacion;
        this.f_creeacion = f_creeacion;
        this.id_actualizacion = id_actualizacion;
        this.matricula_obs = matricula_obs;
        this.f_actualizacion = f_actualizacion;
        this.estado_matricula = estado_matricula;
        this.promedio_matricula = promedio_matricula;
    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Long id_periodo) {
        this.id_periodo = id_periodo;
    }

    public Long getId_paralelo() {
        return id_paralelo;
    }

    public void setId_paralelo(Long id_paralelo) {
        this.id_paralelo = id_paralelo;
    }

    public Long getId_creacion() {
        return id_creacion;
    }

    public void setId_creacion(Long id_creacion) {
        this.id_creacion = id_creacion;
    }

    public String getF_creeacion() {
        return f_creeacion;
    }

    public void setF_creeacion(String f_creeacion) {
        this.f_creeacion = f_creeacion;
    }

    public Long getId_actualizacion() {
        return id_actualizacion;
    }

    public void setId_actualizacion(Long id_actualizacion) {
        this.id_actualizacion = id_actualizacion;
    }

    public String getMatricula_obs() {
        return matricula_obs;
    }

    public void setMatricula_obs(String matricula_obs) {
        this.matricula_obs = matricula_obs;
    }

    public String getF_actualizacion() {
        return f_actualizacion;
    }

    public void setF_actualizacion(String f_actualizacion) {
        this.f_actualizacion = f_actualizacion;
    }

    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
    }

    public Double getPromedio_matricula() {
        return promedio_matricula;
    }

    public void setPromedio_matricula(Double promedio_matricula) {
        this.promedio_matricula = promedio_matricula;
    }
    
}
