public abstract class Animal {
    // Uma classe abstrata permite que tenha metodos padrões que as classes **filha herdem esses comportamentos e se comportam de maneira diferente
    /* Exemplo:
    *   Quando falamos de uma Classe Animal, estamos abrangendo todo tipo de animal, ao criar uma Classe Dog estamos herdendo da Classe Animal as caracteristicas
    *   da classe mae, porem um cachorro late e um gato mia, mas ambos fazer algun tipo de som por serem animais. */

    public void makeNoise(){};
    public void makeWalk(){};

}
