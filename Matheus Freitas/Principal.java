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
		int contador = 0;
		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio < fim) {
			int ultimaTroca = 0;

			for (int i = inicio; i < fim; i++) {
				if (vetor[i] > vetor[i + 1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					ultimaTroca = i;
					contador++;
				}
			}
			fim = ultimaTroca;

			for (int i = fim; i > inicio; i--) {
				if (vetor[i] < vetor[i - 1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = aux;
					ultimaTroca = i;
					contador++;
				}
			}
			inicio = ultimaTroca + 1;
		}
		System.out.println("Contador:" + contador);
	}



	public void bubblesort() {
		int t=0;
		int contador=0;
		for(int y=0;y<vetor.length;y++) {
			for(int x=0;x<(vetor.length-1)-t;x++) {
				if(vetor[x]>vetor[x+1]) {
					int aux=vetor[x+1];
					vetor[x+1]=vetor[x];
					vetor[x]=aux;
				}
				contador++;
				this.mostraVetor();
			}
			t++;
		}
		System.out.println("Contador:"+contador);

	}
	public static void main(String[] args) {
		Principal p = new Principal();
		p.shakersort();

	}

}
