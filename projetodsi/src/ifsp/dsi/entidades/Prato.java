/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Doug Modena
 */
public class Prato implements Opcao 
{
    private double lucro;
    private Map<ItemPrato, Integer> ingredientes;
    
    public Prato(double lucro)
    {
        this.lucro = lucro;
        ingredientes = new HashMap<>();
    }
    
    public void setIngrediente(ItemPrato item, Integer quantidade)
    {
        ingredientes.put(item, quantidade);
    }

    @Override
    public double getValorCusto() 
    {
        double valorCusto = 0d;
        
        Set<Entry<ItemPrato, Integer>> set = ingredientes.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            Entry<ItemPrato, Integer> entry = (Entry)it.next();
            valorCusto += entry.getKey().getValorUnitario() * entry.getValue();            
        }
        
        return valorCusto;
    }

    @Override
    public double getLucro() 
    {
        return lucro;
    }

    @Override
    public void setLucro(double lucro) 
    {
        this.lucro = lucro;
    }

    @Override
    public double getValorVenda() 
    {
        return getValorCusto() + (getValorCusto() * lucro);
    }

    @Override
    public Map<Item, Integer> getIngredientes() 
    {
        Map<Item, Integer> retorno = new HashMap<>();
        
        for (Map.Entry<ItemPrato, Integer> entry : ingredientes.entrySet()) 
        {
            if(entry.getKey() instanceof Item)
            {
                retorno.put(entry.getKey(), entry.getValue());
            }
        }
        
        return retorno;
    }
}
