/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

/**
 *
 * @author IFSP-CTI-04
 */
public class Atendente 
{
    private int codigo;
    private String nome;
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
