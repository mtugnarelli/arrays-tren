
public class Tren {

    private Vagon[] vagones;
    
    public Tren(double[] capacidadVagones) {

        this.vagones = new Vagon[capacidadVagones.length];
        
        for (int numeroVagon = 0; numeroVagon < this.vagones.length; numeroVagon++) {
            
            this.vagones[numeroVagon] = new Vagon();
            this.vagones[numeroVagon].cambiarCapacidad(capacidadVagones[numeroVagon]);
        }
    }

    public double calcularCargaTotal() {

        double cargaTotal = 0;
        
        for (int numeroVagon = 0; numeroVagon < this.vagones.length; numeroVagon++) {
            
            Vagon vagon = this.vagones[numeroVagon];
            
            cargaTotal += vagon.calcularCarga();
        }
        
        return cargaTotal;
    }

    public double calcularCapacidad() {

        double total = 0;
        
        for (int numeroVagon = 0; numeroVagon < this.vagones.length; numeroVagon++) {
            
            Vagon vagon = this.vagones[numeroVagon];
            
            total += vagon.obtenerCapacidad();
            
            // total += this.vagones[numeroVagon].obtenerCapacidad();
        }
        
        return total ;
    }

    /**
     * pre : numero está comprendido entre 1 y la cantidad de vagones.
     * post: carga en el vagon indicado por 'numero' la 'carga'.
     * @param numero
     * @param carga
     */
    public void cargarVagon(int numero, double carga) {

        Vagon vagonACargar = this.obtenerVagon(numero);
        
        vagonACargar.cargar(carga);
    }

    public Vagon obtenerVagon(int numero) {

        if (numero <= 0 || numero > this.vagones.length) {
            
            Error numeroDeVagonInvalido = new Error("Numero de vagon inválido");
            throw numeroDeVagonInvalido;
        }
        
        return this.vagones[numero - 1];
    }

}


