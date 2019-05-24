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
public class ca_calificacion {
    private Long id_calificacion;
    private Long id_matricula;
    private double nota_practica;
    private double aporte;
    private double supletorio;
    private double remedial;
    private double examen_de_gracia;
    private double promedio;
    private Long id_conducta;
    private double examen;
    private Long parcial;
    private Long id_materia;
    private double nota_formativa;
    private String calificacion_obs;
    private double ochenta_porcentaje;
    private double veinte_porcentaje;
    private String estado_ca;
    private Long id_creacion;
    private String f_creacion;
    private Long id_actualizacion;
    private String f_actualizacion;

    public ca_calificacion() {
    }

    public ca_calificacion(Long id_calificacion, Long id_matricula, double nota_practica, double aporte, double supletorio, double remedial, double examen_de_gracia, double promedio, Long id_conducta, double examen, Long parcial, Long id_materia, double nota_formativa, String calificacion_obs, double ochenta_porcentaje, double veinte_porcentaje, String estado_ca, Long id_creacion, String f_creacion, Long id_actualizacion, String f_actualizacion) {
        this.id_calificacion = id_calificacion;
        this.id_matricula = id_matricula;
        this.nota_practica = nota_practica;
        this.aporte = aporte;
        this.supletorio = supletorio;
        this.remedial = remedial;
        this.examen_de_gracia = examen_de_gracia;
        this.promedio = promedio;
        this.id_conducta = id_conducta;
        this.examen = examen;
        this.parcial = parcial;
        this.id_materia = id_materia;
        this.nota_formativa = nota_formativa;
        this.calificacion_obs = calificacion_obs;
        this.ochenta_porcentaje = ochenta_porcentaje;
        this.veinte_porcentaje = veinte_porcentaje;
        this.estado_ca = estado_ca;
        this.id_creacion = id_creacion;
        this.f_creacion = f_creacion;
        this.id_actualizacion = id_actualizacion;
        this.f_actualizacion = f_actualizacion;
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

    public double getNota_practica() {
        return nota_practica;
    }

    public void setNota_practica(double nota_practica) {
        this.nota_practica = nota_practica;
    }

    public double getAporte() {
        return aporte;
    }

    public void setAporte(double aporte) {
        this.aporte = aporte;
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

    public Long getId_conducta() {
        return id_conducta;
    }

    public void setId_conducta(Long id_conducta) {
        this.id_conducta = id_conducta;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public Long getParcial() {
        return parcial;
    }

    public void setParcial(Long parcial) {
        this.parcial = parcial;
    }

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public double getNota_formativa() {
        return nota_formativa;
    }

    public void setNota_formativa(double nota_formativa) {
        this.nota_formativa = nota_formativa;
    }

    public String getCalificacion_obs() {
        return calificacion_obs;
    }

    public void setCalificacion_obs(String calificacion_obs) {
        this.calificacion_obs = calificacion_obs;
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

    public String getEstado_ca() {
        return estado_ca;
    }

    public void setEstado_ca(String estado_ca) {
        this.estado_ca = estado_ca;
    }

    public Long getId_creacion() {
        return id_creacion;
    }

    public void setId_creacion(Long id_creacion) {
        this.id_creacion = id_creacion;
    }

    public String getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(String f_creacion) {
        this.f_creacion = f_creacion;
    }

    public Long getId_actualizacion() {
        return id_actualizacion;
    }

    public void setId_actualizacion(Long id_actualizacion) {
        this.id_actualizacion = id_actualizacion;
    }

    public String getF_actualizacion() {
        return f_actualizacion;
    }

    public void setF_actualizacion(String f_actualizacion) {
        this.f_actualizacion = f_actualizacion;
    }
    
}
