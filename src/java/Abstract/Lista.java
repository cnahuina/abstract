package Abstract;

import java.util.ArrayList;

public abstract class Lista {
    private ArrayList<String> elementos = new ArrayList();
    public String getElemento(int posicion){
        return this.elementos.get(posicion);
    }
    
    public void insertarElemento(String texto){
        this.elementos.add(texto);
    }
    public void dibujar(){
        System.out.println("Dibujando lista");
    }
    
    public abstract void configurar();
}
