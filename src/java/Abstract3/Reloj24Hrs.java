package Abstract3;

import java.util.Date;

public class Reloj24Hrs extends Reloj{

    @Override
    String dameLaHora() {
        Date d = new Date();
        int hora = d.getHours();
        int minutos = d.getMinutes();
        int segundos = d.getSeconds();
        String tr;
        tr = "Son las " + hora + ":" + minutos + ":" + segundos + " ";
 
        return tr;
    }
    
}
