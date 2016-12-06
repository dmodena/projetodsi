/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Doug Modena
 */
public class ProcessadorGson {
    private String arquivo;
    
    public ProcessadorGson(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void gravar(Object obj) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        
        String json = gson.toJson(obj);
        
        File file = new File(arquivo);
        Writer fileWriter = null;
        Writer bufferWriter = null;
        
        try {
            fileWriter = new FileWriter(file);
            bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(json);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        finally {
            fecharRecursos(bufferWriter);
        }
    }
    
    public Object ler() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        
        File file = new File(arquivo);
        Reader fileReader = null;
        Reader bufferReader = null;
        Object obj = null;
        
        try {
            fileReader = new FileReader(file);
            bufferReader = new BufferedReader(fileReader);
            obj = gson.fromJson(bufferReader, Object.class);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        finally {
            fecharRecursos(bufferReader);
        }
        
        return obj;
    }
    
    private void fecharRecursos(Closeable recurso) {
        if (recurso != null) {
            try {
                recurso.close();
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
