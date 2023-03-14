package br.edu.fescfafic.biblioteca.Model;

abstract class Acervo {
/* Acervo(tipo, código identificador, autor, ano, disponivel#boolean?)
Listas
- Digital (livros, revistas)
- Permanente( #indisponíveis para saída da biblioteca, quadros, esculturas, livros raros)
- Fisico(livros, revistas)
*/
    public String genero;
    public String codigoID;
    public String nomeAutor;
    public String ano;
    public boolean disponivel;

    public ArrayList<String> listaAcervoDigital = new ArrayList<>();
    public ArrayList<String> listaAcervoFisico = new ArrayList<>();
    public ArrayList<String> listaAcervoPermanente = new ArrayList<>();
    
}
