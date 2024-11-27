package entidades.result_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Classe que representa uma tabela no Resultset.
 */
public class Tabela {
    private List<Map<String, Object>> linhas; // Cada linha é um mapa (coluna -> valor)

    // Construtor padrão
    public Tabela() {
        this.linhas = new ArrayList<>();
    }

    /**
     * Retorna todas as linhas da tabela.
     * 
     * @return Lista de mapas representando as linhas
     */
    public List<Map<String, Object>> getLinhas() {
        return linhas;
    }

    /**
     * Retorna a primeira linha da tabela.
     * 
     * @return Primeiro mapa de colunas e valores ou null se a tabela estiver vazia
     */
    public Map<String, Object> getPrimeiraLinha() {
        if (linhas.isEmpty()) {
            return null;
        }
        return linhas.get(0);
    }

    /**
     * Retorna o valor de uma coluna específica na primeira linha.
     * 
     * @param coluna Nome da coluna
     * @return Valor da coluna ou null se não existir
     */
    public Object getValor(String coluna) {
        Map<String, Object> primeiraLinha = getPrimeiraLinha();
        if (primeiraLinha == null) {
            System.out.println("A tabela está vazia.");
            return null;
        }

        Object valor = primeiraLinha.get(coluna);
        if (valor == null) {
            System.out.println("Campo '" + coluna + "' nao encontrado na primeira linha.");
        }
        return valor;
    }

    /**
     * Adiciona uma linha à tabela.
     * 
     * @param linha Mapa representando a linha a ser adicionada
     */
    public void addLinha(Map<String, Object> linha) {
        if (linha != null && !linha.isEmpty()) {
            linhas.add(linha);
            System.out.println("Linha adicionada: " + linha);
        } else {
            System.out.println("Erro: Linha nao pode ser nula ou vazia.");
        }
    }

    @Override
    public String toString() {
        return "Tabela{" +
               "linhas=" + linhas +
               '}';
    }
}
