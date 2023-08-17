package flamengo;

public class Principal {
	
	int[] vetor = new int[10];
	
	public void mostraVetor() {
		for(int x=0;x<vetor.length;x++) {
			System.out.print(vetor[x]+" ");
		}
		System.out.println();
	}

	public Principal() {
		for(int x=0;x<vetor.length;x++) {
			this.vetor[x]=vetor.length-x;
		}
		this.mostraVetor();
	}

	public void shakersort() {
	    int left = 0;
	    int right = vetor.length - 1;
	    int contador = 0;

	    while (left < right) {
	        boolean swapped = false;

	        for (int i = left; i < right; i++) {
	            if (vetor[i] > vetor[i + 1]) {
	                int aux = vetor[i];
	                vetor[i] = vetor[i + 1];
	                vetor[i + 1] = aux;
	                swapped = true;
	            }
	            contador++;
	        }

	        if (!swapped) {
	            break; 
	        }

	        right--;

	        for (int i = right; i > left; i--) {
	            if (vetor[i] < vetor[i - 1]) {
	                int aux = vetor[i];
	                vetor[i] = vetor[i - 1];
	                vetor[i - 1] = aux;
	                swapped = true;
	            }
	            contador++;
	        }

	        if (!swapped) {
	            break; // Se não houve trocas, o vetor está ordenado
	        }

	        left++;
	    }

	    mostraVetor();
	    System.out.println("Contador: " + contador);
	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.shakersort();

	}

}