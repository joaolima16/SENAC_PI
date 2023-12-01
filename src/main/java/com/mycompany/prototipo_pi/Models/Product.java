package com.mycompany.prototipo_pi.Models;
/**
 * 
 * @author Grupo - Loja de calçaods
 * Classe com os principais atributos dos produtos
 */
public class Product {

    private int id;
    private String nomeProduto;
    private double preco;
    private int tamanho;
    private int estoque;
    
    public Product(){
    
    
    }
    /**
     * Construtor responsável por atribuir os valores as variáveis 
     * @param nomeProduto
     * @param preco
     * @param tamanho
     * @param estoque 
     */
    public Product(String nomeProduto, double preco, int tamanho, int estoque) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.tamanho = tamanho;
        this.estoque = estoque;
    }
    public Product(int id, String nomeProduto, double preco, int tamanho, int estoque) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.tamanho = tamanho;
        this.estoque = estoque;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
