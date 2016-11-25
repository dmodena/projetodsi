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
public class BebidaSimples implements Item, Opcao {
    private int quantidade;
    private String descricao;
    private double valor;
    private double lucro;

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
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorCusto() {
        return getValor();
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
        return getValor() + (getValor() * lucro);
    }
}
