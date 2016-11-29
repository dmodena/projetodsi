/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

/**
 *
 * @author Doug Modena
 */
public class ItemPrato implements Item 
{
    private int quantidade;
    private String descricao;
    private double valorUnitario;

    public ItemPrato(String descricao, int quantidade, double valorUnitario)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
