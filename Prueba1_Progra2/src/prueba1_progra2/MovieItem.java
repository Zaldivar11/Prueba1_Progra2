/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_progra2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author josuc
 */
public class MovieItem extends BlockBusterItem {
    private String Estado;
    private double pago;
    
    public MovieItem(int codigo, String nombre, double precioRenta) {
        super(codigo, nombre, precioRenta);
        this.Estado = "ESTRENO";
    }
    
    public String toString() {
        return super.toString() + "Estado: " + Estado + " -Movie";
    }
    
    public double pagoRenta(int dias) {
        if (Estado.equalsIgnoreCase("ESTRENO") && dias > 2) {
            pago += (dias - 2) * 50;
        } else if (Estado.equalsIgnoreCase("NORMAL") && dias > 5) {
            pago += (dias - 5) * 30;
        }
        return pago;   
    }
    
    public void evaluarEstado() {
        LocalDate fechaActual = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(fecha, fechaActual);
        if (meses >= 5) {
            Estado = "NORMAL";
        }
    }
}
