
public class OrdenamientoSeleccion {

	// Variables
	private int[] vector;
	private int aux = 0;
	private int tiempo = 0;
	private int numMenor = 0;
	private int recorrido = 0;
	private int comparaciones = 0;
	private int intercambios = 0;

	// Constructor
	public OrdenamientoSeleccion() {

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

	public int getNumMenor() {
		return numMenor;
	}

	public void setNumMenor(int numMenor) {
		this.numMenor = numMenor;
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

	// Método de seleccion
	public void ordenamientoSeleccion(int[] numeros) {
		vector = numeros;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();

		for (int i = 0; i < vector.length - 1; i++) {
			numMenor = 1;
			for (int j = i + 1; j < vector.length; j++) {
				recorrido++;
				if (vector[i] < vector[numMenor]) {
					comparaciones++;
					numMenor = j;
				}
			}
			intercambios++;
			recorrido++;
			aux = vector[i];
			vector[i] = vector[numMenor];
			vector[numMenor] = aux;
		}
		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + numeros.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
}