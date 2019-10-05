<%--
  Created by IntelliJ IDEA.
  User: vitormotta
  Date: 10/5/19
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link type="text/css" rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.min.css"/>
</head>
<body>
    <button id="addPessoa" class="btn btn-primary">Adicionar nova Pessoa</button>
    <button id="buscarPessoas" class="btn btn-primary">Buscar pessoas já cadastradas</button>
</body>
<script>

    document.querySelector("#buscarPessoas").addEventListener("click", function (){
        window.location = "http://localhost:8080/web_war_exploded/pessoa";
    });

    document.querySelector("#addPessoa").addEventListener("click", function (){
        window.location = "http://localhost:8080/web_war_exploded/add-pessoa.jsp";
    });

</script>
</html>
