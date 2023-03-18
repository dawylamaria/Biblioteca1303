package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    public LocalDate dataSaida;
    public LocalDate dataEntrada;
    final double VALOR_MULTA = 0.50;
    public Leitor nomeDoLeitor;
    public ArrayList<Impressos> historicoDeEmprestimos = new ArrayList<>();
    public ArrayList<Impressos> obrasEmPosse = new ArrayList<>();

    public Emprestimo(LocalDate dataSaida, LocalDate dataEntrada, Leitor nome) {
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nomeDoLeitor = nome;
    }

    public void adicionarEmprestimo(Impressos impressos) {
        this.historicoDeEmprestimos.add(impressos);
        this.obrasEmPosse.add(impressos);
    }

    public void adicionarObra(Impressos impressos) {
        this.obrasEmPosse.add(impressos);
    }


    public double devolucao(LocalDate dataEntrada, LocalDate dataSaida) {
        double multa;
        long diasEmprestados = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        if (diasEmprestados > 7) {
            int diasExcedidos = (int) (diasEmprestados - 7);
            multa = diasExcedidos * VALOR_MULTA;
        } else {
            multa = 0;
        }
        return multa;
    }

}
