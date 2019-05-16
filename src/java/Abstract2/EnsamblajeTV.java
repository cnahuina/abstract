package Abstract2;

public class EnsamblajeTV {
    public EnsamblajeTV(TvAbstractFactory factory){
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
}
