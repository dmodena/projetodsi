/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.exportacao;

import ifsp.dsi.utils.Folders;
import ifsp.dsi.xml.ProcessadorJAXB;

/**
 *
 * @author Doug Modena
 * @param <T> Tipo da Classe
 */
public class ExportarXml<T> {
    private T obj;
    private String arquivo;
    
    public ExportarXml(T obj, String arquivo) {
        this.obj = obj;
        this.arquivo = arquivo;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void run() {
        ProcessadorJAXB processadorXml = new ProcessadorJAXB(Folders.getFolderXml()+ arquivo);
        processadorXml.gravar(obj);
    }
}
