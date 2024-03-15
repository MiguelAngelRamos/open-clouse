package com.kibernumacademy.noaplica.services;

import com.kibernumacademy.noaplica.models.PrestamoHipotecario;
import com.kibernumacademy.noaplica.models.PrestamoPersonal;

public class CalculadoraDePrestamos {
  
  public double calcularCuota(Object prestamo, double monto, int plazo ) {

    if(prestamo instanceof PrestamoPersonal) {
      // Lógica para calcular la cuota del prestamo personal
      return monto * 0.05 / plazo; // Supongamos que una formula para prestamo personal
    } else if (prestamo instanceof PrestamoHipotecario) {
      // Lógica para calcular la cuota del prestamo Hipotecario
      return monto * 0.03 /plazo;
    }

    return 0;
  }
}
// Esto sugiere que deberías poder agregar nuevas funcionalidades sin cambiar el código existente.
