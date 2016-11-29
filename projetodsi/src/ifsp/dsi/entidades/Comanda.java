/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author IFSP-CTI-04
 */
public class Comanda 
{
    private int codigo;
    private Atendente atendente;
    private Mesa mesa;
    private Map<Opcao, Integer> itens;
    private Date horaInicio;
    private Date horaFinal;
    private int qtdePessoas;
    private double valorCouvert;
    private double valorTotal;
    private int formaPagamento;
    private int operadoraCartao;
    private Estoque estoque;

    public Comanda(int codigo, Atendente atendente, Mesa mesa, Date horaInicio, int qtdePessoas, double valorCouvert) 
    {
        this.codigo = -1;
        this.atendente = atendente;
        this.mesa = mesa;
        this.horaInicio = horaInicio;
        this.qtdePessoas = qtdePessoas;
        this.valorCouvert = valorCouvert;
        estoque = Estoque.getInstance();
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public void setAtendente(Atendente atendente) 
    {
        this.atendente = atendente;
    }

    public void setMesa(Mesa mesa) 
    {
        this.mesa = mesa;
    }

    public void setHoraFinal(Date horaFinal) 
    {
        this.horaFinal = horaFinal;
    }

    public void setQtdePessoas(int qtdePessoas) 
    {
        this.qtdePessoas = qtdePessoas;
    }

    public void setValorCouvert(double valorCouvert) 
    {
        this.valorCouvert = valorCouvert;
    }

    public void setFormaPagamento(int formaPagamento) 
    {
        this.formaPagamento = formaPagamento;
    }

    public void setOperadoraCartao(int operadoraCartao) 
    {
        this.operadoraCartao = operadoraCartao;
    }
    
    public boolean realizaPedido(Opcao opcao, Integer quantidade)
    {
        Map<Item, Integer> ingredientes = opcao.getIngredientes();
        boolean efetuarPedido = false;
        
        Set<Map.Entry<Item, Integer>> set = ingredientes.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            Map.Entry<Item, Integer> entry = (Map.Entry)it.next();
            
            if (estoque.getQuantidadeItem(entry.getKey()) >= entry.getKey().getQuantidade())
            {
                efetuarPedido = true;
            }
            else
            {
                efetuarPedido = false;
                break;
            }
        }
        
        if (efetuarPedido)
        {
            itens.put(opcao, quantidade);
        }
        
        return efetuarPedido;
    }
}