/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebApplication.web;

/**
 *
 * @author aluno
 */
public class PessoaJuridica extends UsuarioBean{
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, String email, String senha, String confirmaSenha, String telefone, String endereço) {
        super(nome, email, senha, confirmaSenha, telefone, endereço);
        this.cnpj = cnpj;
    }

}
