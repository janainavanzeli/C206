public class Cliente {
    String nome;
    long cpf;
    Computador []computador;

    public Cliente(String _nome, long _cpf){
        this.nome = _nome;
        this.cpf = _cpf;
        this.computador = new Computador[3];
    }

    public void addComputador(Computador _PC){
        for(int i = 0; i < this.computador.length; i++){
            if(computador[i] == null){
                computador[i] = _PC;
            }
        }
    }
    public void mostraCompras(){
        for(int i = 0; i < this.computador.length; i++){
            if(computador[i] != null){
                computador[i].mostraPCConfigs();
            }
        }
    }

    public float mostraCliente(){
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Número do CPF: " + this.cpf);
        System.out.println("Compras: ");
        this.mostraCompras();
    }

    public float calculaTotalCompra(){
        float valor = 0;
        for(int i = 0; i < this.computador.length; i++){
            if(computador[i] != null){
                valor += computador[i].preco;
            }
        }
        return valor;
    }
}