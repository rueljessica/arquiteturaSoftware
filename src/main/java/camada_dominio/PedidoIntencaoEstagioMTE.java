package camada_dominio;

import camada_dados.PedidoIntencaoEstagioGateway;
import entidades.PedidoIntencaoEstagio;
import entidades.result_set.Resultset;

public class PedidoIntencaoEstagioMTE {

	public static Resultset criarPedidoDeIntencao(int creditosCumpridos, double ira,
            String enderecoResidencial, boolean primeiroEstagio,
            String nomeEmpresa, String enderecoEmpresa,
            String modalidadeEstagio, int cargaHorariaSemanal,
            double valorBolsa, String resumoAtividades,
            String conteudosTeoricos, String motivoIntencao) throws Exception {
	
		// Validações
		if (!EstagioMTE.verificarRN1(creditosCumpridos)) {
		throw new Exception("O(a) discente tem que ter cumprido 80 (oitenta) creditos dentre as disciplinas obrigatorias.");
		}
		
		if (!EstagioMTE.verificarRN2(ira)) {
		throw new Exception("O(a) discente tem que ter o Indice de Rendimento Academico (IRA) maior ou igual a 6,0.");
		}
		
		if (!EstagioMTE.verificarRN3(cargaHorariaSemanal)) {
		throw new Exception("O Estagio Supervisionado devera ter carga horaria maxima de 30 horas por semana.");
		}
		
		// Criando o pedido
		PedidoIntencaoEstagio pedido = new PedidoIntencaoEstagio(cargaHorariaSemanal, null, primeiroEstagio, nomeEmpresa, enderecoEmpresa, modalidadeEstagio, 
		                           cargaHorariaSemanal, valorBolsa, resumoAtividades, 
		                           conteudosTeoricos, motivoIntencao);
		
		// Agora chamamos a camada de dados para persistir o pedido
		PedidoIntencaoEstagioGateway gateway = new PedidoIntencaoEstagioGateway();
		Resultset resultset = gateway.salvarPedido(pedido);
		
		System.out.println("Pedido criado com sucesso!");
		
		return resultset;  // Retorna o Resultset com o pedido salvo
	}
}