public class OrdenamientoShellSort {
	// Variables
	private int[] vector;
	private int aux = 0;
	private int tiempo = 0;
	private int salto = 0;
	private int recorrido = 0;
	private int comparaciones = 0;
	private int intercambios = 0;

	// Constructor
	public OrdenamientoShellSort() {

	}

	// Getters and setter
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

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
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

	// Metodo ShellSort
	public void ordenamientoShellSort(int[] numeros) {
		vector = numeros;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();
		int intervalo = numeros.length / 2;

		while (intervalo > 0) {
			for (int i = 0; i < numeros.length; i++) {
				recorrido++;
				int j = i - intervalo;
				while (j >= 0) {
					int k = j + intervalo;
					if (numeros[j] <= numeros[k]) {
						comparaciones++;
						j = -1;
					} else {
						intercambios++;
						recorrido++;
						int aux = numeros[j];
						numeros[j] = numeros[k];
						numeros[k] = aux;
						j -= intervalo;
					}
				}
			}
			intervalo = intervalo / 2;
		}
		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + numeros.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
}
