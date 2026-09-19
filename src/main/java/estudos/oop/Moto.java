package estudos.oop;

public class Moto {
    private String modelo;
    private int velocidade;

    public Moto(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int acelerar() {
        return this.velocidade + 10;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void getInfo() {
        System.out.println("Modelo: " + this.modelo);
    }
}
