
package Abstract2;

public class main {

    public static void main(String[] args) {
        TvAbstractFactory f1 = new FactoryLcdAzul();
        EnsamblajeTV e = new EnsamblajeTV(f1);
        
        TvAbstractFactory f2 = new FactoryLcdAmarillo();
        EnsamblajeTV e2 = new EnsamblajeTV(f2);
    }
    
}
