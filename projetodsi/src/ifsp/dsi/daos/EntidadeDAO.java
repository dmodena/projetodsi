/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Doug Modena
 */
public abstract class EntidadeDAO {
    public void fecharRecursos(Connection con, PreparedStatement pStat) throws SQLException {
        if (con != null) con.close();
        if (pStat != null) pStat.close();
    }
    
    public void fecharRecursos(Connection con, List<PreparedStatement> pStats) throws SQLException {
        if (con != null) con.close();
        
        for(PreparedStatement pStat : pStats) {
            if (pStat != null) pStat.close();
        }
    }
    
    public void fecharRecursos(Connection con, PreparedStatement pStat, ResultSet rs) throws SQLException {
        fecharRecursos(con, pStat);
        if(rs != null) rs.close();
    }
    
    public void fecharRecursos(Connection con, List<PreparedStatement> pStats, List<ResultSet> rsi) throws SQLException {
        if (con != null) con.close();
        
        for(PreparedStatement pStat : pStats) {
            if (pStat != null) pStat.close();
        }
        
        for(ResultSet rs : rsi) {
            if (rs != null) rs.close();
        }
    }
}
