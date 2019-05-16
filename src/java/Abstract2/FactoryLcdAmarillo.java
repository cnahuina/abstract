package Abstract2;

public class FactoryLcdAmarillo extends TvAbstractFactory{

    @Override
    public TV createTV() {
      return new Plasma();
    }

    @Override
    public Color createColor() {
      return new Amarillo();
    }
    
}
