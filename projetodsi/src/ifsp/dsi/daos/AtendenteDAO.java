/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import ifsp.dsi.bd.ConexaoBD;
import ifsp.dsi.entidades.Atendente;
import ifsp.dsi.entidades.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doug Modena
 */
public class AtendenteDAO extends EntidadeDAO implements IEntidadeDAO<Atendente> {

    @Override
    public void salvar(Atendente a) throws SQLException {
        Connection con = null;
        PreparedStatement pStat = null;
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        String sql = "INSERT INTO ATENDENTES (CODIGO, NOME, COD_GERENTE) VALUES (?, ?, ?)";
        
        try {
            con = conexaoBd.getConnection();
            
            pStat = con.prepareStatement(sql);
            pStat.setInt(1, a.getCodigo());
            pStat.setString(2, a.getNome());
            pStat.setInt(3, a.getGerente().getCodigo());
            
            pStat.executeUpdate();
        }
        finally {
            fecharRecursos(con, pStat);
        }
    }

    @Override
    public List<Atendente> listar() throws SQLException {
        Connection con = null;
        PreparedStatement pStatAtd = null;
        PreparedStatement pStatGer = null;
        ResultSet rsAtd = null;
        ResultSet rsGer = null;                
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        String sqlAtd = "SELECT CODIGO, NOME, COD_GERENTE FROM ATENDENTES";
        String sqlGer = "SELECT CODIGO, NOME FROM GERENTES WHERE CODIGO = ?";
        List<Atendente> atendentes = new ArrayList<>();        
        
        try {
            con = conexaoBd.getConnection();
            pStatAtd = con.prepareStatement(sqlAtd);
            rsAtd = pStatAtd.executeQuery();
            
            while(rsAtd.next()) {
                int aarg1 = rsAtd.getInt(1);
                String aarg2 = rsAtd.getString(2);
                int codigoGerente = rsAtd.getInt(3);
                Atendente a = new Atendente(aarg1, aarg2);
                
                pStatGer = con.prepareStatement(sqlGer);
                pStatGer.setInt(1, codigoGerente);
                rsGer = pStatGer.executeQuery();
                
                if(rsGer.next()) {
                    int garg1 = rsGer.getInt(1);
                    String garg2 = rsGer.getString(2);
                    a.setGerente(new Gerente(garg1, garg2));
                }
                
                atendentes.add(a);
            }
        }
        finally {
            
        }
        
        return atendentes;
    }
    
}
