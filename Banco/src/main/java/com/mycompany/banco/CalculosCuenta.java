package com.mycompany.banco;

public class CalculosCuenta {

    public static int ingresarInteres(Cuenta cuenta1) {
        int saldo = cuenta1.getSaldo();
        double percent = cuenta1.getPercent();
        return saldo += saldo * percent;
    }

    public static int ingresarDinero(Cuenta cuenta1, double cantidad) {//поступление денег
        int saldo = cuenta1.getSaldo();
        return saldo += cantidad;
    }

    public static int retirarEfectivo(Cuenta cuenta1, double cantidad) {// списание денег
        int saldo= cuenta1.getSaldo();
        if (cantidad>saldo){
            System.out.println("Cantidad no se puede ser mas que cuenta");
        } else{
            saldo-=cantidad;
        }
        return saldo;
    }
}
