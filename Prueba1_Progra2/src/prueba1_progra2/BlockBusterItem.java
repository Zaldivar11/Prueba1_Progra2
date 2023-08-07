/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_progra2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author josuc
 */
public abstract class BlockBusterItem {
    private int codigo;
    private String Nombre;
    private double PrecioRenta;
    private Date fecha;
    
    public BlockBusterItem (int codigo, String Nombre, double PrecioRenta) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.PrecioRenta = PrecioRenta;
        fecha = new Date();
        toStringFecha();
    }
    
    public String toStringFecha() {     
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }

    @Override
    public String toString() {
        return "Codigo= " + codigo + "\nNombre= " + Nombre + "\nPreciode Renta= " + PrecioRenta;
    }
    
    public abstract double pagoRenta(int dias);
    
}
