public class OrdenamientoQuickSort {
	// Variables
	private int[] vector;
	private int aux = 0;
	private int tiempo = 0;
	private int recorrido = 0;
	private int comparaciones = 0;
	private int intercambios = 0;

	// Constructor
	public OrdenamientoQuickSort() {

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

	// Método de intercambio de elementos
	public void intercambioElementos(int[] numeros, int elemento1, int elemento2) {
		vector = numeros;
		intercambios++;
		aux = vector[elemento1];
		vector[elemento1] = vector[elemento2];
		vector[elemento2] = aux;
	}

	// Método de ordenamiento QuickSort
	public void ordenamientoQuicksort(int[] numeros, int izq, int der) {
		vector = numeros;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();
		int elemento1, elemento2, nuevoElemento, pivote;
		nuevoElemento = (izq + der) / 2;
		pivote = vector[nuevoElemento];
		elemento1 = izq;
		elemento2 = der;

		do {
			while (vector[elemento1] < pivote)
				elemento1++;
			while (vector[elemento2] > pivote)
				elemento2--;
			comparaciones++;
			if (elemento1 <= elemento2) {
				intercambioElementos(numeros, elemento1, elemento2);
				elemento1++;
				elemento2--;
			}
		} while (elemento1 <= elemento2);
		if (izq < elemento2)
			ordenamientoQuicksort(numeros, izq, der);
		recorrido++;
		if (elemento1 < der)
			ordenamientoQuicksort(numeros, elemento1, der);
		recorrido++;

		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + numeros.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
}