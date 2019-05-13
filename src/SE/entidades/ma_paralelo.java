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
    private String estado;
    private String paralelo_obs;

    public ma_paralelo() {
    }

    public ma_paralelo(Long id_paralelo, String paralelo, String estado, String paralelo_obs) {
        this.id_paralelo = id_paralelo;
        this.paralelo = paralelo;
        this.estado = estado;
        this.paralelo_obs = paralelo_obs;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getParalelo_obs() {
        return paralelo_obs;
    }

    public void setParalelo_obs(String paralelo_obs) {
        this.paralelo_obs = paralelo_obs;
    }
    
}
