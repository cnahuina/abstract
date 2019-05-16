package Abstract2;

public class LCD extends TV {
    private double costoFabricacion;

    public LCD(double costoFabricacion, String marca, int pulgadas, String color, double precio) {
        super(marca, pulgadas, color, precio);
        setCostoFabricacion(costoFabricacion);
    }

    public LCD() {
        setDescripcion("LCD");
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    
}
