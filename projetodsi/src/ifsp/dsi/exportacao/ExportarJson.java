/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.exportacao;

import ifsp.dsi.json.ProcessadorGson;
import ifsp.dsi.utils.Folders;

/**
 *
 * @author Doug Modena
 * @param <T> Tipo da Classe
 */
public class ExportarJson<T> {
    private T obj;
    private String arquivo;
    
    public ExportarJson(T obj, String arquivo) {
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
        ProcessadorGson processadorJson = new ProcessadorGson(Folders.getFolderJson() + arquivo);
        processadorJson.gravar(obj);
    }
}
