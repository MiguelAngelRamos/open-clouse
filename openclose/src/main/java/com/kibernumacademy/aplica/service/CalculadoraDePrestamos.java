package com.kibernumacademy.aplica.service;
import com.kibernumacademy.aplica.interfaces.IPrestamo;

public class CalculadoraDePrestamos {
  
  public double calcularCuota(IPrestamo prestamo, double monto, int plazo ) {
    return prestamo.calcularCuota(monto, plazo);
  }
}
// Esto sugiere que deberías poder agregar nuevas funcionalidades sin cambiar el código existente.
