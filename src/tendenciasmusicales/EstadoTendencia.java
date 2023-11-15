package tendenciasmusicales;

class EstadoTendencia implements EstadoPopularidad {

    private Cancion cancion;
    Presentacion presentacion = new Presentacion();

    public EstadoTendencia(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void reproducir() {

        cancion.setReproducciones(cancion.getReproducciones());
        System.out.print("\n   ▶ REPRODUCIENDO    ");

        if (cancion.getDislikes() >= 5000 || cancion.getSinReproducionesEn24Horas() != false) {
            cancion.actualizarEstado(new EstadoNormal(cancion));
        }
        cancion.mostrarDetalle();

    }

    @Override
    public void darLike() {
        cancion.setLikes(cancion.getLikes());
    }

    @Override
    public void darDislike() {
        cancion.setDislikes(cancion.getDislikes());
        if (cancion.getDislikes() >= 5000) {
            cancion.actualizarEstado(new EstadoNormal(cancion));
        }
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("🇹​​​​​🇪​​​​​🇳​​​​​🇩​​​​​🇪​​​​​🇳​​​​​🇨​​​​​🇮​​​​​🇦");
        System.out.print(Icono.FIRE.texto());
        System.out.println(" " + cancion.getCancion() + " - " + cancion.getArtista()
                + " (" + cancion.getAlbum() + " - " + cancion.getAñoAlbum() + ")"
                + "\n");
        presentacion.esperar(500);
    }
}
