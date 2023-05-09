package org.banco.Servicios;

import org.banco.Entidades.Cuenta;
import org.banco.Entidades.Transaccion;
import org.banco.Entidades.Usuario;


public class TransaccionServicios {

    public Transaccion crearTransaccion(){
        return new Transaccion();
    }

    public void transferir(Usuario usuario, Integer cbu, Cuenta cuenta, Double monto){
        if (usuario.getCuenta().getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() + monto);
            usuario.getCuenta().setSaldo(usuario.getCuenta().getSaldo() - monto);
            System.out.println("Transferencia Exitosa");
        }else {
            System.out.println("No se pudo realizar la transacción.");
        }
    }


    public void depositar(Cuenta cuenta, Double deposito){
        cuenta.setSaldo(cuenta.getSaldo() + deposito);
        System.out.println("Su saldo actual es: " + cuenta.getSaldo());
    }
}
