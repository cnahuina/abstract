package Abstract2;

public class Azul extends Color {
    private boolean esPrimario;
    
    
    public void colorea (TV tv){
        System.out.println("pintando de Azul el " + tv.getDescripcion());
    }

    public boolean isEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }
    
    
}
