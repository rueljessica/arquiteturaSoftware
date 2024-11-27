package entidades.result_set;

import java.util.HashMap;
import java.util.Map;

public class Resultset {
    private Map<String, Tabela> tabelas; // Armazena as tabelas pelo nome

    // Construtor padrão
    public Resultset() {
        this.tabelas = new HashMap<>();
    }

    /**
     * Adiciona uma tabela ao resultset.
     * 
     * @param nomeTabela Nome da tabela
     * @param tabela     Objeto Tabela contendo os dados
     */
    public void addTabela(String nomeTabela, Tabela tabela) {
        if (nomeTabela != null && tabela != null) {
            tabelas.put(nomeTabela, tabela);
            System.out.println("Tabela adicionada: " + nomeTabela);
        } else {
            System.out.println("Erro: Nome da tabela ou objeto Tabela eh nulo.");
        }
    }

    /**
     * Recupera uma tabela pelo nome.
     * 
     * @param nomeTabela Nome da tabela a ser recuperada
     * @return Objeto Tabela ou null se não existir
     */
    public Tabela getTabela(String nomeTabela) {
        return tabelas.get(nomeTabela);
    }

    /**
     * Recupera o valor de uma coluna na primeira linha de uma tabela específica.
     * 
     * @param nomeTabela Nome da tabela
     * @param coluna     Nome da coluna
     * @return Valor na primeira linha da coluna ou null se não existir
     */
    public Object getValor(String nomeTabela, String coluna) {
        Tabela tabela = getTabela(nomeTabela);
        if (tabela != null) {
            return tabela.getValor(coluna);
        } else {
            System.out.println("Tabela '" + nomeTabela + "' nao encontrada.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Resultset{" +
               "tabelas=" + tabelas +
               '}';
    }
}
