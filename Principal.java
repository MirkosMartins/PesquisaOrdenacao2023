package source;

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

	public void shakersort() {//ou COCKTAILSORT
		int contador=0;
		for(int z=0;z<vetor.length;z++) {
		for(int x=0;x<vetor.length-1;x++) {
			if(vetor[x]>vetor[x+1]) {
				int aux = vetor[x+1];
				vetor[x+1]=vetor[x];
				vetor[x]=aux;
			}
			contador++;
			this.mostraVetor();
		}
		for(int y=vetor.length-1;y>0;y--) {
			if(vetor[y]<vetor[y-1]) {
				int aux = vetor[y-1];
				vetor[y-1]=vetor[y];
				vetor[y]=aux;
			}
			contador++;
			this.mostraVetor();
		}
		}//fim do for "z"
		System.out.println("Contador:"+contador);
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
