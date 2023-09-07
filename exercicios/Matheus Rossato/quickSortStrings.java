package quickSort;
import java.util.ArrayList;
import java.util.List;


public class quickSortStrings {
	private static int quickSortCalls = 0;
	
    public static void main(String[] args) {
    	 String text = "A Reunião de Câmara de Ensino é a oportunidade de compartilhar com corpo acadêmico e técnico da Universidade Franciscana (UFN) todas as ações de ensino e as movimentações estratégicas pensadas juntamente com os cursos, setores administrativos e grupo da Reitoria. No encontro realizado neste dia 22 de agosto (terça-feira), dois grandes temas nortearam a reunião realizada no Auditório do Prédio 7 – Conjunto III: a Mostra UFN e o Dashboard UFN.\"\r\n"
         		+ "A Mostra UFN, que tem propósito de fortalecer os laços da Universidade com a comunidade, terá a sua edição de 2023 descentralizada ao ser realizada em outras cidades além de Santa Maria. Como é o caso de Faxinal do Soturno que receberá a Mostra contemplando todas as cidades da Quarta Colônia, no dia 30 de agosto. Como explicado pela Diretora de Comunicação, Carina Bohnert e pela Coordenadora de Relacionamento, Laíse Chaves, outros municípios também estão programados para receber esta ação itinerante que compartilhará a vivência universitária a partir de rodas de conversa com egressos locais, espaços de apresentação de projetos, serviços de apoio à comunidade, workshops, oportunidades e entretenimento. Em Santa Maria, a Mostra ocorre no dia 20 de outubro no Conjunto III da UFN.\"\r\n"
         		+ "De acordo com a Vice-reitora, professora Solange Binotto Fagan, a Mostra UFN está alinhada aos objetivos estratégicos do Plano de Desenvolvimento Institucional (PDI) ao fortalecer eixos de trabalho que colaboram o relacionamento político-institucional; o atendimento à comunidade; inovação e tecnologia; e o ensino-aprendizagem. “Este modelo de Mostra surgiu da nossa Mostra Extensionista pois, ao ver projetos e ações que geram este grande impacto, percebemos que temos que mostrar mais e expandir estes horizontes”, explica a professora Solange ao se referir a primeira Mostra de Extensão UFN com a Comunidade, realizada em junho deste ano e que apresentou o impacto positivo que da Universidade junto à comunidade que está inserida.\"\r\n"
         		+ "Apresentado pelo Diretor Acadêmico Administrativo, Leonardo de Camargo, o Dashboard UFN é uma plataforma web de gestão de dados com a função de favorecer o acesso à informação e de revisitar a base de tipificação de cadastro do Sistema Acadêmico. Este Painel de Controle com Indicadores foi desenvolvido pelo setor de Tecnologia da Informação e capitaneado pela Pró-reitora Acadêmica (PROAC) para fornecer, aos coordenadores de cursos e gestores, informações atualizadas em tempo real de modo a registrar os movimentos universitários como processos seletivos, matrículas, ingresso e evasão. Além de um conhecimento mais aprofundado do ambiente universitário, estas estatísticas também servirão de norte para as futuras ações da UFN\n";
         String[] words = text.split(" ");
        
        System.out.println("Array original:");
        printArray(words);
        
        quickSort(words, 0, words.length - 1);
        
        String[] uniqueWords = removeDuplicates(words);
        
        for (String word : uniqueWords) {
            System.out.print(word + "\n");
        }

        int contWords = uniqueWords.length;
        System.out.println("\nArray ordenado:");        
        printArray(words);
        
        System.out.println("Number of words: "+contWords);        
        System.out.println("Number of calls quickSort: "+quickSortCalls);
    }

    public static void quickSort(String[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
            
            quickSortCalls ++;
        }
    }

    public static int partition(String[] arr, int left, int right) {
        String pivot = arr[right];
        int i = left - 1;
        
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static String[] removeDuplicates(String[] Array) {
    	List<String> uniqueWords = new ArrayList<>();
    	uniqueWords.add(Array[0]);
    	
    	for(int i = 1; i < Array.length;i++) {
    		if (!Array[i].equals(Array[i - 1])) {
    			uniqueWords.add(Array[i]);
    		}
    	}
    	return uniqueWords.toArray(new String[0]);
    }

    public static void printArray(String[] arr) {
        for (String word : arr) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
