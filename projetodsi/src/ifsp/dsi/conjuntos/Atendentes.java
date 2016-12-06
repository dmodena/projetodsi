/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.conjuntos;

import ifsp.dsi.entidades.Atendente;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Doug Modena
 */
@XmlRootElement(name = "atendentes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Atendentes {
    @XmlElement(name = "atendente")
    private List<Atendente> atendentes;
    
    public Atendentes() { 
        atendentes = new ArrayList<>();
    }
    
    public Atendentes(List<Atendente> atendentes) {
        this.atendentes = atendentes;
    }

    public List<Atendente> getAtendentes() {
        return atendentes;
    }

    public void setAtendentes(List<Atendente> atendentes) {
        this.atendentes = atendentes;
    }
}
