import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(arrayint[2]);

        Livro[] livros = new Livro[120];
        Livro l1 = new Livro("Harry Potter e a Pedra Filosofal", "Fantasia", 400, "Livros de J. K. Rowling");
        livros[0] = l1;
        livros[1] = new Livro("Caça as bruxas", "Fantasia", 300, "Jorge Bertoni");
        for (int i = 0; i < 2; i++) {
            livros[i].mostraInfo();
        }

        Estante b1 = new Estante("Moisés");

        b1.start();

    }
}