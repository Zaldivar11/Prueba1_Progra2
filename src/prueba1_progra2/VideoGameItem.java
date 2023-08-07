
package prueba1_progra2;

public class VideoGameItem {
    
    private String NombreConsola;

    public VideoGameItem(String NombreConsola, int renta) {
        this.NombreConsola = NombreConsola;
        renta=30;
        
    }

    public String getNombreConsola() {
        return NombreConsola;
    }

    public void setNombreConsola(String NombreConsola) {
        this.NombreConsola = NombreConsola;
    }
    
    
    
}
