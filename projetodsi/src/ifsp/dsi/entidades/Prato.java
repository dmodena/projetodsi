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
public class Prato implements Opcao {
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
    public double getValorCusto() {
        double valorCusto = 0d;
        
        // todo Iterar Map e retornar total.
        
        /* return ingredientes
                .stream()
                .map((i) -> i.getValor())
                .reduce(0d, (sum, item) -> sum + item); */
        
        return valorCusto;
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
        return getValorCusto() + (getValorCusto() * lucro);
    }
}
