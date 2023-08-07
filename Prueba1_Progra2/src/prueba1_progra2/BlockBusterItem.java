/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_progra2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author josuc
 */
public abstract class BlockBusterItem {
    protected int codigo;
    protected String Nombre;
    protected double PrecioRenta;
    protected LocalDate fecha;
    
    public BlockBusterItem (int codigo, String Nombre, double PrecioRenta) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.PrecioRenta = PrecioRenta;
        fecha = LocalDate.now();
    }

    public String toString() {
        return "Codigo= " + codigo + "\nNombre= " + Nombre + "\nPreciode Renta= " + PrecioRenta;
    }
    
    public abstract double pagoRenta(int dias);
    
}
