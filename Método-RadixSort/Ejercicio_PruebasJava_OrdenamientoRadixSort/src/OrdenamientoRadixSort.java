public class OrdenamientoRadixSort {

	// Variables
	private int[] vector;
	private int aux = 0;
	private int tiempo = 0;
	private int recorrido = 0;
	private int comparaciones = 0;
	private int intercambios = 0;

	// Constructot
	public OrdenamientoRadixSort() {

	}

	// Getters and aetters
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

	public void ordenamientoRadixSort(int[] numeros) {
		vector = numeros;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();

		if (numeros.length == 0)
			return;
		int[][] np = new int[numeros.length][2];
		int[] q = new int[0x100];
		int i, j, k, l, f = 0;
		for (k = 0; k < 4; k++) {
			for (i = 0; i < (np.length - 1); i++)
				recorrido++;
			np[i][1] = i + 1;
			np[i][1] = -1;
			for (i = 0; i < q.length; i++)
			q[i] = -1;
			for (f = i = 0; i < numeros.length; i++) {
				j = ((0xFF << (k << 3)) & numeros[i]) >> (k << 3);
				if (q[j] == -1)
					l = q[j] = f;
				else {
					l = q[j];
					while (np[l][1] != -1)
						l = np[l][1];
					np[l][1] = f;
					l = np[l][1];
					recorrido++;
					comparaciones++;
					intercambios++;
				}
				f = np[f][1];
				np[l][0] = numeros[i];
				np[l][1] = -1;
			}
			for (l = q[i = j = 0]; i < 0x100; i++)
				for (l = q[i]; l != -1; l = np[l][1])
					numeros[j++] = np[l][0];
		}

		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + numeros.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
}