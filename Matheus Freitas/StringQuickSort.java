import java.io.IOException;

	public class StringQuickSort {

	    String names[];
	    int length;
	    static int count = 0;
	    static int count2 = 0;

	    public static void main(String[] args) {
	        StringQuickSort sorter = new StringQuickSort();
	        String text = "A Reunião de Câmara de Ensino é a oportunidade de compartilhar com corpo acadêmico e técnico da Universidade Franciscana (UFN) todas as ações de ensino e as movimentações estratégicas pensadas juntamente com os cursos, setores administrativos e grupo da Reitoria. No encontro realizado neste dia 22 de agosto (terça-feira), dois grandes temas nortearam a reunião realizada no Auditório do Prédio 7 – Conjunto III: a Mostra UFN e o Dashboard UFN."
	        		+ "A Mostra UFN, que tem propósito de fortalecer os laços da Universidade com a comunidade, terá a sua edição de 2023 descentralizada ao ser realizada em outras cidades além de Santa Maria. Como é o caso de Faxinal do Soturno que receberá a Mostra contemplando todas as cidades da Quarta Colônia, no dia 30 de agosto. Como explicado pela Diretora de Comunicação, Carina Bohnert e pela Coordenadora de Relacionamento, Laíse Chaves, outros municípios também estão programados para receber esta ação itinerante que compartilhará a vivência universitária a partir de rodas de conversa com egressos locais, espaços de apresentação de projetos, serviços de apoio à comunidade, workshops, oportunidades e entretenimento. Em Santa Maria, a Mostra ocorre no dia 20 de outubro no Conjunto III da UFN."
	        		+ "De acordo com a Vice-reitora, professora Solange Binotto Fagan, a Mostra UFN está alinhada aos objetivos estratégicos do Plano de Desenvolvimento Institucional (PDI) ao fortalecer eixos de trabalho que colaboram o relacionamento político-institucional; o atendimento à comunidade; inovação e tecnologia; e o ensino-aprendizagem. “Este modelo de Mostra surgiu da nossa Mostra Extensionista pois, ao ver projetos e ações que geram este grande impacto, percebemos que temos que mostrar mais e expandir estes horizontes”, explica a professora Solange ao se referir a primeira Mostra de Extensão UFN com a Comunidade, realizada em junho deste ano e que apresentou o impacto positivo que da Universidade junto à comunidade que está inserida."
	        		+ "Apresentado pelo Diretor Acadêmico Administrativo, Leonardo de Camargo, o Dashboard UFN é uma plataforma web de gestão de dados com a função de favorecer o acesso à informação e de revisitar a base de tipificação de cadastro do Sistema Acadêmico. Este Painel de Controle com Indicadores foi desenvolvido pelo setor de Tecnologia da Informação e capitaneado pela Pró-reitora Acadêmica (PROAC) para fornecer, aos coordenadores de cursos e gestores, informações atualizadas em tempo real de modo a registrar os movimentos universitários como processos seletivos, matrículas, ingresso e evasão. Além de um conhecimento mais aprofundado do ambiente universitário, estas estatísticas também servirão de norte para as futuras ações da UFN.";
	        String[] words = text.split(" ");
	        String[] uniqueWords = removeDuplicates(words);
	        sorter.sort(uniqueWords);
	        sorter.bubbleSort(uniqueWords);

	        System.out.println("Quicksort: " + count + " Bubblesort: " + count2);
	    }

	    void sort(String array[]) {
	        if (array == null || array.length == 0) {
	            return;
	        }
	        this.names = array;
	        this.length = array.length;
	        quickSort(0, length - 1);
	    }
	    
	     void bubbleSort(String[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j].compareTo(arr[j + 1]) > 0) {
	                    String temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    count2++;
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    void quickSort(int lowerIndex, int higherIndex) {
	        int i = lowerIndex;
	        int j = higherIndex;
	        count++;
	        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

	        while (i <= j) {
	            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
	            	count++;
	                i++;
	            }
	            
	            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
	            	count++;
	                j--;
	            }

	            if (i <= j) {
	                exchangeNames(i, j);
	                count++;
	                i++;
	                j--;
	            }
	        }
	        if (lowerIndex < j) {
	        	count++;
	            quickSort(lowerIndex, j);
	        }
	        if (i < higherIndex) {
	        	count++;
	            quickSort(i, higherIndex);
	        }
	    }

	    void exchangeNames(int i, int j) {
	        String temp = this.names[i];
	        this.names[i] = this.names[j];
	        count++;
	        this.names[j] = temp;
	    }
	    
	    public static String[] removeDuplicates(String[] arr) {
	        int n = arr.length;
	        int uniqueCount = 0;

	        for (int i = 0; i < n - 1; i++) {
	            if (!arr[i].equals(arr[i + 1])) {
	                uniqueCount++;
	            }
	        }
	        uniqueCount++;

	        String[] uniqueArr = new String[uniqueCount];
	        int index = 0;
	        uniqueArr[index++] = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (!arr[i].equals(arr[i - 1])) {
	                uniqueArr[index++] = arr[i];
	            }
	        }

	        return uniqueArr;
	    }
	}
