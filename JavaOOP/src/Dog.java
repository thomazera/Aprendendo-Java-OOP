public class Dog extends  Animal{

    @Override
    public void makeNoise() {
        System.out.println("O cahorro late, esse e o seu som: Au! Au!");
    }

    @Override
    public void makeWalk() {
        System.out.println("O cachorro se movimenta andando");
    }
}
