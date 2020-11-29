import java.util.Arrays;

public class OrdenamientoBurbuja {

	// Variables
	private int[] vector;
	private int aux;
	private int recorrido;
	private int comparaciones;
	private int intercambios;

	// Constructor
	public OrdenamientoBurbuja() {

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

	// Método de burbuja 1
	public void ordenamientoBurbuja1(int[] arreglo) {
		vector = arreglo;
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();

		for (int i = 1; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 1000) + 1;
			arreglo[i] = aux;
			recorrido += 1;

			for (int j = 1; j < arreglo.length - 1; j++) {
				comparaciones += 1;
				if (arreglo[j] > arreglo[j + 1]) {
					intercambios++;
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
			}
		}

		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + arreglo.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}

	// Método Burbuja 2
	public void ordenamientoBurbuja2(int[] arreglo) {
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();
		vector = arreglo;
		int i = 0;
		int aux = 0;
		boolean ordenado = false;

		while ((i < vector.length) && (ordenado == false)) {
			recorrido++;
			i++;
			ordenado = true;
			for (int j = 0; j < vector.length - 1; j++) {
				comparaciones++;
				if (vector[j] > vector[j + 1]) {
					intercambios++;
					ordenado = false;
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + arreglo.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
	}
	
	//Método Burbuja 3
	public void ordenamientoBurbuja3(int[] arreglo) {
		long tiempoInicio, tiempoFinal, tiempo;
		tiempoInicio = System.currentTimeMillis();
		vector = arreglo;
		int i = 1;
		int aux = 0;
		boolean ordenado = true;
		
		do{
			recorrido++;
			i++;
			ordenado = true;
			for(int j=0; j<vector.length-i; j++){
				comparaciones++;
				if(vector[j] > vector[j+1]){
					intercambios++;
					ordenado = false;
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}while(!(i<vector.length) || ordenado==true);
		
		tiempoFinal = System.currentTimeMillis();
		tiempo = tiempoFinal - tiempoInicio;
		System.out.println("Total de números: " + arreglo.length);
		System.out.println("Tiempo de ejecución: " + tiempo);
		System.out.println("Recorridos: " + recorrido);
		System.out.println("Comparaciones: " + comparaciones);
		System.out.println(Arrays.toString(arreglo));
		System.out.println(Arrays.toString(vector));
	}
}