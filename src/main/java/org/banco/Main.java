package org.banco;

import org.banco.Entidades.Transaccion;
import org.banco.Enum.TipoCuenta;
import org.banco.Entidades.Banco;
import org.banco.Entidades.Cuenta;
import org.banco.Entidades.Usuario;
import org.banco.Servicios.BancoServicios;
import org.banco.Servicios.CuentaServicios;
import org.banco.Servicios.UsuarioServicio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BancoServicios objBancoServicios = new BancoServicios();
        UsuarioServicio objUsuarioServicios = new UsuarioServicio();
        CuentaServicios objCuentaServicios = new CuentaServicios();

        Banco objBancoNacionCentral = objBancoServicios.crearBanco("Banco Nacion Casa Central", "Marcos Burgos 1757");
        Banco objBancoNacionSucursal1 = objBancoServicios.crearBanco("Banco Nacio 1", "Belgrano 980");

        List<Cuenta> cuentas = new ArrayList<>();
        Cuenta objCuenta1 = objCuentaServicios.crearCuenta(TipoCuenta.CAJA_DE_AHORRO, 1000.0, 111);
        Cuenta objCuenta2 = objCuentaServicios.crearCuenta(TipoCuenta.CUENTA_CORRIENTE, 200.0, 222);
        cuentas.add(objCuenta1);
        cuentas.add(objCuenta2);

        List<Usuario> usuarios = new ArrayList<>();
        Usuario objUsuario1 = objUsuarioServicios.crearUsuario("martinzzo", "1234", objCuenta1);
        Usuario objUsuario2 = objUsuarioServicios.crearUsuario("ezefm", "1234", objCuenta2 );
        usuarios.add(objUsuario1);
        usuarios.add(objUsuario2);

        List<Transaccion> historiales = new ArrayList<>();

        objBancoServicios.loginBanco(cuentas,usuarios,historiales);


    }

}