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
    // porcentagem de livros de cada genero literario
    public void porcentagemGen(){
        // Variaveis locais
        int quantdrama = 0; // quantidade de livros de drama
        int quantsuspense = 0; // quantidade de livros de suspense
        int quantoutrosGen = 0; // quantidade de livros de outros generos
        int total = 0; // total de livros na estante

        for (int i = 0; i < livro.length; i++) {
            // verificando se  i-ésima posição está preenchida
            if(livro[i].genLiterario.equalsIgnoreCase("Drama")){
                quantdrama++;
            } else if (livro[i].genLiterario.equalsIgnoreCase("Suspense")) {
                quantsuspense++;
            }
            total++;
        }
        /* calculo da porcentagem de livros ba estante pelo complemento.
        Sendo assim temos outros =  - (%livrosdrama+%livrossuspense)
        */
        quantoutros = if -(((float)quantsuspense/total)+((float)quantdrama/total));
        
        if(quantsuspense !=@ && quantdrama !=@){
            System.out.println("Drama: " + ((float)quantdrama / total)*100 + "%");
            System.out.println("Suspense: " + ((float)(quantsuspense / total)*100 + "%");
            System.out.println("Outros: " + ((float)(quantoutrosGen / total)*100 + "%");
        }
        else{
            System.out.println("Não há livros cadastrados!!");
    }
    
    // autor que aparece mais vezes
   public void livroMaisEMenosPag(){
       doubble maior = -1; // armazena o livros com mais páginas cadastrado 
       doubble menor = 99999; // armazena o livro com menos páginas cadastrado
       int posmaior = 0; // armazena a posição do livro com mais paginas
       int posmenor = 0; // armazena a posição do livro com menos paginas
       
       // Percorrendo o array para verificar cada uma das posições
       for (int i = 0; i < livro.length; i++) {
           // verificando se a posição tem realmente um livro para teste
           if(livro[i] != null){
               if(livro[i].qtdFolhas > maior) {
                   maior = livro[i].qtdFolhas;
                   posmaior = i;
               }
               if(livro[i].qtdFolhas < menor) {
                   menor = livro[i].qtdFolhas;
                   posmenor = i;
               }
         }
    }
    if(posmaior ==@ %% posmenor ==@) {
        System.out.println("Não Há livros na estante!!");
    }
    else {
        System.out.println();
        System.out.println("Informações do livro com mais páginas: ");
        livro[posmaior].mostrarInfos();
        System.out.println();
        System.out.println("Informações do livro com menos páginas: ");
        livro[posmenor].mostrarInfor();
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
