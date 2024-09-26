package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Ladrao;

public class LadraoDAO {
    public void cadastrarLadrao(Ladrao lVO) {
        try {
            Connection con = Conexao.getConexao();
            // id, nome, olho, cabelo, pele, sexo, armamento, planoDeFuga, pontosDeVida
            String sql = "Insert into pessoa values ( null, ?, ?, ?, ?, ?, null, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, lVO.getNome());
            pst.setString(2, lVO.getOlho());
            pst.setString(3, lVO.getCabelo());
            pst.setString(4, lVO.getPele());
            pst.setBoolean(5, lVO.isSexo());
            pst.setString(6, lVO.getPlanoDeFuga());
            pst.setInt(7, lVO.getPontosDeVida());
            pst.execute();
            System.out.println("Ladrão cadastrado com sucesso! ");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar ladrao" + e.getMessage());
        }
    }

    public ArrayList<Ladrao> geLadraos() {
        ArrayList<Ladrao> ladraos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa " + "where planoDeFuga is not null ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Ladrao ladrao = new Ladrao();
                ladrao.setNome(rs.getString("nome"));
                ladrao.setCabelo(rs.getString("cabelo"));
                ladrao.setOlho(rs.getString("olho"));
                ladrao.setPele(rs.getNString("pele"));
                ladrao.setSexo(rs.getBoolean("sexo"));
                ladrao.setPlanoDeFuga(rs.getString("planoDeFuga"));
                ladrao.setPontosDeVida(rs.getInt("pontosDeVida"));

            }
        } catch (Exception e) {
            System.out.println("Erro ao listar ladrao. \n" + e.getMessage());
        }
        return ladraos;
    }

    public Ladrao getladraoByNome(String nome) {
        Ladrao l = new Ladrao();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa where nome like?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                l.setId(rs.getInt("id"));
                l.setNome(rs.getString("nome"));
                l.setCabelo(rs.getString("cabelo"));
                l.setOlho(rs.getString("olho"));
                l.setPele(rs.getNString("pele"));
                l.setSexo(rs.getBoolean("sexo"));
                l.setPlanoDeFuga("planoDeFuga");
                l.setPontosDeVida(rs.getInt("pontosDeVida"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ladrao \n" + e.getMessage());
        }
        return l;
    }
    public Guerreiro getGuerreiroById(int id) {
        Guerreiro g = new Guerreiro();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                g.setId(rs.getInt("id"));
                g.setNome(rs.getString("nome"));
                g.setCabelo(rs.getString("cabelo"));
                g.setOlho(rs.getString("olho"));
                g.setPele(rs.getString("pele"));
                g.setSexo(rs.getBoolean("sexo"));
                g.setPontosDeVida(rs.getInt("pontosDeVida"));
                g.setArmamento(rs.getString("armamento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar guerreiro \n" + e.getMessage());
        }
        return g;
    }

    public void atualizarLadrao(Ladrao lVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update pessoa set cabelo = ? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, lVO.getCabelo());
            pst.setInt(2, lVO.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar ladrao \n" + e.getMessage());
        }
    }

    public boolean deletarLadrao(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from pessoa where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (Exception e) {
            System.out.println("Erro ao deletar ladrao \n" + e.getMessage());
        }
        return true;
    }
}
