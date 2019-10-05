<%@ page import="model.Pessoa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: vitormotta
  Date: 9/28/19
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="bootstrap-4.3.1-dist/css/bootstrap.min.css"/>
</head>
<body>
    <h1>LISTAR PESSOA</h1>

    <table class="table-bordered">
        <tr>
            <td>ID</td>
            <td>NOME</td>
            <td>CPF</td>
            <td>RG</td>
        </tr>
        <%

            for(Pessoa p:(List<Pessoa>)request.getAttribute("lista")){
                out.print("<tr>");
                out.print("<td>" + p.getId() + "</td>");
                out.print("<td>" + p.getNome() + "</td>");
                out.print("<td>" + p.getCpf() + "</td>");
                out.print("<td>" + p.getRg() + "</td>");
                out.print("</tr>");
            }
        %>
    </table>
</body>
</html>
