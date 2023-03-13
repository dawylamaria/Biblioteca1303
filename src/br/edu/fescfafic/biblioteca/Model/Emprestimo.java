package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;

//Quando emprestar, acrescentar na lista historicoDeEmprestimo e obrasEmPosse
//Quando devolver, remover da lista obrasEmPosse
public class Emprestimo {

    public String dataSaida;
    public String dataEntrada;
    public Leitor nomeDoLeitor;
    public ArrayList<Impressos> historicoDeEmprestimos = new ArrayList<>();
    public ArrayList<Impressos> obrasEmPosse = new ArrayList<>();

    public Emprestimo(String dataSaida, String dataEntrada, Leitor nome) {
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nomeDoLeitor = nome;
    }

    public void adicionarEmprestimo(Impressos impressos) {
        this.historicoDeEmprestimos.add(impressos);
    }

    public void adicionarObra(Impressos impressos) {
        this.obrasEmPosse.add(impressos);
    }



//metodo de devolução
}
