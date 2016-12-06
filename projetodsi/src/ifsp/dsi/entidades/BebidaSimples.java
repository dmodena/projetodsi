/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Doug Modena
 */
public class BebidaSimples implements Item, Opcao {
    //private int quantidade;
    private String descricao;
    private double valorUnitario;
    private double lucro;
    
    public BebidaSimples() { }

    public BebidaSimples(String descricao, double valorUnitario, double lucro) 
    {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.lucro = lucro;
    }

    
    
    /*@Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }*/

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

    @Override
    public double getValorCusto() {
        return getValorUnitario();
    }

    @Override
    public double getLucro() {
        return lucro;
    }

    @Override
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    @Override
    public double getValorVenda() {
        return getValorUnitario() + (getValorUnitario() * lucro);
    }

    @Override
    public Map<Item, Integer> getIngredientes() {
        Map<Item, Integer> retorno = new HashMap<>();
        retorno.put(this, 1);
        
        return retorno;
    }
}
