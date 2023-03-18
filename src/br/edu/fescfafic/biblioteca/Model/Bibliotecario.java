package br.edu.fescfafic.biblioteca.Model;

public class Bibliotecario extends Pessoa {
    public String crb;

    public Bibliotecario(String nome, String _cpf, String _rg, String crb){
        super(nome, _cpf, _rg);
        this.crb = crb;
    }
    public void getCrb(){
        System.out.println(this.crb);
    }
    public void setCrb(String crb){
        this.crb = crb;
    }

    @Override
    public String toString(){
        return "Bibliotecarios{" +
                "nome='" + nome + '\'' +
                ",cpf='" + _cpf + '\'' +
                ",rg='" + _rg + '\'' +
                ",crb='" + crb + '\''+
                '}';
    }

}
