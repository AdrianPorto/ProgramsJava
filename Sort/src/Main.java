public class Main {

	public static void main(String[] args) {
		Sort sort = new Sort();
		Utils utils = new Utils();
		int tamanho = 10;
		
		int[] vetor_inicial;
		
		vetor_inicial = utils.getVetorRepetido(tamanho, 3);
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetor_inicial[i]);
		}
		
		System.out.println("\n====");
		
		int[] vetor_ordenado = sort.selectionSort(vetor_inicial);
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetor_ordenado[i]);
		}
	}

}