public class Vechicle {
    // Por boa pratica e sempre bom ter dois construtores, um vazio como mostra abaixo para que nao seja obrigatorio passar parametros para a classe filha se houver
    public Vechicle() {

    }

    // E o segundo construtor com parametros a receber, permitindo que as classses filhas herdem qualquer um dos dois construtores sem travar o codigo
    public Vechicle(String cor, String motor, Double velocidade) {
        this.motor      = motor;
        this.cor        = cor;
        this.velocidade = velocidade;

    }

    private String cor;
    private String motor;
    private Double velocidade;



    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setVelocidad(Double velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public String getMotor() {
        return motor;
    }

    public Double getVelocidade() {
        return velocidade;
    }


    // Polimorfismo, resume-se em a classe filha herdar atributos da classe mae mas podendo sobreescreve-la, segue exemplo abaixo
    public void tipoVeiculo(){
        System.out.println("eu sou um veiculo, mas nao tenho mais detalhes");
    }

}
