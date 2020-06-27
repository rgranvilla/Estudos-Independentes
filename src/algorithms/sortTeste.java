package algorithms;
import java.util.Random;


public class sortTeste {

	static int tamanho = 6; // Tamanho do vetor a ser gerado para o teste.
	static int[] vetor = new int[tamanho];

	public static void main(String[] args) {

		// Código para gerar o vetor com números randômicos.

		Random numeroAleatorio = new Random();

//		int[] vetorInverso = {9,8,7,6,5,4,3,2,1,0};
		
		
		for (int i=0; i<tamanho; i++) {
			vetor[i] = numeroAleatorio.nextInt(100);
		}
		
		imprimirVetor.ImprimirVetor(vetor);
		sort.mergeSort(vetor);
		imprimirVetor.ImprimirVetor(vetor);
		
//		imprimirVetor.ImprimirVetor(vetorInverso);
//		sort.quickSort(vetorInverso);
//		imprimirVetor.ImprimirVetor(vetorInverso);
	
	}

}