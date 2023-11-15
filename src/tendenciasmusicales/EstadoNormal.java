package tendenciasmusicales;

class EstadoNormal implements EstadoPopularidad {

    private Cancion cancion;
    Presentacion presentacion = new Presentacion();

    public EstadoNormal(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void reproducir() {
        cancion.setReproducciones(cancion.getReproducciones() + 1); //Agrega una reproducción
        System.out.print("\n   ▶ REPRODUCIENDO    ");

        if (cancion.getDislikes() >= 5000 || cancion.getSinReproducionesEn24Horas() != true) {
            if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
                cancion.actualizarEstado(new EstadoTendencia(cancion));
            } else if (cancion.getReproducciones() > 1000) {
                cancion.actualizarEstado(new EstadoEnAuge(cancion));
            }
        }
        cancion.mostrarDetalle();
    }

    @Override
    public void darLike() {
        cancion.setLikes(cancion.getLikes() + 1); //Agrega un like
        if (cancion.getReproducciones() > 1000) {
            cancion.actualizarEstado(new EstadoEnAuge(cancion));
        }
    }

    @Override
    public void darDislike() {
        cancion.setDislikes(cancion.getDislikes() + 1); //Agrega un dislike
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("​​​​​🇳​​​​​🇴​​​​​🇷​​​​​🇲​​​​​🇦​​​​​🇱");
        System.out.print(Icono.MUSICAL_NOTE.texto());
        System.out.println(" " + cancion.getArtista() + " - " + cancion.getAlbum()
                + " - " + cancion.getCancion() + "\n");
        presentacion.esperar(500);
    }

}
