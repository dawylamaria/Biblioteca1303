package br.edu.fescfafic.biblioteca.Main;
import br.edu.fescfafic.biblioteca.Model.*;

public class MainProjeto {

    public static void main(String[] args) {

        Impressos impresso1 = new Impressos(
                "Livro",
                "001",
                "Diego Gadelha",
                "2018",
               true,
               "3º",
                "Romance",
                "Aventuras de Diego",
                "357"
        );

        Impressos impresso2 = new Impressos(
                "Livro",
                "002",
                "Dawyla Maria",
                "2019",
                false,
                "1º",
                "Romance",
                "Aventuras de Dawyla",
                "360"
        );

        Impressos impresso3 = new Impressos(
                "Revista",
                "003",
                "Aryelle",
                "2022",
                true,
                "17º",
                "Moda",
                "Aryelle em Paris",
                "30"
        );

        Impressos impresso4 = new Impressos(
          "Livro",
          "004",
          "Luís",
          "2021",
          false,
          "7º",
          "Suspense",
          "Aventuras de Luís",
          "177"
        );

        ObrasVisuais quadroPintado = new ObrasVisuais(
                "Quadro",
                "005",
                "Aryelle",
                "2017",
                false,
                true
        );

        ObrasVisuais escultura = new ObrasVisuais(
                "Escultura",
                "006",
                "Diego Aleijadinho",
                "2019",
                false,
                true
        );
        
        Atendente atendente1 = new Atendente(
                "Aryelle",
                "098.678.543-84",
                "03.106.103-6"
        );
        
        Atendente atendente2 = new Atendente(
                "Luís",
                "252.890.432-78",
                "54.098.333.4"
        );
        
        Bibliotecario bibliotecario1 = new Bibliotecario(
                "Dawyla",
                "890.543.342-21",
                "56.098.543-5",
                "00020304"
        );

        Bibliotecario bibliotecario2 = new Bibliotecario(
                "Diego",
                "790.543.342-22",
                "90.098.543-6",
                "11030201"
        );
        
        Leitor leitor1 = new Leitor(
                "Diego",
                24,
                "790.543.342-21",
                "90.098.543-5",
                true,
                00.0
        );
        
        Leitor leitor2 = new Leitor(
                "Dawyla",
                18,
                "890.543.342-22",
                "56.098.543-6",
                true,
                00.0
        );

        Leitor leitor3 = new Leitor(
                "Aryelle",
                25,
                "098.678.543-85",
                "03.106.103-7",
                false,
                50.75
        );

        Leitor leitor4 = new Leitor(
                "Luís",
                19,
                "252.890.432-79",
                "54.098.333.5",
                true,
                00.0
        );

    }

}
