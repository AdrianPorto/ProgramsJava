import java.util.Random;

public class Utils {
	public int[] getVetorOrdenado(int tamanho) {
		int[] vetor = new int[tamanho];
		
		Random random = new Random();
		
		int inicio = random.nextInt(50);
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = i + inicio;
		}
		
		return vetor;
	}
	
	public int[] getVetorInverso(int tamanho) {
		int[] vetor = new int[tamanho];
		
		Random random = new Random();
		
		int inicio = random.nextInt(50);
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = inicio - i;
		}
		
		return vetor;
	}
	
	public int[] getVetorRepetido(int tamanho, int nValoresRepetidos) {
		int[] vetor = new int[tamanho];
				
		Random random = new Random();
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(50);
		}
		
		if(nValoresRepetidos <= tamanho) {
			
			for(int i = 0; i < nValoresRepetidos; i++) {
				vetor[random.nextInt(tamanho)] = vetor[random.nextInt(tamanho)];
			}
		}
		
		return vetor;
	}
	
	public int[] getVetorAleatorio(int tamanho) {
		int[] vetor = new int[tamanho];
		
		Random random = new Random();
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(50);
		}
		
		return vetor;
	}
}
