package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Pessoa;

public class VitimaDAO {
    public void cadastrarVitima(Pessoa vVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "Insert into pessoa values ( null, ?, ?, ?, ?, ?, null, null, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, vVO.getNome());
            pst.setString(2, vVO.getOlho());
            pst.setString(3, vVO.getCabelo());
            pst.setString(4, vVO.getPele());
            pst.setBoolean(5, vVO.isSexo());
            pst.setInt(6, vVO.getPontosDeVida());
            pst.execute();
            System.out.println("Vitima cadastrada com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pessoa" + e.getMessage());
        }
    }

    public ArrayList<Pessoa> getVitmas() {
        ArrayList<Pessoa> vitimas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa " + "where armamento is null and planoDeFuga is null ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Pessoa vitima = new Pessoa();
                vitima.setId(rs.getInt("id"));
                vitima.setNome(rs.getString("nome"));
                vitima.setCabelo(rs.getString("cabelo"));
                vitima.setOlho(rs.getString("olho"));
                vitima.setPele(rs.getNString("pele"));
                vitima.setSexo(rs.getBoolean("sexo"));
                vitima.setPontosDeVida(rs.getInt("pontosDeVida"));
                vitimas.add(vitima);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar vitima. \n" + e.getMessage());
        }
        return vitimas;
    }

    public Pessoa getVitimasByNome(String nome) {
        Pessoa v = new Pessoa();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa where nome like?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setCabelo(rs.getString("cabelo"));
                v.setOlho(rs.getString("olho"));
                v.setPele(rs.getNString("pele"));
                v.setSexo(rs.getBoolean("sexo"));
                v.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar vítima \n" + e.getMessage());
        }
        return v;
    }

    public void atualizarVitima(Pessoa vVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update pessoa set cabelo = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, vVO.getCabelo());
            pst.setInt(2, vVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar a vítima \n" + e.getMessage());
        }
    }

    public boolean deletarVitimas(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() !=0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar vítima \n" + e.getMessage());
        }
        return true;
    }
    
}
