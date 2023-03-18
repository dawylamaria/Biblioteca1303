package br.edu.fescfafic.biblioteca.Model;

public class Impressos extends Acervos {

    public String edicao;
    public String genero;
    public String nomeDaObra;
    public String nomeDoAutor;
    public String quantidadeDePaginas;


    Impressos(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, String edicao,
              String genero, String nomeDaObra, String nomeDoAutor, String quantidadeDePaginas) {
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.edicao = edicao;
        this.genero = genero;
        this.nomeDaObra = nomeDaObra;
        this.nomeDoAutor = nomeDoAutor;
        this.quantidadeDePaginas = quantidadeDePaginas;

    }

}

