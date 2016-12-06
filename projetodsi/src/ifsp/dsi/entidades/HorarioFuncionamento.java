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
public class HorarioFuncionamento {
    private int diaSemana;
    private boolean emFuncionamento;
    private String horaAbertura;
    private String horaFechamento;
    private String aberturaFeriado;
    private String fechamentoFeriado;
    
    public HorarioFuncionamento() { }

    public HorarioFuncionamento(int diaSemana, boolean emFuncionamento, String horaAbertura, String horaFechamento, String aberturaFeriado, String fechamentoFeriado) {
        this.diaSemana = diaSemana;
        this.emFuncionamento = emFuncionamento;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.aberturaFeriado = aberturaFeriado;
        this.fechamentoFeriado = fechamentoFeriado;                
    }
    
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public boolean isEmFuncionamento() {
        return emFuncionamento;
    }

    public void setEmFuncionamento(boolean emFuncionamento) {
        this.emFuncionamento = emFuncionamento;
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getAberturaFeriado() {
        return aberturaFeriado;
    }

    public void setAberturaFeriado(String aberturaFeriado) {
        this.aberturaFeriado = aberturaFeriado;
    }

    public String getFechamentoFeriado() {
        return fechamentoFeriado;
    }

    public void setFechamentoFeriado(String fechamentoFeriado) {
        this.fechamentoFeriado = fechamentoFeriado;
    }
}
