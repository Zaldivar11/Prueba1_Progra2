
package prueba1_progra2;

public class VideoGameItem extends BlockBusterItem {
    
    private String NombreConsola;
    private String TIPOCONSOL1 = "PLAYSTATION";
    private String TIPOCONSOL2 = "XBOX";
    private String TIPOCONSOL3 = "WII";
    private int renta;

    public VideoGameItem(int codigo, String Nombre, int renta) {
        super(codigo, Nombre, renta);
        this.NombreConsola=Nombre;
        renta=30;
        this.renta=renta;
    }
    
   

    public String getNombreConsola() {
        return NombreConsola;
    }

    public void setNombreConsola(String NombreConsola) {
        this.NombreConsola = NombreConsola;
    }

    public String getTIPOCONSOL1() {
        return TIPOCONSOL1;
    }

    public String getTIPOCONSOL2() {
        return TIPOCONSOL2;
    }

    public String getTIPOCONSOL3() {
        return TIPOCONSOL3;
    }

    @Override
    public double pagoRenta(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String toString() {
        return super.toString() + " - " + getNombre() + " Game";
    }
    
    public int pagRenta(int days) {
        return renta * days;
    }
    
}
