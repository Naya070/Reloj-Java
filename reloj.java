
/**
 * Esta clase sirve para crear objetos del tipo reloj.
 * El método creado puede calcularte los minutos totales y segundos totales que tiene la hora puesta en el objeto reloj.
 * La hora debe tener formato de 24 horas.
 * El formato de 12 horas no está permitido.
 * @author (Nayarith del Carmen Jiménez 201700188) 
 * @version (27/06/2021)
 */
public class reloj
{
    // instance variables - replace the example below with your own
    private int hora, minutos;
    

    /**
     * Constructor for objects of class reloj
     * Construyendo un objeto de la clase reloj.
     * Introduce la hora y los minutos en formato de 24 horas.
     * Ejemplo 3:30  colocar hora:3  minutos:30 
     * Ejemplo 17:15 colocar hora:17 minutos:15 
     */
    public reloj(int hora_entrada, int minutos_entrada)
    {
        // initialise instance variables
        hora = hora_entrada;
        minutos = minutos_entrada;
        
    }

    /**
     * Este método te dice cuantos minutos tiene la hora del objeto reloj.
     * También te dice cuantos segundos tiene dicha hora.
     */
    public String contador()
    {
        // put your code here
        if ((24 < hora || hora < 0) || (60 < minutos || minutos < 0 )) {return "hora no válida";}
        
        else {}
        
                
        int min = ((hora * 60) + (minutos));
        int seg = (min* 60);
        
        return "Minutos:/ " +min + "/ Segundos: /" + seg ;
    }
}
