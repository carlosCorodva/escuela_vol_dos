/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades.join;

/**
 *
 * @author carlos
 */
public class JoinGraduados {
    private Long id_registro;
    private String apellidos_nombres;
    private String cedula;
    private String graduado;
    private Long doc_escuela_ant;
    private Long id_usuario;
    private Long id_rol;
    private Long id_matricula;
    private String matricula_obs;
    private String estado_matricula;
    private Double promedio_matricula;
    private Long id_sucursal;
    private Long id_periodo;
    private String periodo;
    private Double promedio_graduacion;
    private String nombre_comercial_su;
    private Long id_paralelo;
    private String paralelo;

    public JoinGraduados() {
    }

    public JoinGraduados(Long id_registro, String apellidos_nombres, String cedula, String graduado, Long doc_escuela_ant, Long id_usuario, Long id_rol, Long id_matricula, String matricula_obs, String estado_matricula, Double promedio_matricula, Long id_sucursal, Long id_periodo, String periodo, Double promedio_graduacion, String nombre_comercial_su, Long id_paralelo, String paralelo) {
        this.id_registro = id_registro;
        this.apellidos_nombres = apellidos_nombres;
        this.cedula = cedula;
        this.graduado = graduado;
        this.doc_escuela_ant = doc_escuela_ant;
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
        this.id_matricula = id_matricula;
        this.matricula_obs = matricula_obs;
        this.estado_matricula = estado_matricula;
        this.promedio_matricula = promedio_matricula;
        this.id_sucursal = id_sucursal;
        this.id_periodo = id_periodo;
        this.periodo = periodo;
        this.promedio_graduacion = promedio_graduacion;
        this.nombre_comercial_su = nombre_comercial_su;
        this.id_paralelo = id_paralelo;
        this.paralelo = paralelo;
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
    
    public String getNombre_comercial_su() {
        return nombre_comercial_su;
    }

    public void setNombre_comercial_su(String nombre_comercial_su) {
        this.nombre_comercial_su = nombre_comercial_su;
    }
    
    public Double getPromedio_graduacion() {
        return promedio_graduacion;
    }

    public void setPromedio_graduacion(Double promedio_graduacion) {
        this.promedio_graduacion = promedio_graduacion;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public Long getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Long id_periodo) {
        this.id_periodo = id_periodo;
    }
    
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Long getId_registro() {
        return id_registro;
    }

    public void setId_registro(Long id_registro) {
        this.id_registro = id_registro;
    }

    public String getApellidos_nombres() {
        return apellidos_nombres;
    }

    public void setApellidos_nombres(String apellidos_nombres) {
        this.apellidos_nombres = apellidos_nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGraduado() {
        return graduado;
    }

    public void setGraduado(String graduado) {
        this.graduado = graduado;
    }

    public Long getDoc_escuela_ant() {
        return doc_escuela_ant;
    }

    public void setDoc_escuela_ant(Long doc_escuela_ant) {
        this.doc_escuela_ant = doc_escuela_ant;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getMatricula_obs() {
        return matricula_obs;
    }

    public void setMatricula_obs(String matricula_obs) {
        this.matricula_obs = matricula_obs;
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
