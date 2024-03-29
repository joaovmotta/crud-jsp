import model.Pessoa;
import service.PessoaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "PessoaServlet")
public class PessoaServlet extends HttpServlet {

    private PessoaService service;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");

        Pessoa pessoa = new Pessoa(nome, rg, cpf);
        service = new PessoaService();
        Boolean resultado = service.salvarPessoa(pessoa);

        response.sendRedirect("pessoa");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        service = new PessoaService();
        List<Pessoa> pessoas = service.buscarPessoa();
        request.setAttribute("lista", pessoas);
        request.getRequestDispatcher("/listar-pessoa.jsp"). forward (request, response);
    }

}
