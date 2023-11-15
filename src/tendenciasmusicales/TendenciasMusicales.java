package tendenciasmusicales;

/**
 * @author Elio Herrera
 */
public class TendenciasMusicales {

    public static void main(String[] args) {

        // Crear instancias de canciones para crear cancion
        Cancion theScientist = new Cancion("The Scientist", "“Coldplay", "A Rush of Blood to the head", 2002);
        
        // Crear instancias de logo para utilizar métodos
        Presentacion presentacion = new Presentacion();
        presentacion.logo();
        presentacion.cargando();

        // Escenario 1: Reproducción normal
        theScientist.reproducir();

        // Escenario 2: En auge por cantidad de reproducciones
        theScientist.setReproducciones(1100); // Video se reproduce 1100 veces
        theScientist.reproducir();

        // Escenario 3: Baja del auge por muchos dislikes
        int dislikes = 5000;
        for (int i = 0; i <= dislikes; i++) { // Video recibe 5000 dislikes
            theScientist.darDislike();
        }
        theScientist.reproducir();

        // Escenario 4: Tendencia por récord de reproducciones y likes
        theScientist.setDislikes(100); // Eliminamos dislikes
        theScientist.setReproducciones(55000); // Video se reproduce 55000 veces
        theScientist.setLikes(25000); // Video recibe 25000 likes
        theScientist.reproducir();
        
        //Escenario 5: Volver a estado normal por no ser escuchada en las últimas horas
        theScientist.setSinReproducionesEn24Horas(true); // Video no fue reproducido en 24hs
        theScientist.reproducir();
      
    }
}
