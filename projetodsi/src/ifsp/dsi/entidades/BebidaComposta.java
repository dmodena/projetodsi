/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.List;

/**
 *
 * @author Doug Modena
 */
public class BebidaComposta implements Opcao {
    private double lucro;
    private List<ItemBebida> ingredientes;

    @Override
    public double getValorCusto() {
        return ingredientes
                .stream()
                .map((i) -> i.getValorUnitario())
                .reduce(0d, (sum, item) -> sum + item);
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
