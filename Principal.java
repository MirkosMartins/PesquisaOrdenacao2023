package teste;

public class Principal {

	int[] vetor = new int[10];

	public void mostraVetor() {
		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + " ");
		}
		System.out.print("\n");
	}

	public Principal() {
		for (int x = 0; x < vetor.length; x++) {
			this.vetor[x] = vetor.length - x;
		}
	}

	// METODO QUE JOGA O MAIOR PRA UM LADO E O MENOR PARA OUTRO
	public void shakersort() {
		int s = 0;
		int c = 0;
		int contador = 0;
		for (int k = 0; k < vetor.length/2 ; k++) {
			for (int i = s; i < (vetor.length - 1) - c; i++) {
				if (vetor[i] > vetor[i+1]) {
					int aux = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = aux;
				}
				contador++;
				this.mostraVetor();
			}
			c++;

			for (int y = (vetor.length - 1)-c; y > 0 ; y--) {
				if (vetor[y] < vetor[y-1]) {
					int aux = vetor[y-1];
					vetor[y-1] = vetor[y];
					vetor[y] = aux;
				}
				contador++;
				this.mostraVetor();
			}
			s++;
		}
		System.out.println("Contador: " + contador);
	}

	
	
	// ESSE METODO JOGA O MAIOR PRA CIMA/DIREITA
	public void bubblesort() {
		int t = 0;
		int contador = 0;
		for (int y = 0; y < vetor.length; y++) {
			for (int x = 0; x < (vetor.length - 1) - t; x++) {
				if (vetor[x] > vetor[x + 1]) {
					int aux = vetor[x + 1];
					vetor[x + 1] = vetor[x];
					vetor[x] = aux;
				}
			contador++;
				this.mostraVetor();
			}
			t++;
		}
	}

	public static void main(String[] args) {

		Principal p = new Principal();
		p.shakersort();
	}

}
