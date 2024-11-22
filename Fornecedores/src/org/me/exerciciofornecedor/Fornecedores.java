/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.exerciciofornecedor;

/**
 *
 * @author Fatec
 */
public class Fornecedores {
        private int ID;
        private String nome;
        private String CNPJ;
        private String email;
        private String endereco;
        private String cidade;
        private String estado;
        private String Telefone;
        
        public Fornecedores (){
         }
        public Fornecedores (int cod, String n, String c, String e, String end, String cd, String es, String f){
         setID(cod);
         setNome(n);
         setCNPJ(c);
         setEmail(e);
         setEndereco(end);
         setCidade(cd);
         setEstado(es);
         setTelefone(f);
        }
         public int getID() {
         return ID;
         }
         public void setID(int ID) {
         this.ID = ID;
         }
         public String getNome() {
         return nome;
         }
         public void setNome(String nome) {
         this.nome = nome;
         }
         public String getCNPJ() {
         return CNPJ;
         }
         public void setCNPJ(String CNPJ) {
         this.CNPJ = CNPJ;
         }
         public String getEmail() {
         return email;
         }
         public void setEmail(String email) {
         this.email = email;
         }
         
         public String getEndereco() {
         return endereco;
         }
         public void setEndereco(String endereco) {
         this.endereco = endereco;
         }
         
         public String getCidade () {
         return cidade;
         }
         public void setCidade (String cidade) {
         this.cidade = cidade;
         }
         
         public String getEstado () {
         return estado;
         }
         public void setEstado (String estado) {
         this.estado = estado;
         }
         
         public String getTelefone() {
         return Telefone;
         }
         public void setTelefone(String Telefone) {
         this.Telefone = Telefone;
         }
}
