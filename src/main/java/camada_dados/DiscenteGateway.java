package camada_dados;

import entidades.result_set.Resultset;
import entidades.result_set.Tabela;
import java.util.HashMap;
import java.util.Map;

public class DiscenteGateway {

    // Método que simula a recuperação do discente e seus dados
    public Resultset buscarDiscente(String email, String senha) {
        // Criando um Resultset para armazenar os dados do discente
        Resultset resultset = new Resultset();
        
        // Criando a tabela 'discente' e preenchendo com os dados do discente
        Tabela discenteTabela = new Tabela();
        Map<String, Object> linha = new HashMap<>();
        
        // Adicionando dados do discente
        linha.put("email", "jessica@exemplo.com"); // Email do discente
        linha.put("senha", "123456");

        // Adicionando a linha à tabela
        discenteTabela.addLinha(linha);
        
        // Adicionando a tabela 'discente' ao Resultset
        resultset.addTabela("discente", discenteTabela);
        
        return resultset;
    }

    // Método que simula a verificação do IRA e créditos do discente
    public Resultset buscarIraDosUltimosPeriodos(int idDiscente) {
        // Criando um Resultset para armazenar os dados de IRA e créditos dos últimos períodos
        Resultset resultset = new Resultset();
        
        // Criando a tabela 'discente' e preenchendo com dados do IRA e créditos dos últimos períodos
        Tabela discenteTabela = new Tabela();
        Map<String, Object> linha = new HashMap<>();
        
        // Adicionando dados do IRA e créditos dos últimos períodos
        linha.put("ira", 7.5); // IRA do discente
        linha.put("iraUltimosPeriodos", 8.0); // IRA dos últimos períodos
        linha.put("creditosCumpridos", 85); // Créditos cumpridos
        
        // Adicionando a linha à tabela
        discenteTabela.addLinha(linha);
        
        // Adicionando a tabela 'discente' ao Resultset
        resultset.addTabela("discente", discenteTabela);
        
        return resultset;
    }
}
