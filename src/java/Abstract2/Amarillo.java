package Abstract2;

public class Amarillo extends Color{
    private boolean esPrimario;

    @Override
    public void colorea(TV tv) {
        System.out.println("pintando de amarillo el " + tv.getDescripcion());
        
    }

    public boolean isEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }
    
}
