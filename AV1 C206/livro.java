public class Livro {

    String titulo;
    String genliterario;
    int qtdFolhas;
    String editora;

    public Livro(String titulo, String genliterario, int qtdFolhas, String editora) {
        this.titulo = titulo;
        this.genliterario = genliterario;
        this.qtdFolhas = qtdFolhas;
        this.editora = editora;
    }

    public void mostraInfo() {
        System.out.println("Nome do livro: "+ this.titulo);
        System.out.println("Gênero literário: "+ this.genliterario);
        System.out.println("Numero de paginas: "+ this.qtdFolhas);
        System.out.println("Editora: "+ this.editora);
    }
}