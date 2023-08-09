
// Entendend a composição, composição permite chamar uma classe mãe sem herda-la diretamente, dando mais liberdade em certas ocasiões
public class CarroComposition {
    // Dentre os dois metodos abaixo carro e vechicle, o mais efieciente ao chamar o codigo na main seria o vechicle, pois nao e necessario criar uma  objeto do tipo carro para depois poder ter acesso a classe carro
    // Usar o metodo do vechicle é a melhor opçao, pois ao instanciar o objeto na classe Carro Composition eu herdo todos os atributos da classe vechicle sem precisar criar um objeto na main para poder acsssara classe vechicle
    // Necessario criar o objeto do tipo carro para acessar a classe carro apos criar o objeto Carro Composition.
    private Carro carro;
    // Cria automaticamente ao criar o objeto do tipo Carro Composition, chamando a classe vechicle herdada.
    private Vechicle vechicle = new Vechicle();
    public CarroComposition() {}
    public void setVechicle(Vechicle vechicle) {
        this.vechicle = vechicle;
    }
    public Vechicle getVechicle() {
        return this.vechicle;
    }

    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
