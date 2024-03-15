package com.kibernumacademy.aplica.models;

import com.kibernumacademy.aplica.interfaces.IPrestamo;

public class PrestamoHipotecario implements IPrestamo {

  @Override
  public double calcularCuota(double monto, int plazo) {
    return monto * 0.03 /plazo;
  }
 
}
