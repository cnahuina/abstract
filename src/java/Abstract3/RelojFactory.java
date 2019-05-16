package Abstract3;

public class RelojFactory {
    public static final int RELOJ_AM_PM = 0;
    public static final int RELOJ_24_HRS = 1;

    public RelojFactory() {
    }
    
    public static Reloj createReloj(int tipoDeReloj){
        if(tipoDeReloj== RelojFactory.RELOJ_24_HRS){
            return new Reloj24Hrs();
        }
        if(tipoDeReloj== RelojFactory.RELOJ_AM_PM){
            return new RelojAmPm();
        }
        return null;
    }
}
