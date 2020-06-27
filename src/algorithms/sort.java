package algorithms;

import java.util.Arrays;

public class sort {

/***	Método Selection Sort	***/	
//	
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

/***	Método Bubble Sort	***/
//	
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
	
/***	Método Insertion Sort ***/		
//	
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
	
	
/***		Método mergeSort	***/	
	
//	Inicializa o método a partir de um vetor de inteiros
//	
	static void mergeSort(int[] vetor) {
		int inicio=0;
		int fim = vetor.length;

		if(fim - inicio > 1) {
			int meio = (fim + inicio)/2;
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio, fim);
			merge(vetor, inicio, meio, fim);
		}
	}
	
//	Metodo recursivo, o mergeSort(vetor) chama o metodo mergeSort(vetor, inicio, fim)	
//	Neste método o mergeSort(vetor, inicio, fim) é chamando até que o vetor tenha tamanho 1
//	Então o método merge(vetor, inicio, meio, fim) é chamado.	
//	
	static void mergeSort(int[] vetor, int inicio , int fim ) {

		if(fim - inicio > 1) {
			int meio = (fim + inicio)/2;
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio, fim);
			merge(vetor, inicio, meio, fim);
		}
	}

//	Este método é responsável por organizar e unir o vetor original. 
//	É um método recursivo, começando com um vetor de tamanho 1 até o vetor com a metade tamanho
//	
//	
	static void merge(int[] vetor, int inicio, int meio, int fim) {
		int[] left = Arrays.copyOfRange(vetor, inicio, meio);
		int[] right = Arrays.copyOfRange(vetor, meio, fim);
		int top_left = 0;
		int top_right = 0;

		for(int k = inicio; k < fim; k++) {
			if(top_left >= left.length) {
				vetor[k] = right[top_right];
				top_right++;
			} else 
				if(top_right >= right.length) {
					vetor[k] = left[top_left];
					top_left++;
				} else
					if(left[top_left] < right[top_right]) {
						vetor[k] = left[top_left];
						top_left++;
					}else {
						vetor[k] = right[top_right];
						top_right++;
					}
		}
	}
	

// Método QuickSort
	
	static void quickSort(int[] vetor) {
		int inicio=0;
		int fim = vetor.length-1;
		
		if(inicio < fim) {
			int pivot  = partition(vetor, inicio, fim);
			quickSort(vetor, inicio, pivot-1);
			quickSort(vetor, pivot+1, fim);
		}
	}
	
	static void quickSort(int[] vetor, int inicio, int fim) {
		
		if(inicio < fim) {
			int pivot  = partition(vetor, inicio, fim);
			quickSort(vetor, inicio, pivot-1);
			quickSort(vetor, pivot+1, fim);
		}
	}
	
	public static int partition(int[] vetor, int inicio, int fim) {
		int pivot = vetor[fim];
		int i = inicio;
		for(int j = inicio; j < fim; j++) {
			if(vetor[j] <= pivot) {
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i = i+1;
			}
		}
		int aux = vetor[fim];
		vetor[fim] = vetor[i];
		vetor[i] = aux;
		return i;
				
		
	}
}

