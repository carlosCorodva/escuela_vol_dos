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
public class gen_precios {
    private Long id_precios;
    private double valor;
    private String promocion;
    private String estado_pre;
    private Long id_creacion;
    private String f_creacion;
    private Long id_actualizacion;
    private String f_actualizacion;
    private String codigo;
    private String pago;
    private Long id_sucursal;

    public gen_precios() {
    }

    public gen_precios(Long id_precios, double valor, String promocion, String estado_pre, Long id_creacion, String f_creacion, Long id_actualizacion, String f_actualizacion, String codigo, String pago, Long id_sucursal) {
        this.id_precios = id_precios;
        this.valor = valor;
        this.promocion = promocion;
        this.estado_pre = estado_pre;
        this.id_creacion = id_creacion;
        this.f_creacion = f_creacion;
        this.id_actualizacion = id_actualizacion;
        this.f_actualizacion = f_actualizacion;
        this.codigo = codigo;
        this.pago = pago;
        this.id_sucursal = id_sucursal;
    }

    public Long getId_precios() {
        return id_precios;
    }

    public void setId_precios(Long id_precios) {
        this.id_precios = id_precios;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public String getEstado_pre() {
        return estado_pre;
    }

    public void setEstado_pre(String estado_pre) {
        this.estado_pre = estado_pre;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }
    
    
}
