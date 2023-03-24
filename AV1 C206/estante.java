import java.util.Scanner;

public class Estante {
    int idEstante;
    char letra;

    Livro[] livros = new Livro[120];

    public Estante(String idEstante) {
        this.idEstante = idEstante;
        System.out.println("Estante " + this.idEstante + " criada.");
    }
    /*public void mostrainfo() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                livros[i].mostraInfo();
            }
        }
    }*/

    public void addLivros(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                System.out.println(livro.titulo + " adicionado!");
                break;
            }
        }
    }

    public void porcentagemGen(){
        int drama = 0;
        int suspense = 0;
        int outrosGen = 0;
        int all = 0;

        for (int i = 0; i < livro.length; i++) {
            if(livro[i].genLiterario.equalsIgnoreCase("Drama")){
                drama++;
            } else if (livro[i].genLiterario.equalsIgnoreCase("Suspense")) {
                suspense++;
            } else if (livro[i].genLiterario.equalsIgnoreCase("Outro")) {
                outrosGen++;
            }
            all += drama + suspense + outrosGen;
        }
        System.out.println("Drama: " + (drama / all)*100 + "%");
        System.out.println("Suspense: " + (suspense / all)*100 + "%");
        System.out.println("Outros: " + (outrosGen / all)*100 + "%");
    }

   public void livroMaisEMenosPag(){
       int maior = 0;
       int menor = 99999;
       for (int i = 0; i < livro.length; i++) {
           // Mais páginas
           if (livro[i].qtdFolhas > maior) {
               maior = livro[i].qtdFolhas;
           }
           // Menos páginas
           if (livro[i].qtdFolhas < menor){
               menor = livro[i].qtdFolhas;
           }
    }
        do {
            System.out.println("1 - Para adicionar um livro na estante");
            System.out.println("2 - Mostrar as informações dos livros que estão na estante");
            System.out.println("3 - para sair");

            int opcao = op.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Insira os dados do livro: (Titulo, Gênero literário, Quantidade de folhas e a Editora) ");
                    Scanner titulo = new Scanner(System.in);
                    Scanner genLiterario = new Scanner(System.in);
                    Scanner qtdFolhas = new Scanner(System.in);
                    Scanner editora = new Scanner(System.in);

                    Livro l1 = new Livro(titulo.nextLine(), genLiterario.nextLine(), qtdFolhas.nextInt(), editora.nextLine());
                    this.addLivro(l1);

                    break;

                case 2:
                    this.mostrainfo();
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    System.out.println("Essa não é uma opção.");
                    break;
            }
            op.nextLine();
        } while (flag);
        op.close();
    }
}