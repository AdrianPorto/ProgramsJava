public class Sort{
	
	public int[] selectionSort(int[] vetor) {
		
		int tamanho = vetor.length;
		
		for(int i = 0; i < tamanho - 1; i++) {

			
			int indice_menor = i;
			for(int j = i; j < tamanho; j++) {
				if(vetor[j] < vetor[indice_menor]){
					indice_menor = j;
					
					
				}
			}
			if(vetor[i] > vetor[indice_menor]) {
				int aux = vetor[i];
				vetor[i] = vetor[indice_menor];
				vetor[indice_menor] = aux;
				
			}
		}
		
		
		
		return vetor;
	}
	
	
	
	
}
