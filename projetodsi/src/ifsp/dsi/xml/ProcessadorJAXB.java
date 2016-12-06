/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Doug Modena
 */
public class ProcessadorJAXB {
    private String arquivo;
    
    public ProcessadorJAXB(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void gravar(Object o) {
        File file = new File(arquivo);
        JAXBContext context = null;
        Marshaller marshaller = null;
        
        try {
            context = JAXBContext.newInstance(o.getClass());
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(o, file);
        }
        catch(JAXBException ex) {
            System.out.println(ex);
        }
    }
    
    public Object ler(Class c) {
        File file = new File(arquivo);
        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Object o = null;
        
        try {
            context = JAXBContext.newInstance(c);
            unmarshaller = context.createUnmarshaller();
            o = unmarshaller.unmarshal(file);
        }
        catch(JAXBException ex) {
            System.out.println(ex);
        }
        
        return o;
    }
}
