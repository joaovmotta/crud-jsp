package service;

import model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaService {

    private static final String INSERT_QUERY = "INSERT INTO pessoa (NOME, RG, CPF) VALUES (?,?,?)";
    private Connection conexao;

    public Boolean salvarPessoa(Pessoa pessoa){

        conexao = Conexao.getInstance();

        try {

            PreparedStatement statement = conexao.prepareStatement(INSERT_QUERY);
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getRg());
            statement.setString(3, pessoa.getCpf());

            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
