import java.util.Arrays;
import java.util.Scanner;

class Vector {
	public int[] elementos(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 100);
		}
		return arreglo;
	}
}

public class MenuOrdenamientoBurbuja {
	OrdenamientoBurbuja metodosBurbuja = new OrdenamientoBurbuja();
	Vector vector = new Vector();
	Scanner elementos = new Scanner(System.in);

	// 1000 Elementos
	public int[] milElementos() {
		int[] arreglo;
		int cantidad = 1000;
		arreglo = new int[cantidad];
		arreglo = vector.elementos(arreglo);
		return arreglo;
	}

	// 10000 Elementos
	public int[] diezMilElementos() {
		int[] arreglo;
		int cantidad = 10000;
		arreglo = new int[cantidad];
		arreglo = vector.elementos(arreglo);
		return arreglo;
	}

	// 100000 Elementos
	public int[] cienMilElementos() {
		int[] arreglo;
		int cantidad = 100000;
		arreglo = new int[cantidad];
		arreglo = vector.elementos(arreglo);
		return arreglo;
	}

	// 1 000 000 Elementos
	public int[] millonElementos() {
		int[] arreglo;
		int cantidad = 1000000;
		arreglo = new int[cantidad];
		arreglo = vector.elementos(arreglo);
		return arreglo;
	}

	// Menú
	public void menuOrdenamientoBurbuja() {
		System.out.println("\n1) MÉTODO BURBUJA 1");
		System.out.println("2) MÉTODO BURBUJA 2");
		System.out.println("3) MÉTODO BURBUJA 3");
		System.out.println("4) SALIR");
		System.out.println("INGRESA UNA OPCIÓN");
		byte opc = elementos.nextByte();

		switch (opc) {
		case 1:
			System.out.println("\t MÉTODO BURBUJA 1");
			System.out.println("1) ELEMENTOS ---> 1 000");
			System.out.println("2) ELEMENTOS ---> 10 000");
			System.out.println("3) ELEMENTOS ---> 100 000");
			System.out.println("4) ELEMENTOS --->  1 000 000");
			System.out.println("Ingrese el numero de la opcion a elegir del tamaño del vector: ");
			opc = elementos.nextByte();

			switch (opc) {
			case 1:
				System.out.println("\t MÉTODO BURBUJA 1 CON 1 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(milElementos()));
				metodosBurbuja.ordenamientoBurbuja1(milElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(milElementos()));
				break;

			case 2:
				System.out.println("\t MÉTODO BURBUJA 1 CON 10 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(diezMilElementos()));
				metodosBurbuja.ordenamientoBurbuja1(diezMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(diezMilElementos()));
				break;

			case 3:
				System.out.println("\t MÉTODO BURBUJA 1 CON 100 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(cienMilElementos()));
				metodosBurbuja.ordenamientoBurbuja1(cienMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(cienMilElementos()));
				break;

			case 4:
				System.out.println("\t MÉTODO BURBUJA 1 CON 1 000 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(millonElementos()));
				metodosBurbuja.ordenamientoBurbuja1(millonElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(millonElementos()));
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
			menuOrdenamientoBurbuja();
			break;

		case 2:
			System.out.println("\t MÉTODO BURBUJA 2");
			System.out.println("1) ELEMENTOS ---> 1 000");
			System.out.println("2) ELEMENTOS ---> 10 000");
			System.out.println("3) ELEMENTOS ---> 100 000");
			System.out.println("4) ELEMENTOS --->  1 000 000");
			System.out.println("Ingrese el numero de la opcion a elegir del tamaño del vector: ");
			opc = elementos.nextByte();

			switch (opc) {
			case 1:
				System.out.println("\t MÉTODO BURBUJA 2 CON 1 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(milElementos()));
				metodosBurbuja.ordenamientoBurbuja2(milElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(milElementos()));
				break;

			case 2:
				System.out.println("\t MÉTODO BURBUJA 2 CON 10 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(diezMilElementos()));
				metodosBurbuja.ordenamientoBurbuja2(diezMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(diezMilElementos()));
				break;

			case 3:
				System.out.println("\t MÉTODO BURBUJA 2 CON 100 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(cienMilElementos()));
				metodosBurbuja.ordenamientoBurbuja2(cienMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(cienMilElementos()));
				break;

			case 4:
				System.out.println("\t MÉTODO BURBUJA 2 CON 1 000 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(millonElementos()));
				metodosBurbuja.ordenamientoBurbuja2(millonElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(millonElementos()));
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
			menuOrdenamientoBurbuja();
			break;

		case 3:
			System.out.println("\t MÉTODO BURBUJA 2");
			System.out.println("1) ELEMENTOS ---> 1 000");
			System.out.println("2) ELEMENTOS ---> 10 000");
			System.out.println("3) ELEMENTOS ---> 100 000");
			System.out.println("4) ELEMENTOS --->  1 000 000");
			System.out.println("Ingrese el numero de la opcion a elegir del tamaño del vector: ");
			opc = elementos.nextByte();

			switch (opc) {
			case 1:
				System.out.println("\t MÉTODO BURBUJA 3 CON 1 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(milElementos()));
				metodosBurbuja.ordenamientoBurbuja3(milElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(milElementos()));
				break;

			case 2:
				System.out.println("\t MÉTODO BURBUJA 3 CON 10 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(diezMilElementos()));
				metodosBurbuja.ordenamientoBurbuja3(diezMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(diezMilElementos()));
				break;

			case 3:
				System.out.println("\t MÉTODO BURBUJA 3 CON 100 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(cienMilElementos()));
				metodosBurbuja.ordenamientoBurbuja3(cienMilElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(cienMilElementos()));
				break;

			case 4:
				System.out.println("\t MÉTODO BURBUJA 3 CON 1 000 000 ELEMENTOS");
				System.out.println("Arreglo Original: \n\t" + Arrays.toString(millonElementos()));
				metodosBurbuja.ordenamientoBurbuja3(millonElementos());
				System.out.println("Arreglo Ordenado: \n\t" + Arrays.toString(millonElementos()));
				break;

			default:
				System.out.println("Opcion Incorrecta");
				break;
			}
			menuOrdenamientoBurbuja();
			break;

		case 4:
			System.out.println("-----------------------------------------------------");
			break;

		default:
			System.out.println("Opcion Incorrecta");
			break;
		}
	}
}