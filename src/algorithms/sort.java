package algorithms;

public class sort {

	static void selectionSort(int[] vetor) { 
		int tamanho = vetor.length;
		for (int i = 0; i < (tamanho-1); i++) {
			int min = i;
			for (int j = (i+1); j < tamanho; j++) {
				if(vetor[j] < vetor[min]) 
					min = j;
			}
			if (vetor[i] != vetor[min]) {
				int aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
		}
	}
	
	static void bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		for(int j=0;j<tamanho-1;j++) {
			for(int i=0;i<tamanho-1;i++) {
				if(vetor[i] > vetor[i+1]) {
					int aux = vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1]=aux;
				}
			}
		}
		
	}
	
	static void insertionSort(int[] vetor) {
		int tamanho = vetor.length;
		for(int i = 1; i< tamanho ; i++) {
			int elemento = vetor[i];
			int j = i-1;
			while (j >= 0 && vetor[j] > elemento) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = elemento;
		}
	}
	
	static void mergeSort(int[] vetor) {
		
	}
	
	
}
