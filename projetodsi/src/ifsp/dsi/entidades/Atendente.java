/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IFSP-CTI-04
 */
@XmlRootElement(name = "atendente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Atendente 
{
    private int codigo;
    private String nome;
    @XmlElement(name = "gerente")
    private Gerente gerente;
    
    public Atendente() { }
    
    public Atendente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Atendente(int codigo, String nome, Gerente gerente)
    {
        this(codigo, nome);
        this.gerente = gerente;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public Gerente getGerente() 
    {
        return gerente;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setGerente(Gerente gerente) 
    {
        this.gerente = gerente;
    }    
}
