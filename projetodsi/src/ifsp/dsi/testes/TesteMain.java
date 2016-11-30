/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.testes;

import ifsp.dsi.entidades.Atendente;
import ifsp.dsi.entidades.BebidaComposta;
import ifsp.dsi.entidades.Comanda;
import ifsp.dsi.entidades.Estoque;
import ifsp.dsi.entidades.Gerente;
import ifsp.dsi.entidades.ItemBebida;
import ifsp.dsi.entidades.ItemPrato;
import ifsp.dsi.entidades.Mesa;
import ifsp.dsi.entidades.Prato;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class TesteMain 
{
    public static void main(String[] args) 
    {
        Gerente g1 = new Gerente(1, "Gerente 1");
        Atendente a1 = new Atendente(1, "Atendente 1", g1);
        Mesa m1 = new Mesa(1);
        Date d = new SimpleDateFormat("dd/MM/yyyy").getCalendar().getTime();
        
        ItemPrato ip1 = new ItemPrato("Gorgonzola", 9.0);
        ItemPrato ip2 = new ItemPrato("Macarrão", 3.5);
        
        ItemBebida ib1 = new ItemBebida("Laranja", 0.5);
        ItemBebida ib2 = new ItemBebida("Abacaxi", 5.0);
                
        Estoque estoque = Estoque.getInstance();
        estoque.adicionarItem(ip1, 5);
        estoque.adicionarItem(ip2, 10);
        estoque.adicionarItem(ib1, 3);
        estoque.adicionarItem(ib2, 3);
        
        Prato prato1 = new Prato(0.25);
        prato1.setIngrediente(ip1, 1);
        prato1.setIngrediente(ip2, 2);
        
        BebidaComposta bebida1 = new BebidaComposta(1.0);
        bebida1.setIngrediente(ib1, 3);
        bebida1.setIngrediente(ib2, 1);
        
        Comanda comanda = new Comanda(a1, m1, d, 3, 3.5);
        //comanda.realizaPedido(prato1, 5);
        comanda.realizaPedido(bebida1, 4);
        
        System.out.println("Valor total: " + comanda.getValorTotal());
    }
    
}
