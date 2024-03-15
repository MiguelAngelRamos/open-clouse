package com.kibernumacademy.noaplica;

import com.kibernumacademy.noaplica.models.PrestamoHipotecario;
import com.kibernumacademy.noaplica.models.PrestamoPersonal;
import com.kibernumacademy.noaplica.services.CalculadoraDePrestamos;

public class Main {
  public static void main(String[] args) {
    PrestamoPersonal prestamoPersonal = new PrestamoPersonal();
    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario();

    CalculadoraDePrestamos calculadora = new CalculadoraDePrestamos();
    
    double cuotaPersonal = calculadora.calcularCuota(prestamoPersonal, 10000, 12);

    double cuoataHipotecario = calculadora.calcularCuota(prestamoHipotecario, 20000, 30);


    System.out.println("Cuota mensual préstamo personal: " + cuotaPersonal);
    System.out.println("Cuota mensual préstamo: " + cuoataHipotecario );
  }
}
