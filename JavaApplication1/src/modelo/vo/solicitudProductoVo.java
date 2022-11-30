package modelo.vo;

import java.util.Date;

public class solicitudProductoVo {
    private int numSolicitud;
    private Date fechaFacturacion;
    private double totalIva;
    private double totalCompra;
    private Long nitCliente;
    private int venCedula;

    public int getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Long getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(Long nitCliente) {
        this.nitCliente = nitCliente;
    }

    public int getVenCedula() {
        return venCedula;
    }

    public void setVenCedula(int venCedula) {
        this.venCedula = venCedula;
    }
    
    
}
