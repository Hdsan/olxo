/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebApplication.web;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author aluno
 */
public class UsuarioBean {
    private String nome;
    private String email;
    private String senha;
    private String confirmaSenha;
    private String telefone;
    private String endereço;
    
    public UsuarioBean(String nome, String email, String senha, String confirmaSenha, String telefone, String endereço) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
        this.telefone = telefone;
        this.endereço = endereço;
    }
    
    public UsuarioBean(){
        
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public String novo(){
        return "usuario";
    }
    
    public String salvar(){

        FacesContext context = FacesContext.getCurrentInstance();
        if(!this.senha.equalsIgnoreCase(this.confirmaSenha))
        {

            context.addMessage(null,
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha confirmada incorretamente.",""));
            return "usuario";
        }
        
         return "sucesso";
    }

}
