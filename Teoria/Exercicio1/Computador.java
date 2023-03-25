public class Computador{

    public

        String marca;
        float preco;
        SistemaOperacional sistemaoperacional;
        HardwareBasico []hardwareBasico;
        MemoriaUSB memoriaUSB;
        int codigo;

    public Computador(
            String _marca,
            float _preco,
            int _codigo){

        this.marca = _marca;
        this.preco = _preco;
        this.sistemaOperacional = this.montarSO(_marca);
        this.hardwareBasico = this.montarHardware(_marca);
        this.codigo = _codigo;
    }

    public void mostraPCConfigs(){
        System.out.println(this.linha() + "[ " + this.marca +" )" + this.linha());
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional.nome);
        System.out.println("Hardware: ");
        for (int i =0; i < this.hardwareBasico.length; i++){
            System.out.println("    - " + this.hardwareBasico[i].nome + " - " + this.hardwareBasico[i].capacidade);
        }
        if(this.memoriaUSB != null){
            System.out.println("Memória USB: " + this.marca + " - " + this.memoriaUSB.capacidade);
        }
        System.out.println(this.linha() + "[ " +this.marca + " ]" + this.linha());
    }

    public void addMemoriaUSB(MemoriaUSB _memUSB){
        System.out.println("f() add memoria USB");
    }

    public HardwareBasico[] montarHardware(String _marca){
        if(_marca == "Positivo"){
            HardwareBasico[] hardware = new HardwareBasico[3];
            hardware[0] = new HardwareBasico("Processador Pentium Core i3", 2200);
            hardware[1] = new HardwareBasico("Memoria RAM", 8);
            hardware[2] = new HardwareBasico("HD", 500);
            return hardware;
    }
        else if(_marca == "Acer"){
            HardwareBasico[] hardware = new HardwareBasico[3];
            hardware[0] = new HardwareBasico("Processador Pentium Core i5", 3370);
            hardware[1] = new HardwareBasico("Memoria RAM", 16);
            hardware[2] = new HardwareBasico("HD", 1);
            return hardware;
        }
        else if(_marca == "Vaio"){
            HardwareBasico[] hardware = new HardwareBasico[3];
            hardware[0] = new HardwareBasico("Processador Pentium Core i7", 4500);
            hardware[1] = new HardwareBasico("Memoria RAM", 32);
            hardware[2] = new HardwareBasico("HD", 2);
            return hardware;
        }
        else{
            System.out.println("Marca não encontrada!");
            return null;
        }
    }

    public SistemaOperacional montaSO(String _marca){
        if(_marca == "Positivo"){
            return new SistemaOperacional("Linux", 32);
        }
        else if(_marca == "Acer"){
            return new SistemaOperacional("Windows 8", 64);
        }
        else if(_marca == "Vaio"){
            return new SistemaOperacional("Windows 10", 64);
        }
        else{
            System.out.println("Marca não encontrada!");
            return null;
        }
    }

    public String linha(){
        return "======================";
    }

}