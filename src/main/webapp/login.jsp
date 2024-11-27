<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha" required><br><br>
        <input type="submit" value="Entrar">
    </form>
    
    <!-- Exibir mensagem de erro -->
    <c: if test="${not empty mensagemErro}">
        <p style="color: red">${mensagemErro}</p>
    </c: if>
</body>
</html>