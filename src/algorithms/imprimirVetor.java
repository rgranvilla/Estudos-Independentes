package algorithms;

public class imprimirVetor {

	static void ImprimirVetor(int[] vetor) {
		int tamanho = vetor.length;
		System.out.printf("[ ");
		for(int i=0; i<tamanho; i++ ) {
			System.out.printf(vetor[i] + "");
			if (i < tamanho-1) {
				System.out.printf(", ");
			} else System.out.printf(" ]\n");
		} 
	}

}
