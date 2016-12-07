/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.exportacao;

import ifsp.dsi.relatorios.RelatorioJasperReports;
import ifsp.dsi.utils.Folders;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Doug Modena
 */
public class ExportarPdf {
    private final String caminhoRelatorios = "/ifsp/dsi/relatorios/";
    private String nomeRelatorio;
    private String arquivo;
    
    public ExportarPdf(String nomeRelatorio, String arquivo) {
        this.nomeRelatorio = nomeRelatorio;
        this.arquivo = arquivo;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void run() {
        RelatorioJasperReports rel = new RelatorioJasperReports(
                caminhoRelatorios + nomeRelatorio,
                Folders.getFolderPdf() + arquivo
        );
        
        try {
            rel.gerarRelatorio();
        }
        catch(SQLException | JRException ex) {            
            System.out.println("Erro ao gerar relatório pdf!");            
        }  
    }
}
