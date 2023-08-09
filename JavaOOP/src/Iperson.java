public interface Iperson {

    // Basicamente a interface traz assinaturas de metodos para uma classe
    // Para chamar uma interface para uma classe, basta por apos o nome da classe a palavra chave implements e o nome da interface
    // ex: public class Person implements Iperson
    // Apos isso, para chamar as assinaturas da interface na classe que deseja, basta invocar os metodos da interface e @override encima do metodo
    /* Ex: Chamand a interface na classe Person

        public class Person implements Iperson {

            @Override
            public void piscar();

            @Override
            public void andar();


        }

     */

    public void piscar();

    public void andar();
}