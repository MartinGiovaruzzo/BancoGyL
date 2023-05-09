package org.banco.Entidades;

import org.banco.Enum.TipoCuenta;

public class Cuenta {
    private TipoCuenta tipo;
    private Double saldo;
    private Integer cbu;

    public Cuenta() {
    }

    public Cuenta(TipoCuenta tipo, Double saldo, Integer cbu) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.cbu = cbu;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", cbu=" + cbu +
                '}';
    }
}
