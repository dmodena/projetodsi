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
public interface Item {
    int getQuantidade();
    void setQuantidade(int quantidade);
    String getDescricao();
    void setDescricao(String descricao);
    double getValor();
    void setValor(double valor);
}
