/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Doug Modena
 */
public class BebidaComposta implements Opcao 
{
    private double lucro;
    private Map<ItemBebida, Integer> ingredientes;

    public BebidaComposta(double lucro)
    {
        this.lucro = lucro;
        ingredientes = new HashMap<>();
    }
    
    public void setIngrediente(ItemBebida item, Integer quantidade)
    {
        ingredientes.put(item, quantidade);
    }
    
    @Override
    public double getValorCusto() 
    {
        double valorCusto = 0d;
        
        Set<Map.Entry<ItemBebida, Integer>> set = ingredientes.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            Map.Entry<ItemBebida, Integer> entry = (Map.Entry)it.next();
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
        
        for (Map.Entry<ItemBebida, Integer> entry : ingredientes.entrySet()) 
        {
            if(entry.getKey() instanceof Item)
            {
                retorno.put(entry.getKey(), entry.getValue());
            }
        }
        
        return retorno;
    }
}
