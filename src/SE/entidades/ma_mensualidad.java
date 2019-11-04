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
public class ma_mensualidad {
    private Long id_mensualidad;
    private Long id_matricula;
    private Long id_sucursal_men;
    private String estado;
    private double mensualidad;
    private double valor_mens;
    private double ingreso;
    private double deuda;
    private double valor_ref;
    private double total;
    private Long id_creacion;
    private String f_creacion;
    private Long id_actualizacion;
    private String f_actualizacion;

    public ma_mensualidad() {
    }

    public ma_mensualidad(Long id_mensualidad, Long id_matricula, Long id_sucursal_men, String estado, double mensualidad, double valor_mens, double ingreso, double deuda, double valor_ref, double total, Long id_creacion, String f_creacion, Long id_actualizacion, String f_actualizacion) {
        this.id_mensualidad = id_mensualidad;
        this.id_matricula = id_matricula;
        this.id_sucursal_men = id_sucursal_men;
        this.estado = estado;
        this.mensualidad = mensualidad;
        this.valor_mens = valor_mens;
        this.ingreso = ingreso;
        this.deuda = deuda;
        this.valor_ref = valor_ref;
        this.total = total;
        this.id_creacion = id_creacion;
        this.f_creacion = f_creacion;
        this.id_actualizacion = id_actualizacion;
        this.f_actualizacion = f_actualizacion;
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

    

    public Long getId_mensualidad() {
        return id_mensualidad;
    }

    public void setId_mensualidad(Long id_mensualidad) {
        this.id_mensualidad = id_mensualidad;
    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Long getId_sucursal_men() {
        return id_sucursal_men;
    }

    public void setId_sucursal_men(Long id_sucursal_men) {
        this.id_sucursal_men = id_sucursal_men;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public double getValor_mens() {
        return valor_mens;
    }

    public void setValor_mens(double valor_mens) {
        this.valor_mens = valor_mens;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public double getValor_ref() {
        return valor_ref;
    }

    public void setValor_ref(double valor_ref) {
        this.valor_ref = valor_ref;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
