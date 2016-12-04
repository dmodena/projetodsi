/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.testes;

import ifsp.dsi.entidades.Atendente;
import ifsp.dsi.entidades.BebidaComposta;
import ifsp.dsi.entidades.BebidaSimples;
import ifsp.dsi.entidades.Comanda;
import ifsp.dsi.entidades.Estoque;
import ifsp.dsi.entidades.Gerente;
import ifsp.dsi.entidades.ItemBebida;
import ifsp.dsi.entidades.ItemPrato;
import ifsp.dsi.entidades.Mesa;
import ifsp.dsi.entidades.Prato;
import ifsp.dsi.entidades.Vinho;
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
        
        BebidaSimples b1 = new BebidaSimples("Coca-Cola 250 ml", 3.0, 0.5);
        Vinho v1 = new Vinho("Miolo", 50.0, 0.25, 1989, "Roxa");
                
        Estoque estoque = Estoque.getInstance();
        estoque.adicionarItem(ip1, 5);
        estoque.adicionarItem(ip2, 10);
        estoque.adicionarItem(ib1, 6);
        estoque.adicionarItem(ib2, 6);
        estoque.adicionarItem(b1, 10);
        estoque.adicionarItem(v1, 6);
        
        Prato prato1 = new Prato(0.25);
        prato1.setIngrediente(ip1, 1);
        prato1.setIngrediente(ip2, 2);
        
        BebidaComposta bebida1 = new BebidaComposta(1.0);
        bebida1.setIngrediente(ib1, 3);
        bebida1.setIngrediente(ib2, 2);
        
        Comanda comanda = new Comanda(a1, m1, d, 3, 3.5);
        comanda.realizaPedido(prato1, 5);
        comanda.realizaPedido(bebida1, 2);
        comanda.realizaPedido(b1, 1);
        comanda.realizaPedido(v1, 1);
        
        System.out.println("Valor total: " + comanda.getValorTotal());
    }
    
}
