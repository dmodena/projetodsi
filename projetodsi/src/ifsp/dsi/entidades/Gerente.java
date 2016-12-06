/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IFSP-CTI-04
 */
@XmlRootElement(name = "gerente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gerente 
{
    private int codigo;
    private String nome;
    
    public Gerente() { }

    public Gerente(int codigo, String nome) 
    {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
