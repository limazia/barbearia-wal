/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Cliente extends Pessoa {
    private String cep;
    private String endereco;

    public Cliente(String cep, String endereco, int id, String nome, String telefone, String email, String rg, char sexo, String dataNascimento) {
        super(id, nome, telefone, email, rg, sexo, dataNascimento);
        this.cep = cep;
        this.endereco = endereco;
    }

    public Cliente(int id, String nome, String cep, String endereco) {
        super(id, nome);
        this.cep = cep;
        this.endereco = endereco;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}