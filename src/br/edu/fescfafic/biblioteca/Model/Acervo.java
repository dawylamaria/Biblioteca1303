package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;

abstract class Acervo {

    public String tipo;
    public String codigoIdentificador;
    public String autor;
    public String ano;
    public boolean disponivel;
    
    public ArrayList<String> listaAcervoDigital = new ArrayList<>();
    public ArrayList<String> listaAcervoFisico = new ArrayList<>();
    public ArrayList<String> listaAcervoPermanente = new ArrayList<>();

    Acervo(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel){
        this.tipo = tipo;
        this.codigoIdentificador = codigoIdentificador;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

}
