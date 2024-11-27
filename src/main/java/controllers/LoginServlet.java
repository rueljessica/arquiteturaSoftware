package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Map;

import camada_dados.DiscenteGateway;
import entidades.result_set.Resultset;
import entidades.result_set.Tabela;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo email e senha do formulário de login
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        // Criando o gateway para consultar os dados do discente
        DiscenteGateway discenteGateway = new DiscenteGateway();
        Resultset rs = discenteGateway.buscarDiscente(email, senha);
        
        // Verificando se o discente foi encontrado no banco
        if (rs != null && !rs.getTabela("discente").getLinhas().isEmpty()) {
            // Obtendo os dados do discente da tabela
            Map<String, Object> linhaDiscente = rs.getTabela("discente").getLinhas().get(0);
            
            // Verificando se os dados de login correspondem
            String storedEmail = (String) linhaDiscente.get("email");
            String storedSenha = (String) linhaDiscente.get("senha");
            
            if (email.equals(storedEmail) && senha.equals(storedSenha)) {
                // Se login bem-sucedido, armazenando os dados do discente na sessão
                HttpSession session = request.getSession();
                session.setAttribute("discente", linhaDiscente);
                
                // Redirecionando para o formulário de criação de pedido de intenção de estágio
                response.sendRedirect("pedidoIntencaoEstagio.jsp");
            } else {
                // Caso a senha ou email estejam incorretos
                request.setAttribute("mensagemErro", "Credenciais invalidas. Tente novamente.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            // Caso o discente não seja encontrado no banco de dados
            request.setAttribute("mensagemErro", "Credenciais invalidas. Tente novamente.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
