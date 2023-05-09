package org.banco.Entidades;

public class Usuario {
    private String id;
    private String contrasenia;

    private Cuenta cuenta;

    public Usuario() {
    }

    public Usuario(String id, String contrasenia, Cuenta cuenta) {
        this.id = id;
        this.contrasenia = contrasenia;
        this.cuenta = cuenta;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
