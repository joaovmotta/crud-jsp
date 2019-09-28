<%@ page import="java.io.PrintWriter" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CRUD</title>
    <link type="text/css" rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.min.css"/>
  </head>
  <body>

    <div class="container">
      <h1>Adicionar uma nova pessoa:</h1>
      <form method="post" action="pessoa">
        <label>Nome:</label>
        <input type="text" placeholder="Digite seu nome" name="nome" id="nome" class="form-control"><br />
        <label>RG:</label>
        <input type="text" placeholder="Digite seu rg" name="rg" id="rg" class="form-control"><br />
        <label>CPF:</label>
        <input type="text" placeholder="Digite seu cpf" name="cpf" id="cpf" class="form-control"><br />
        <input type="submit" value="Enviar" class="btn btn-primary">
        <input type="reset" value="Limpar" class="btn btn-warning">
      </form>
    </div>
  </body>
</html>