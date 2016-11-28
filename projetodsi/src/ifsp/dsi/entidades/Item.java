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
    int getQtdeEstoque();
    void setQtdeEstoque(int qtdeEstoque);
    String getDescricao();
    void setDescricao(String descricao);
    double getValorUnitario();
    void setValorUnitario(double valorUnitario);
}
