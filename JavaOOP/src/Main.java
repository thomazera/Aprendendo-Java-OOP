

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Testando construção de classes, metodos e construtores, encapsulamento: Classe Person
        Person pessoa1 = new Person("Thomas", "Olympio",24);
        pessoa1.say();
        System.out.println(Person.walk());
        System.out.println("Ola, é um prazer em conhece-lo: " + pessoa1.getName());
        System.out.println("Ola " + pessoa1.getName() + " " + pessoa1.getSobrenome() + " , sua idade é: " + pessoa1.getIdade());
        pessoa1.setCpf(123456);
        System.out.println("Seu cpf é : " + pessoa1.getCpf());
        pessoa1.aniversario();

        // Testando herança: Classe Carro extends Vechicle
        Carro carro1 = new Carro("Azul", "A combustão", 220.00);
        System.out.println(carro1.getCor());

        // Testando composição: Classe CarroComposition
        // metodo vechicle sendp chamado pois compus a classe vechicle na classe carrocomposition
        CarroComposition tipo1 = new CarroComposition();
        tipo1.getVechicle().setCor("Verde");
        System.out.println(tipo1.getVechicle().getCor());
        CarroComposition tipo2 = new CarroComposition();
        // metodo private Carro carro, sendo necessario criar o objeto do tipo carro
        tipo2.setCarro(new Carro("Azul", "COmbustao",250.00));
        System.out.println(tipo2.getCarro().getVelocidade());


        // Testando polimorfismo: Classes Vechicle e Carro
        Vechicle veiculo = new Vechicle();
        veiculo.tipoVeiculo();
        Carro carro2 = new Carro("Azul", "Combustão", 220.0);
        carro2.tipoVeiculo();
        System.out.println(carro1.modelo("Ford"));


        // Testando interface: Classe Person e interface Iperson
        pessoa1.andar();
        pessoa1.piscar();

        // Testando abstract Class: Abstract class Animal, Classe Dog e Cat
        Dog dog1 = new Dog();
        dog1.makeNoise();
        dog1.makeWalk();
        Cat cat1 = new Cat();
        cat1.makeNoise();
        cat1.makeWalk();







    }
}

