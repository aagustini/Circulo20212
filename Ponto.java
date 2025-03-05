public class Ponto {
    private double coordX;
    private double coordY;

    // construtor da classe ponto
    public Ponto(double umX, double umY){
        coordX = umX;
        coordY = umY;
    }

    // default - ponto na coordenada (0,0)
    public Ponto() {
        coordX = 0;
        coordY = 0;
    }
                  
    public void mover(double novoX, double novoY) {
        coordX = novoX;
        coordY = novoY;
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", coordX, coordY);
    }
}
