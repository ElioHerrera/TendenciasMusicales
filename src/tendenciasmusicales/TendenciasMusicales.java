package tendenciasmusicales;

/**
 *
 * @author Elio Herrera
 */
public class TendenciasMusicales {

    public static void main(String[] args) {

// Crear instancias de canciones para probar
        Cancion theScientist = new Cancion("The Scientist", "“Coldplay", "A Rush of Blood to the head", 2002);
        Presentacion presentacion = new Presentacion();
        presentacion.logo();
        presentacion.cargando();

        // Escenario 1: Reproducción normal
        theScientist.reproducir();
        theScientist.mostrarDetalle();

        // Escenario 2: En auge
        theScientist.setReproducciones(1100); //Video se reproduce 1100 veces
        theScientist.reproducir();
        theScientist.mostrarDetalle();

        // Escenario 3: Baja del auge por muchos dislikes
        
        int dislike = 5000;
        for(int i = 0; i <= dislike; i++){
        theScientist.darDislike();
        }
        
        
            
              
       
        theScientist.reproducir();
        theScientist.mostrarDetalle();

        theScientist.setDislikes(5);
        
        // Escenario 4: Tendencia por récord de reproducciones y likes
        theScientist.setReproducciones(55000);
        theScientist.setLikes(25000);
        theScientist.reproducir();
        theScientist.mostrarDetalle();
        
        //Escenario 5: Volver a ser normal por no ser escuchada en las últimas horas
        theScientist.setSinReproducionesEn24Horas(true);
        theScientist.setReproducciones(11); //Video s
        theScientist.reproducir();
        theScientist.mostrarDetalle();

    }

}
