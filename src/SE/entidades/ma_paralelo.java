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
public class ma_paralelo {
    private Long id_paralelo;
    private String paralelo;
    private String estado_pa;
    private String paralelo_obs;
    private Long id_creacion;
    private Long id_actualizacion;
    private Long nivel;

    public ma_paralelo() {
    }

    public ma_paralelo(Long id_paralelo, String paralelo, String estado_pa, String paralelo_obs, Long id_creacion, Long id_actualizacion, Long nivel) {
        this.id_paralelo = id_paralelo;
        this.paralelo = paralelo;
        this.estado_pa = estado_pa;
        this.paralelo_obs = paralelo_obs;
        this.id_creacion = id_creacion;
        this.id_actualizacion = id_actualizacion;
        this.nivel = nivel;
    }

    public Long getNivel() {
        return nivel;
    }

    public void setNivel(Long nivel) {
        this.nivel = nivel;
    }

    public Long getId_creacion() {
        return id_creacion;
    }

    public void setId_creacion(Long id_creacion) {
        this.id_creacion = id_creacion;
    }

    public Long getId_actualizacion() {
        return id_actualizacion;
    }

    public void setId_actualizacion(Long id_actualizacion) {
        this.id_actualizacion = id_actualizacion;
    }

    public Long getId_paralelo() {
        return id_paralelo;
    }

    public void setId_paralelo(Long id_paralelo) {
        this.id_paralelo = id_paralelo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getEstado_pa() {
        return estado_pa;
    }

    public void setEstado_pa(String stado_pa) {
        this.estado_pa = stado_pa;
    }


    public String getParalelo_obs() {
        return paralelo_obs;
    }

    public void setParalelo_obs(String paralelo_obs) {
        this.paralelo_obs = paralelo_obs;
    }
    
}
