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
public class us_permiso_empleado {
    private Long id_permiso;
    private Long id_usuario;
    private Long id_materia;
    private String estado_pe;
    private String estado_pe10;
    private String estado_pe2;
    private String estado_pe3;
    private String estado_pe4;
    private String estado_pe5;
    private String estado_pe6;
    private String estado_pe7;
    private String estado_pe8;
    private String estado_pe9;

    public us_permiso_empleado() {
    }

    public us_permiso_empleado(Long id_permiso, Long id_usuario, Long id_materia, String estado_pe, String estado_pe10, String estado_pe2, String estado_pe3, String estado_pe4, String estado_pe5, String estado_pe6, String estado_pe7, String estado_pe8, String estado_pe9) {
        this.id_permiso = id_permiso;
        this.id_usuario = id_usuario;
        this.id_materia = id_materia;
        this.estado_pe = estado_pe;
        this.estado_pe10 = estado_pe10;
        this.estado_pe2 = estado_pe2;
        this.estado_pe3 = estado_pe3;
        this.estado_pe4 = estado_pe4;
        this.estado_pe5 = estado_pe5;
        this.estado_pe6 = estado_pe6;
        this.estado_pe7 = estado_pe7;
        this.estado_pe8 = estado_pe8;
        this.estado_pe9 = estado_pe9;
    }

    public String getEstado_pe10() {
        return estado_pe10;
    }

    public void setEstado_pe10(String estado_pe10) {
        this.estado_pe10 = estado_pe10;
    }

    public String getEstado_pe2() {
        return estado_pe2;
    }

    public void setEstado_pe2(String estado_pe2) {
        this.estado_pe2 = estado_pe2;
    }

    public String getEstado_pe3() {
        return estado_pe3;
    }

    public void setEstado_pe3(String estado_pe3) {
        this.estado_pe3 = estado_pe3;
    }

    public String getEstado_pe4() {
        return estado_pe4;
    }

    public void setEstado_pe4(String estado_pe4) {
        this.estado_pe4 = estado_pe4;
    }

    public String getEstado_pe5() {
        return estado_pe5;
    }

    public void setEstado_pe5(String estado_pe5) {
        this.estado_pe5 = estado_pe5;
    }

    public String getEstado_pe6() {
        return estado_pe6;
    }

    public void setEstado_pe6(String estado_pe6) {
        this.estado_pe6 = estado_pe6;
    }

    public String getEstado_pe7() {
        return estado_pe7;
    }

    public void setEstado_pe7(String estado_pe7) {
        this.estado_pe7 = estado_pe7;
    }

    public String getEstado_pe8() {
        return estado_pe8;
    }

    public void setEstado_pe8(String estado_pe8) {
        this.estado_pe8 = estado_pe8;
    }

    public String getEstado_pe9() {
        return estado_pe9;
    }

    public void setEstado_pe9(String estado_pe9) {
        this.estado_pe9 = estado_pe9;
    }

    

    public Long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public String getEstado_pe() {
        return estado_pe;
    }

    public void setEstado_pe(String estado_pe) {
        this.estado_pe = estado_pe;
    }
    
}
