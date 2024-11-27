<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criar pedido de Intenção de Estágio</title>
</head>
<body>
    <h1>Criar pedido de Intenção de Estágio</h1>
    <form action="PedidoIntencaoEstagioServlet" method="post">
        <label for="ira">IRA:</label>
        <input type="number" id="ira" name="ira" step="0.01" required>
        <br>
        <label for="creditosCumpridos">Créditos Cumpridos:</label>
        <input type="number" id="creditosCumpridos" name="creditosCumpridos" required>
        <br>
        <label for="enderecoResidencial">Endereço Residencial:</label>
        <input type="text" id="enderecoResidencial" name="enderecoResidencial" required>
        <br>
        <label for="primeiroEstagio">É o primeiro estágio?</label>
        <select id="primeiroEstagio" name="primeiroEstagio" required>
            <option value="true">Sim</option>
            <option value="false">Não</option>
        </select>
        <br>
        <label for="nomeEmpresa">Nome da Empresa:</label>
        <input type="text" id="nomeEmpresa" name="nomeEmpresa" required>
        <br>
        <label for="enderecoEmpresa">Endereço da Empresa:</label>
        <input type="text" id="enderecoEmpresa" name="enderecoEmpresa" required>
        <br>
        <label for="modalidadeEstagio">Modalidade do Estágio:</label>
        <input type="text" id="modalidadeEstagio" name="modalidadeEstagio" required>
        <br>
        <label for="cargaHorariaSemanal">Carga Horária Semanal:</label>
        <input type="number" id="cargaHorariaSemanal" name="cargaHorariaSemanal" required>
        <br>
        <label for="valorBolsa">Valor da Bolsa:</label>
        <input type="number" id="valorBolsa" name="valorBolsa" step="0.01" required>
        <br>
        <label for="resumoAtividades">Resumo das Atividades:</label>
        <textarea id="resumoAtividades" name="resumoAtividades" required></textarea>
        <br>
        <label for="conteudosTeoricos">Conteúdos Teóricos:</label>
        <textarea id="conteudosTeoricos" name="conteudosTeoricos" required></textarea>
        <br>
        <label for="motivoIntencao">Motivo da Intenção:</label>
        <textarea id="motivoIntencao" name="motivoIntencao" required></textarea>
        <br>
        <button type="submit">Enviar Pedido</button>
    </form>
</body>
</html>
