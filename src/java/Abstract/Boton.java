package Abstract;

/**
 *
 * @author harold
 */
public abstract class Boton {
    private String texto;

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void dibujar(){
        System.out.println("Dibujando el boton ... ");
    
    }
    
    public abstract void configurar();
  
    
    
}
