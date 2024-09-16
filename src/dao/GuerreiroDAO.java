package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Guerreiro;

public class GuerreiroDAO {
    public void cadastrarGuerreiro(Guerreiro gVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "Insert into pessoa values ( null, ?, ?, ?, ?, ?, ?, null, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getNome());
            pst.setString(2, gVO.getOlho());
            pst.setString(3, gVO.getCabelo());
            pst.setString(4, gVO.getPele());
            pst.setBoolean(5, gVO.isSexo());
            pst.setString(6, gVO.getArmamento());
            pst.setInt(7, gVO.getPontosDeVida());
            pst.execute();
            System.out.println("Guerreiro cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar guerreiro" + e.getMessage());
        }
    }

    public ArrayList<Guerreiro> getGuerreiros() {
        ArrayList<Guerreiro> guerreiros = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa " + "where planoDeFuga is null ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Guerreiro guerreiro = new Guerreiro();
                guerreiro.setNome(rs.getString("nome"));
                guerreiro.setCabelo(rs.getString("cabelo"));
                guerreiro.setOlho(rs.getString("olho"));
                guerreiro.setPele(rs.getNString("pele"));
                guerreiro.setSexo(rs.getBoolean("sexo"));
                guerreiro.setPontosDeVida(rs.getInt("pontosDeVida"));
                guerreiros.add(guerreiro);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar guerreiro. \n" + e.getMessage());
        }
        return guerreiros;
    }

    public Guerreiro getGuerreirosByNome(String nome) {
        Guerreiro g = new Guerreiro();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa where nome like?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rS = pst.executeQuery();
            while (rS.next()) {

                g.setId(rS.getInt("id"));
                g.setNome(rS.getString("nome"));
                g.setCabelo(rS.getString("cabelo"));
                g.setOlho(rS.getString("olho"));
                g.setPele(rS.getNString("pele"));
                g.setSexo(rS.getBoolean("sexo"));
                g.setArmamento(rS.getString("Armamento"));
                g.setPontosDeVida(rS.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar guerreiro \n" + e.getMessage());
        }
        return g;
    }

    public void atualizarGuerreiros(Guerreiro gVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update pessoa set cabelo = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, gVO.getCabelo());
            pst.setInt(2, gVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar guerreiro \n" + e.getMessage());
        }
    }

    public boolean deletarGuerreiros(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar guerreiro \n" + e.getMessage());
        }
        return true;
    }
}
