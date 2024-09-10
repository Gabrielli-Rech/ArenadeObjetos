package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import model.Pessoa;
public class VitimaDAO {
    public void cadastrarVitima(Pessoa vVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "Insert into pessoa values" + "null, ?, ?, ?, ?, ?, null, null, ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, vVO.getNome());
            pst.setString(2, vVO.getOlho());
            pst.setString(3, vVO.getCabelo());
            pst.setString(4, vVO.getPele());
            pst.setBoolean(5, vVO.isSexo());
            pst.setInt(6, vVO.getPontosDeVida());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pessoa" + e.getMessage());
        }
    }
}
