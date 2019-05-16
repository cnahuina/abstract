package Abstract;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(new ComponentesAzules());
        System.out.println("-------------- ");
        cliente = new Cliente(new ComponentesRojos());
    }
    
}
