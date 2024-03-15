package com.kibernumacademy.aplica.models;

import com.kibernumacademy.aplica.interfaces.IPrestamo;

public class PrestamoPersonal implements IPrestamo{

  @Override
  public double calcularCuota(double monto, int plazo) {
    return monto * 0.05 / plazo;
  }
  
}
