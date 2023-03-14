package br.edu.fescfafic.biblioteca.Model;

public class ObrasVisuais {

    public String tipo;
    public String codigoID;
    public String nomeAutor;
    public String ano;
    public boolean disponivel;
    public boolean exposto;


    public ObrasVisuais(String tipo, String codigo, String autor, String ano, boolean disponivel, boolean exposto){

        this.tipo = tipo;
        this.codigoID = codigo;
        this.nomeAutor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
        this.exposto = exposto;

    }

    public void setDisponivel(boolean status){
        this.disponivel = status;
    }
    
    public void setExposto(boolean status){
        this.exposto = status;
    }
    
}
