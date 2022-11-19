package com.mycompany.banco;

import java.util.*;

public class Banco {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta("Juan", 0, 30);
        while (!cuenta1.controlarPercent()) {
            double read = 0;
            System.out.println("Interes debe ser entre 0,1 a 3");
            System.out.println("Introduce interes");
            try {
                read = in.nextDouble();
                cuenta1.setPercent(read);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Interes debe ser entre 0,1 a 3");
//                in.next();
                cuenta1.setPercent(0);
            }
        }

        cuenta1.setSaldo(CalculosCuenta.ingresarInteres(cuenta1));

    }
}
