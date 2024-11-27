package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Map;

import camada_dominio.EstagioMTE;
import camada_dominio.PedidoIntencaoEstagioMTE;

@WebServlet("/PedidoIntencaoEstagioServlet")
public class PedidoIntencaoEstagioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Recuperando os dados do discente como um HashMap
        Map<String, Object> discente = (Map<String, Object>) session.getAttribute("discente");

        if (discente == null) {
            response.getWriter().println("Erro: Sessao expirada ou usuario nao autenticado.");
            return;
        }

        try {
            // Captura dos parâmetros do formulário
            int creditosCumpridos = Integer.parseInt(request.getParameter("creditosCumpridos"));
            double ira = Double.parseDouble(request.getParameter("ira"));
            int cargaHorariaSemanal = Integer.parseInt(request.getParameter("cargaHorariaSemanal"));
            
            if (!EstagioMTE.verificarRN2(ira)) {
            	response.getWriter().println("<div style='color: red;'>O seu Indice de Rendimento Academico (IRA) precisa ser superior a 6.0 para criar um pedido de intencao de estagio.</div>");
                return;
            }
            
            if (!EstagioMTE.verificarRN1(creditosCumpridos)) {
                response.getWriter().println("<div style='color: red;'>O discente deve ter cumprido os créditos obrigatórios.</div>");
                return;
            }

            if (!EstagioMTE.verificarRN3(cargaHorariaSemanal)) {
                response.getWriter().println("<div style='color: red;'>A carga horária semanal do estágio não pode ser superior a 30 horas.</div>");
                return;
            }


            String enderecoResidencial = request.getParameter("enderecoResidencial");
            boolean primeiroEstagio = Boolean.parseBoolean(request.getParameter("primeiroEstagio"));
            String nomeEmpresa = request.getParameter("nomeEmpresa");
            String enderecoEmpresa = request.getParameter("enderecoEmpresa");
            String modalidadeEstagio = request.getParameter("modalidadeEstagio");
            double valorBolsa = Double.parseDouble(request.getParameter("valorBolsa"));
            String resumoAtividades = request.getParameter("resumoAtividades");
            String conteudosTeoricos = request.getParameter("conteudosTeoricos");
            String motivoIntencao = request.getParameter("motivoIntencao");

            // Chamada ao método para criar o pedido de intenção de estágio
            PedidoIntencaoEstagioMTE.criarPedidoDeIntencao(creditosCumpridos, ira, enderecoResidencial,
                primeiroEstagio, nomeEmpresa, enderecoEmpresa, modalidadeEstagio, cargaHorariaSemanal, valorBolsa,
                resumoAtividades, conteudosTeoricos, motivoIntencao);

            response.getWriter().println("<div style='color: green;'>Seu pedido de intencao de estagio foi criado com sucesso!</div>");
        } catch (Exception e) {
        	response.getWriter().println("<div style='color: red;'>Nao foi possivel criar pedido: " + e.getMessage() + "</div>");
        }
    }
}
