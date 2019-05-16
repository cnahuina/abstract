package Abstract2;

public class Plasma extends TV {
    private double anguloVision;
    private double tiempoRespuesta;

    public Plasma(String marca, int pulgadas, String color, double precio) {
        super(marca, pulgadas, color, precio);
        setAnguloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
    }

    public Plasma() {
        setDescripcion("Plasma ... proximamente un LED");
    }

    
    public double getAnguloVision() {
        return anguloVision;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
    
    
}
