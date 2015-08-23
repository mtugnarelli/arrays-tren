
import org.junit.Assert;
import org.junit.Test;


public class PruebaTren {

    @Test
    public void construirSinCarga() {
        
//        double[] capacidadVagones = new double[5];
//        capacidadVagones[0] = 13;
//        capacidadVagones[1] = 10;
//        capacidadVagones[2] = 10;
//        capacidadVagones[3] = 10;
//        capacidadVagones[4] = 5;
        
        double[] capacidadVagones = new double[] {13.0, 10.0, 10.0, 10.0, 5.0};
        
        Tren trenDeCarga = new Tren(capacidadVagones);
        
        double carga = trenDeCarga.calcularCargaTotal();
        double capacidad = trenDeCarga.calcularCapacidad();
        
        Assert.assertEquals("carga", 0, carga, 0.1);
        Assert.assertEquals("capacidad total", 48.0, capacidad, 0.1);
        
    }
    
    @Test
    public void cargarPrimerVagon() {
        
        double[] capacidadVagones = new double[] {13.0, 10.0, 10.0, 10.0, 5.0};
        
        Tren trenDeCarga = new Tren(capacidadVagones);
        
    
        trenDeCarga.cargarVagon(1, 4.0);
        
        double carga = trenDeCarga.calcularCargaTotal();
        
        Assert.assertEquals("carga", 4.0, carga, 0.1);
        
    }
    
    @Test
    public void obtenerPrimerVagon() {
        
        double[] capacidadVagones = new double[] {13.0, 10.0, 10.0, 10.0, 5.0};
        
        Tren trenDeCarga = new Tren(capacidadVagones);
        
        Vagon primerVagon = trenDeCarga.obtenerVagon(1);
        
        Assert.assertEquals("capacidad del primer vagon", 13.0, primerVagon.obtenerCapacidad(), 0.1);
    }
    
}
