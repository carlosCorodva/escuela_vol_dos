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
public class JoinCalificacion {
    private Long id_calificacion;
    private Long id_matricula;
    private String apellidos_nombres;
    private double aporte;
    private double nota_formativa;
    private double nota_practica;
    private double examen;
    private double ochenta_porcentaje;
    private double veinte_porcentaje;
    private double supletorio;
    private double remedial;
    private double examen_de_gracia;
    private double promedio;
    private Long parcial;
    private String calificacion_obs;
    private String estado_ca;
    private Long id_materia;
    private String materia;
    private Long id_conducta;
    private String conducta;
    private Long id_paralelo;
    private String paralelo;
    private Long id_periodo;
    private String periodo;
    private Long id_sucursal;

    public JoinCalificacion() {
    }

    public JoinCalificacion(Long id_calificacion, Long id_matricula, String apellidos_nombres, double aporte, double nota_formativa, double nota_practica, double examen, double ochenta_porcentaje, double veinte_porcentaje, double supletorio, double remedial, double examen_de_gracia, double promedio, Long parcial, String calificacion_obs, String estado_ca, Long id_materia, String materia, Long id_conducta, String conducta, Long id_paralelo, String paralelo, Long id_periodo, String periodo, Long id_sucursal) {
        this.id_calificacion = id_calificacion;
        this.id_matricula = id_matricula;
        this.apellidos_nombres = apellidos_nombres;
        this.aporte = aporte;
        this.nota_formativa = nota_formativa;
        this.nota_practica = nota_practica;
        this.examen = examen;
        this.ochenta_porcentaje = ochenta_porcentaje;
        this.veinte_porcentaje = veinte_porcentaje;
        this.supletorio = supletorio;
        this.remedial = remedial;
        this.examen_de_gracia = examen_de_gracia;
        this.promedio = promedio;
        this.parcial = parcial;
        this.calificacion_obs = calificacion_obs;
        this.estado_ca = estado_ca;
        this.id_materia = id_materia;
        this.materia = materia;
        this.id_conducta = id_conducta;
        this.conducta = conducta;
        this.id_paralelo = id_paralelo;
        this.paralelo = paralelo;
        this.id_periodo = id_periodo;
        this.periodo = periodo;
        this.id_sucursal = id_sucursal;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }
    

    public Long getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(Long id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getApellidos_nombres() {
        return apellidos_nombres;
    }

    public void setApellidos_nombres(String apellidos_nombres) {
        this.apellidos_nombres = apellidos_nombres;
    }

    public double getAporte() {
        return aporte;
    }

    public void setAporte(double aporte) {
        this.aporte = aporte;
    }

    public double getNota_formativa() {
        return nota_formativa;
    }

    public void setNota_formativa(double nota_formativa) {
        this.nota_formativa = nota_formativa;
    }

    public double getNota_practica() {
        return nota_practica;
    }

    public void setNota_practica(double nota_practica) {
        this.nota_practica = nota_practica;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public double getOchenta_porcentaje() {
        return ochenta_porcentaje;
    }

    public void setOchenta_porcentaje(double ochenta_porcentaje) {
        this.ochenta_porcentaje = ochenta_porcentaje;
    }

    public double getVeinte_porcentaje() {
        return veinte_porcentaje;
    }

    public void setVeinte_porcentaje(double veinte_porcentaje) {
        this.veinte_porcentaje = veinte_porcentaje;
    }

    public double getSupletorio() {
        return supletorio;
    }

    public void setSupletorio(double supletorio) {
        this.supletorio = supletorio;
    }

    public double getRemedial() {
        return remedial;
    }

    public void setRemedial(double remedial) {
        this.remedial = remedial;
    }

    public double getExamen_de_gracia() {
        return examen_de_gracia;
    }

    public void setExamen_de_gracia(double examen_de_gracia) {
        this.examen_de_gracia = examen_de_gracia;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Long getParcial() {
        return parcial;
    }

    public void setParcial(Long parcial) {
        this.parcial = parcial;
    }

    public String getCalificacion_obs() {
        return calificacion_obs;
    }

    public void setCalificacion_obs(String calificacion_obs) {
        this.calificacion_obs = calificacion_obs;
    }

    public String getEstado_ca() {
        return estado_ca;
    }

    public void setEstado_ca(String estado_ca) {
        this.estado_ca = estado_ca;
    }

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Long getId_conducta() {
        return id_conducta;
    }

    public void setId_conducta(Long id_conducta) {
        this.id_conducta = id_conducta;
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
    
}
