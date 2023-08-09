public class Carro extends Vechicle {

    public Carro() {}
    public Carro(String cor, String motor, Double velocidade) {
        super(cor, motor, velocidade);
    }

    public void tipoVeiculo(){
        System.out.println("eu sou um veiculo, mas eu tenho detalhes e eu sou um carro");
    }

    public String modelo(String marca){
        return marca;
    }



}
