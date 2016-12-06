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
 * @author IFSP-CTI-04
 */
public class Estoque 
{
    private static Estoque estoque;
    private Map<Item, Integer> itensEstoque;
    
    public Estoque()
    {
        itensEstoque = new HashMap<>();
    }
    
    public static Estoque getInstance()
    {
        if (estoque == null)
        {
            estoque = new Estoque();
        }
        
        return estoque;
    }
    
    public void adicionarItem(Item item, Integer quantidade)
    {
        itensEstoque.put(item, quantidade);
    }
    
    public Integer getQuantidadeItem(Item item)
    {
        return itensEstoque.get(item);
    }
    
    public void darBaixaQuantidade(Item item, Integer quantidade)
    {
        if (itensEstoque.containsKey(item))
        {
            //System.out.println("Item: " + item.getDescricao() + " Quantidade: " + (itensEstoque.get(item) - quantidade));
            if (itensEstoque.get(item) > 0)
            {
                itensEstoque.replace(item, itensEstoque.get(item) - quantidade);
            }
        }
    }
    
    public void alteraQuantidade(Item item, Integer quantidade)
    {
        if (itensEstoque.containsKey(item))
        {
            itensEstoque.replace(item, quantidade);
        }
    }
}
