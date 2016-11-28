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
public class ItemPrato implements Item {
    private int qtdeEstoque;
    private String descricao;
    private double valorUnitario;

    public ItemPrato(String descricao, int qtdeEstoque, double valorUnitario)
    {
        
    }
    
    @Override
    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    @Override
    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
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
