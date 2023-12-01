package com.mycompany.prototipo_pi.Models;

import java.util.Date;
/***
 * Classe com os principais atributos e campos de vendas do sistema
 * @author Grupo - Loja de calçados
 */
public class Sale {

    private int id_venda;
    private String cpf;
    private double valor_venda;
    private Date data_venda;
    private int id_cliente;

    public Sale(String cpf, double valor_venda, Date data_venda, int id_cliente) {
        this.cpf = cpf;
        this.valor_venda = valor_venda;
        this.data_venda = data_venda;
        this.id_cliente = id_cliente;
    }

    public Sale() {

    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
