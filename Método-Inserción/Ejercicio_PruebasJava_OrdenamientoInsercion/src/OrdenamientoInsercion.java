import java.util.Arrays;

public class OrdenamientoInsercion {

	// Variables
	private int[] vector;
	private int aux = 0;
	private int tiempo = 0;
	private int recorrido = 0;
	private int comparaciones = 0;
	private int intercambios = 0;

	// Constructor
	public OrdenamientoInsercion() {

	}

	// Getters and setters
	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}

	public int getComparaciones() {
		return comparaciones;
	}

	public void setComparaciones(int comparaciones) {
		this.comparaciones = comparaciones;
	}

	public int getIntercambios() {
		return intercambios;
	}

	public void setIntercambios(int intercambios) {
		this.intercambios = intercambios;
	}

	// Método de Inserción
	public void ordenamientoInsercion(int[] numeros) {
		vector = numeros;
		int aux, elemento1, elemento2;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();

		for (elemento1 = 1; elemento1 < numeros.length; elemento1++) {
			aux = numeros[elemento1];
			elemento2 = elemento1 - 1;

			while ((elemento2 >= 0) && (aux < numeros[elemento2])) {
				intercambios++;
				vector[elemento2] = vector[elemento2];
				elemento2--;
			}
			recorrido++;
			numeros[elemento2 + 1] = aux;
		}
		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + numeros.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
}