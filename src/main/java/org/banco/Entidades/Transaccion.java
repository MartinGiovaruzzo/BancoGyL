package org.banco.Entidades;


import java.util.Date;

public class Transaccion {
    private long id;
    private Date fecha;
    private String tipo;
    private Double monto;
    private Integer cbu;

    public Transaccion() {
    }

    public Transaccion(long id, Date fecha, String tipo, Double monto, Integer cbu) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cbu = cbu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", tipo='" + tipo + '\'' +
                ", monto=" + monto +
                ", cbu=" + cbu +
                '}';
    }
}
