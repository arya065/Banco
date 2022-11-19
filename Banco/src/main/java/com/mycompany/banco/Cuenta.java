package com.mycompany.banco;

import java.util.*;
import org.apache.commons.lang3.RandomStringUtils;//импорт архивов в файл pom

public class Cuenta {

    private String numeroCuenta;
    private String nif;
    private String nombre;
    private int saldo;
    private double percent;

    public Cuenta() {
        this.numeroCuenta = RandomStringUtils.random(20);
        this.nif = generaNif();
    }

    public Cuenta(String nombre, int saldo, double percent) {
        this.numeroCuenta = RandomStringUtils.random(20);
        this.nif = generaNif();
        this.nombre = nombre;
        this.saldo = saldo;
        this.percent = percent;
    }

    public boolean controlarPercent() {
        boolean result = true;
        if (percent > 3 || percent < 0.1) {
            result = false;
        }
        return result;
    }

    public String generaNif() {
        Random rand = new Random();

        int numRand = rand.nextInt(99999999 + 1);
        String nif = "" + numRand;
        numRand = Math.round(numRand % 23);
        String letras = "TRWAGMYFPDXBNJZSQVHLCK";
        char letraNif = letras.charAt(numRand);
        nif += letraNif;
        System.out.println(nif);
        return nif;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombrre() {
        return nombre;
    }

    public void setNombrre(String nombrre) {
        this.nombre = nombrre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nif=" + nif + ", nombrre=" + nombre + ", saldo=" + saldo + ", percent=" + percent + '}';
    }

}
