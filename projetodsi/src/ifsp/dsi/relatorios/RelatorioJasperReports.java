/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.relatorios;

import ifsp.dsi.bd.ConexaoBD;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

/**
 *
 * @author Doug Modena
 */
public class RelatorioJasperReports {
    private String input;
    private String output;
    
    public RelatorioJasperReports(String input) {
        this.input = input;
    }
    
    public RelatorioJasperReports(String input, String output) {
        this(input);
        this.output = output;
    }
    
    public void gerarRelatorio() throws SQLException, JRException {
        ConexaoBD conexaoBd = ConexaoBD.getInstance();
        InputStream inputStream = getClass().getResourceAsStream(input);
        
        try {
            Connection con = conexaoBd.getConnection();
            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, null, con);
            
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(output));
            exporter.exportReport();
        }
        catch(SQLException | JRException ex) {
            throw ex;
        }         
    }
}
