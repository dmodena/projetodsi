/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import ifsp.dsi.bd.ConexaoBD;
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
public class GerenteDAO extends EntidadeDAO implements IEntidadeDAO<Gerente> {

    @Override
    public void salvar(Gerente g) throws SQLException {
        Connection con = null;
        PreparedStatement pStat = null;
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        String sql = "INSERT INTO GERENTES (CODIGO, NOME) VALUES (?, ?)";
        
        try {
            con = conexaoBd.getConnection();
            
            pStat = con.prepareStatement(sql);
            pStat.setInt(1, g.getCodigo());
            pStat.setString(2, g.getNome());
            
            pStat.executeUpdate();
        }
        finally {
            fecharRecursos(con, pStat);
        }
    }

    @Override
    public List<Gerente> listar() throws SQLException {
        Connection con = null;
        PreparedStatement pStat = null;
        ResultSet rs = null;
        String sql = "SELECT CODIGO, NOME FROM GERENTES";
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        List<Gerente> gerentes = new ArrayList<>();
        
        try {
            con = conexaoBd.getConnection();
            pStat = con.prepareStatement(sql);
            rs = pStat.executeQuery();
            
            while(rs.next()) {
                int arg1 = rs.getInt(1);
                String arg2 = rs.getString(2);
                gerentes.add(new Gerente(arg1, arg2));
            }
        }
        finally {
            fecharRecursos(con, pStat, rs);
        }
        
        return gerentes;
    }
    
}
