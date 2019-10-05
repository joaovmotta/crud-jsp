package service;

import model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private static final String INSERT_QUERY = "INSERT INTO pessoa (NOME, RG, CPF) VALUES (?,?,?)";
    private static final String BUSCAR_QUERY = "SELECT * FROM pessoa";
    private Connection conexao;
    private ResultSet rs;

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

    public List<Pessoa> buscarPessoa(){

        conexao = Conexao.getInstance();
        List<Pessoa> listaDePessoas = new ArrayList<>();

        try {
            PreparedStatement statement = conexao.prepareStatement(BUSCAR_QUERY);
            rs = statement.executeQuery();

            while(rs.next()){
                Pessoa p = new Pessoa();
                p.setNome(rs.getString("nome"));
                p.setId(rs.getInt("id"));
                p.setCpf(rs.getString("cpf"));
                p.setRg(rs.getString("rg"));

                listaDePessoas.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDePessoas;
    }


}

