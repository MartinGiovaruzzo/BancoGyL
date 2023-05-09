package org.banco.Servicios;

import org.banco.Enum.TipoCuenta;
import org.banco.Entidades.Cuenta;

public class CuentaServicios {

        public Cuenta crearCuenta(TipoCuenta tipo, Double saldo, Integer cbu){
            return new Cuenta(tipo,saldo,cbu);
        }
}
