import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador []computador;
        Cliente cliente;
        Scanner input = new Scanner(System.in);

        computador = new Computador[3];
        computador[0] = new Computador("Positivo", 2300.00f, 1);
        computador[1] = new Computador("Acer", 5800.00f, 2);
        computador[2] = new Computador("Vaio", 1800.00f, 3);

        System.out.println("Bem vindo a loja PC Mania!");
        System.out.println("Como prefere ser chamado: ");
        String nome = input.nextLine();
        System.out.println("Digite seu CPF: ");
        long cpf = input.nextLong();

        cliente = new Cliente(nome, cpf);

        System.out.println("Certo " + cliente.nome + ", confira abaixo as nossas promoções");
        for (int i = 0; i < computador.length; i++) {
            computador[i].mostraPcConfig();
        }
        int codigo = 0;
        System.out.println("Digite o codigo do produto que deseja comprar: ");
        System.out.println("Caso não queira nada, basta digitar 0(ZERO)!");
        System.out.println("Obsservação: Você pode selecionar até 3 items.");

        do{
            codigo = input.nextInt();
            if(codigo != 0){
                cliente.addComputador(computador[codigo-1]);
                System.out.println(computador[codigo-1].marca + " adicionado ao seu carrinho.");
            }
        }while(codigo != 0);
        input.close();

        cliente.mostraCliente();
        System.out.println("O total da sua compra foi de: " + cliente.calculaTotalCompra());
        System.out.println("Obrigado por comprar conosco, " + cliente.nome + "!");

        return;
    }

}