package application;

public class Main {

	public static void main(String[] args) {
		String texto = "A Reunião de Câmara de Ensino é a oportunidade de compartilhar com corpo acadêmico e técnico da Universidade Franciscana (UFN) todas as ações de ensino e as movimentações estratégicas pensadas juntamente com os cursos, setores administrativos e grupo da Reitoria. No encontro realizado neste dia 22 de agosto (terça-feira), dois grandes temas nortearam a reunião realizada no Auditório do Prédio 7 – Conjunto III: a Mostra UFN e o Dashboard UFN."
				+ "A Mostra UFN, que tem propósito de fortalecer os laços da Universidade com a comunidade, terá a sua edição de 2023 descentralizada ao ser realizada em outras cidades além de Santa Maria. Como é o caso de Faxinal do Soturno que receberá a Mostra contemplando todas as cidades da Quarta Colônia, no dia 30 de agosto. Como explicado pela Diretora de Comunicação, Carina Bohnert e pela Coordenadora de Relacionamento, Laíse Chaves, outros municípios também estão programados para receber esta ação itinerante que compartilhará a vivência universitária a partir de rodas de conversa com egressos locais, espaços de apresentação de projetos, serviços de apoio à comunidade, workshops, oportunidades e entretenimento. Em Santa Maria, a Mostra ocorre no dia 20 de outubro no Conjunto III da UFN."
				+ "De acordo com a Vice-reitora, professora Solange Binotto Fagan, a Mostra UFN está alinhada aos objetivos estratégicos do Plano de Desenvolvimento Institucional (PDI) ao fortalecer eixos de trabalho que colaboram o relacionamento político-institucional; o atendimento à comunidade; inovação e tecnologia; e o ensino-aprendizagem. “Este modelo de Mostra surgiu da nossa Mostra Extensionista pois, ao ver projetos e ações que geram este grande impacto, percebemos que temos que mostrar mais e expandir estes horizontes”, explica a professora Solange ao se referir a primeira Mostra de Extensão UFN com a Comunidade, realizada em junho deste ano e que apresentou o impacto positivo que da Universidade junto à comunidade que está inserida."
				+ "Apresentado pelo Diretor Acadêmico Administrativo, Leonardo de Camargo, o Dashboard UFN é uma plataforma web de gestão de dados com a função de favorecer o acesso à informação e de revisitar a base de tipificação de cadastro do Sistema Acadêmico. Este Painel de Controle com Indicadores foi desenvolvido pelo setor de Tecnologia da Informação e capitaneado pela Pró-reitora Acadêmica (PROAC) para fornecer, aos coordenadores de cursos e gestores, informações atualizadas em tempo real de modo a registrar os movimentos universitários como processos seletivos, matrículas, ingresso e evasão. Além de um conhecimento mais aprofundado do ambiente universitário, estas estatísticas também servirão de norte para as futuras ações da UFN.";

		String[] palavras = texto.split(" ");
		
		Main.quickSort(palavras, 0, palavras.length-1);
		
		for (String palavra : palavras) {
		    System.out.print(palavra + " ");
		}

		
	}

	public static void quickSort(String[] vet, int inicio, int fim) {
		if (inicio < fim) {
			int pivot = particao(vet, inicio, fim);
			quickSort(vet, inicio, pivot - 1);
		}
	}

	public static int particao(String[] vet, int inicio, int fim) {
		String pivot = vet[fim];
		int i = inicio - 1;
		String aux;
		for (int j = inicio; j < fim; j++) {
			if (vet[j].compareTo(pivot) <= 0) {
				i++;
				aux = vet[i];
				vet[i] = vet[j];
				vet[j] = aux;
			}
		}
		aux = vet[i + 1];
		vet[i + 1] = vet[fim];
		vet[fim] = aux;
		return i + 1;
	}

}
