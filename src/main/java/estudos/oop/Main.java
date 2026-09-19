package estudos.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("---");

        Moto minhaMoto = new Moto("Honda", 100);
        minhaMoto.getInfo();

        minhaMoto.acelerar();
        System.out.println("Velocidade atual: " + minhaMoto.getVelocidade());

        System.out.println("---");

        Moto minhaOutra = new Moto("Yamaha", 120);
        minhaOutra.getInfo();
    }
}
