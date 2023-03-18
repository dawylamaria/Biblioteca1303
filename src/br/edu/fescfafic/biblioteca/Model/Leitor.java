package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;

public class Leitor extends Pessoa {
    public int idade;
    public double debito;
    public boolean cadastroLiberado;

    public ArrayList<Leitor> listaDeLeitores = new ArrayList<>();

    public Leitor(String nome, int idade, String _cpf, String _rg, boolean cadastroLiberado, double debito){
        super(nome, _cpf, _rg);
        this.idade = idade;
        this.cadastroLiberado = cadastroLiberado;
        this.debito = debito;

    }

    public void cadastrarLeitores(Leitor leitores){
        this.listaDeLeitores.add(leitores);
    }

    public void setCadastroLiberado(boolean status) {
        this.cadastroLiberado = status;
    }

    public void getCadastroLiberado(){
        System.out.println(this.cadastroLiberado);
    }

}
