
public class Vagon {

	private double capacidad;
	private double carga;
	
	public void cambiarCapacidad(double nuevaCapacidad) {

		this.capacidad = nuevaCapacidad;
	}

	public double obtenerCapacidad() {
		
		return this.capacidad;
	}

	public void cargar(double nuevaCarga) {

		this.carga = nuevaCarga;
	}

	public double calcularCarga() {

		return this.carga;
	}
	
}
