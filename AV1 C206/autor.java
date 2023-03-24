public class Autor {

    String nome;
    String profissao;
    int anoNascimento;

    public Autor(String nome, String profissao, int anoNascimento) {
        this.nome = nome;
        this.profissao = profissao;
        this.anoNascimento = anoNascimento;
    }

    public void mostraInfo() {
        System.out.println("------Informações do Autor do Livro------")
        System.out.println("Nome do autor: "+ this.nome);
        System.out.println("Profissão: "+ this.profissao);
        System.out.println("Ano de Nascimento do autor: "+ this.anoNascimento);
    }
}