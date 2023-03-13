package br.edu.fescfafic.biblioteca.Model;

public class Impressos {

  //  - Livros, revistas e periódicos(edição, genero, código identificador, autor, ano, disponivel#oolean?, quantidade de paginas)

    public String edicao;

    public String genero;

    public String nomeDaObra;

    public String codigoIdentificador;

    public String nomeDoAutor;

    public String ano;

    public boolean disponivel;
    
    public String quantidadeDePaginas;
    
    public Impressos(String edicao, String genero, String nomeDaObra, String codigoIdentificador, String nomeDoAutor, String ano, boolean disponivel, String quantidadeDePaginas){
        this.edicao = edicao;
        this.genero = genero;
        this.nomeDaObra = nomeDaObra;
        this.codigoIdentificador = codigoIdentificador;
        this.nomeDoAutor = nomeDoAutor;
        this.ano = ano;
        this.disponivel = disponivel;
        this.quantidadeDePaginas = quantidadeDePaginas;
    }
}

