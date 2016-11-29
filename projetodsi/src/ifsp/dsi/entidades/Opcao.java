/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.Map;

/**
 *
 * @author Doug Modena
 */
public interface Opcao 
{
    public double getValorCusto();
    public double getLucro();
    public void setLucro(double lucro);
    public double getValorVenda();
    public Map<Item, Integer> getIngredientes();
}
