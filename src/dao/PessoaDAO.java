package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import model.Pessoa;
public class PessoaDAO {
    public void cadastrarPessoa(Pessoa pVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "Insert into pessoa values" + "null, ?, ?, ?, ?, ?, null, null, ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getOlho());
            pst.setString(3, pVO.getCabelo());
            pst.setString(4, pVO.getPele());
            pst.setBoolean(5, pVO.isSexo());
            pst.setString(6, pVO.getNome());
            pst.setString(7, pVO.getNome());
            pst.setInt(8, pVO.getPontosDeVida());
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pessoa" + e.getMessage());
        }
    }
}
