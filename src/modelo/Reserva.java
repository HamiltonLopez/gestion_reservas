/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Reserva {
     public static final String ACTIVA = "Activa";
    public static final String CANCELADA = "Cancelada";
    
    private int codigo;
    private Date fechaReserva;
    private int noDocumento;
    private String nombreCliente;
    private int noContacto;
    private String correo;
    private String estado;
    private int cantidadPersonas;
    private String motivo;
    private String tipoDecoracion;

    public Reserva( Date fechaReserva, int noDocumento, String nombreCliente, int noContacto, String correo, String estado, int cantidadPersonas, String motivo, String tipoDecoracion) {
        this.fechaReserva = fechaReserva;
        this.noDocumento = noDocumento;
        this.nombreCliente = nombreCliente;
        this.noContacto = noContacto;
        this.correo = correo;
        this.estado = estado;
        this.cantidadPersonas = cantidadPersonas;
        this.motivo = motivo;
        this.tipoDecoracion = tipoDecoracion;
    }

    public static String getACTIVA() {
        return ACTIVA;
    }

    public static String getCANCELADA() {
        return CANCELADA;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public int getNoDocumento() {
        return noDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNoContacto() {
        return noContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEstado() {
        return estado;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getTipoDecoracion() {
        return tipoDecoracion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setNoDocumento(int noDocumento) {
        this.noDocumento = noDocumento;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNoContacto(int noContacto) {
        this.noContacto = noContacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setTipoDecoracion(String tipoDecoracion) {
        this.tipoDecoracion = tipoDecoracion;
    }
    
    
}
