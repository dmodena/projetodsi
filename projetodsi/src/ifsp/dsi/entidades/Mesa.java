/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

/**
 *
 * @author IFSP-CTI-04
 */
class Mesa 
{
    private int numero;
    
    public Mesa(int numero)
    {
        this.numero = numero;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}