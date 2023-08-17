package TRABALHO;

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
		boolean troca;
		
		for (int z = 0; z < vetor.length; z++) {
		    troca = false;

		    for (int x = 0; x < vetor.length - 1; x++) {
		        if (vetor[x] > vetor[x + 1]) {
		            int aux = vetor[x + 1];
		            vetor[x + 1] = vetor[x];
		            vetor[x] = aux;
		            troca = true;
		        }
		        contador++;
		    }
		    
		    if (!troca) {
		        break; // Se nenhuma troca ocorreu, o vetor está ordenado
		    }
			this.mostraVetor();
			
		}
		System.out.println("Contador:"+contador);
		}//fim do for "z"
		
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
