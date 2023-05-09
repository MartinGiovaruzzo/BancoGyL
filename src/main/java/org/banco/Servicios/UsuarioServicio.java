package org.banco.Servicios;

import org.banco.Entidades.Cuenta;
import org.banco.Entidades.Usuario;

public class UsuarioServicio {

    public Usuario crearUsuario(String id, String contrasenia, Cuenta cuenta){
        return new Usuario(id,contrasenia,cuenta);
    }

}
