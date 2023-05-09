package org.banco.Servicios;

import org.banco.Entidades.Banco;
import org.banco.Entidades.Cuenta;
import org.banco.Entidades.Transaccion;
import org.banco.Entidades.Usuario;

import java.util.*;

public class BancoServicios {
    static Scanner sc = new Scanner(System.in);
    TransaccionServicios transaccionServicios = new TransaccionServicios();
    HashSet<Transaccion> historial = new HashSet<>();

    public Banco crearBanco(String nombre, String direccion) {
        return new Banco(nombre, direccion);
    }

    public void loginBanco(List<Cuenta> cuentas, List<Usuario> usuarios, List<Transaccion> historiales) {
        int eleccion = 0;

        while (eleccion != 3) {

            System.out.println("""
                    1- Login
                    2- Exit""");
            eleccion = sc.nextInt();

            if (eleccion == 1) {

                Usuario usuario = validacion(usuarios);
                if (usuario != null) {
                    int eleccion1 = 4;
                    do {
                        System.out.println("""
                                1- Transferencia
                                2- Depositar
                                3- Historial Transacciones
                                4- Salir""");
                        eleccion1 = sc.nextInt();

                        switch (eleccion1) {
                            case 1 -> {

                                System.out.println("Ingrese CBU: ");
                                Integer cbu = sc.nextInt();
                                Cuenta cuenta = validarCBU(usuario, cbu, cuentas);

                                if (cuenta != null) {
                                    System.out.println("Monto a transferir: ");
                                    double monto = sc.nextDouble();
                                    transaccionServicios.transferir(usuario, cbu, cuenta, monto);
                                    historiales.add(new Transaccion((long) (Math.random() * 1000000000), new Date(), "Transferencia", monto, cbu));
                                }
                            }
                            case 2 -> {

                                System.out.println("Ingrese su cbu");
                                Integer cbu = sc.nextInt();
                                Cuenta cuenta = validarCBU2(usuario, cbu, cuentas);
                                System.out.println("Ingrese monto a depositar: ");
                                double deposito = sc.nextDouble();
                                transaccionServicios.depositar(cuenta, deposito);
                                historiales.add(new Transaccion((long) (Math.random() * 1000000000), new Date(), "Transferencia",deposito, cbu));

                            }
                            case 3 -> {
                                System.out.println(historiales.toString());
                            }
                        }
                    } while (eleccion1 != 4);
                }

            } else if (eleccion == 2) {
                System.out.println("Saliendo");
            }
        }
    }

    public static Cuenta validarCBU2(Usuario usuario, Integer cbu, List<Cuenta> cuentas) {
        Cuenta cuenta = null;
        for (Cuenta i : cuentas) {
            if (cbu.equals(i.getCbu()) && usuario.getCuenta().getCbu().equals(cbu)) {
                cuenta = i;
                break;
            }
        }
        return cuenta;
    }
    public static Cuenta validarCBU(Usuario usuario, Integer cbu, List<Cuenta> cuentas) {
        Cuenta cuenta = null;
        for (Cuenta i : cuentas) {
            if (cbu.equals(i.getCbu()) && !usuario.getCuenta().getCbu().equals(cbu)) {
                cuenta = i;
                break;
            }
        }
        return cuenta;
    }

    public static Usuario validacion(List<Usuario> usuarios) {
        System.out.println("Ingresar nombre de usuario");
        String usu = sc.next();
        Usuario usuario = null;

        for (Usuario i : usuarios) {
            if (i.getId().equals(usu)) {
                usuario = i;
            }
        }

        System.out.println("Contraseña");
        String contr = sc.next();
        if (contr.equals(usuario.getContrasenia())) {
            System.out.println("Logeado Correctamente");
        } else {
            System.out.println("Contraseña incorrecta");
            usuario = null;
        }
        return usuario;
    }
}

