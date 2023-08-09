public class Person implements Iperson {
    private String name = null;
    private Integer idade = null;
    private String sobrenome = null;
    private Integer cpf = null;


    // Constructor da classe Person
    public Person(String name, String sobrenome, Integer idade) {
        this.name = name;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }

    // Encapsulando a classe

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }


    public String getName() {
        return this.name;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    // Metodo void nao necessita de return
    public void say() {
        System.out.println("Ola meu nome é: " + name);
    }

    // Metodo static invoca a função e ele nao depende de um objeto para ser chamado
    // Para chama-lo basta, como nesse caso nossa classe chama Person, System.out.println(Person.walk());

    public static String walk() {
        return "Caminhando ...";
    }

    public void aniversario() {
        int idade = this.idade + 1;
        System.out.println("Feliz aniversario, sua idade agora é: " + idade);
    }

    @Override
    public void piscar() {
        System.out.println("O ser humano pisca a uma velocidade de milisegundos");

    }

    @Override
    public void andar() {
        System.out.println("O ser humano pode ser considerado um ser vivo rápido");

    }
}