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
public class Vinho extends BebidaSimples 
{
    private int safra;
    private String tipoUva;
    
    public Vinho(String descricao, double valorUnitario, double lucro, int safra, String tipouva)
    {
        super(descricao, valorUnitario, lucro);
        this.safra = safra;
        this.tipoUva = tipoUva;
    }
}
