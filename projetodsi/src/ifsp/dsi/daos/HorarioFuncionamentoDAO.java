/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.daos;

import ifsp.dsi.bd.ConexaoBD;
import ifsp.dsi.entidades.HorarioFuncionamento;
import ifsp.dsi.utils.DataParser;
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
public class HorarioFuncionamentoDAO extends EntidadeDAO implements IEntidadeDAO<HorarioFuncionamento> {

    @Override
    public void salvar(HorarioFuncionamento hf) throws SQLException {
        Connection con = null;
        PreparedStatement pStat = null;
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        String sql = "INSERT INTO HORARIO_FUNCIONAMENTO"
                + " (DIA_SEMANA, EM_FUNCIONAMENTO, HORA_ABERTURA, HORA_FECHAMENTO, ABERTURA_FERIADO, FECHAMENTO_FERIADO)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            con = conexaoBd.getConnection();
            
            pStat = con.prepareStatement(sql);
            pStat.setInt(1, hf.getDiaSemana());
            pStat.setInt(2, DataParser.boolToInt(hf.isEmFuncionamento()));
            pStat.setString(3, hf.getHoraAbertura());
            pStat.setString(4, hf.getHoraFechamento());
            pStat.setString(5, hf.getAberturaFeriado());
            pStat.setString(6, hf.getFechamentoFeriado());
            
            pStat.executeUpdate();
        }
        finally {
            fecharRecursos(con, pStat);
        }
    }

    @Override
    public List<HorarioFuncionamento> listar() throws SQLException {
        Connection con = null;
        PreparedStatement pStat = null;
        ResultSet rs = null;
        String sql = "SELECT DIA_SEMANA, EM_FUNCIONAMENTO, HORA_ABERTURA, HORA_FECHAMENTO, ABERTURA_FERIADO, FECHAMENTO_FERIADO"
                + " FROM HORARIO_FUNCIONAMENTO";
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        List<HorarioFuncionamento> horariosFuncionamento = new ArrayList<>();
        
        try {
            con = conexaoBd.getConnection();
            pStat = con.prepareStatement(sql);
            rs = pStat.executeQuery();
            
            while(rs.next()) {
                int arg1 = rs.getInt(1);
                boolean arg2 = DataParser.intToBool(rs.getInt(2));
                String arg3 = rs.getString(3);
                String arg4 = rs.getString(4);
                String arg5 = rs.getString(5);
                String arg6 = rs.getString(6);
                horariosFuncionamento.add(new HorarioFuncionamento(arg1, arg2, arg3, arg4, arg5, arg6));
            }
        }
        finally {
            fecharRecursos(con, pStat, rs);
        }
        
        return horariosFuncionamento;
    }    
}
