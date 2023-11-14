package tendenciasmusicales;

class EstadoNormal implements EstadoPopularidad {

    private Cancion cancion;
    Presentacion presentacion = new Presentacion();

    public EstadoNormal(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void reproducir() {
        cancion.setReproducciones(cancion.getReproducciones() + 1);
        System.out.print("\n   ▶ REPRODUCIENDO    ");
        if (cancion.getReproducciones() > 1000) {
            cancion.actualizarEstado(new EstadoEnAuge(cancion));
        }
    }

    @Override
    public void darLike() {
        cancion.setLikes(cancion.getLikes() + 1);
    }

    @Override
    public void darDislike() {
        cancion.setDislikes(cancion.getDislikes() + 1);
        if (cancion.getDislikes() >= 5000) {
            cancion.actualizarEstado(new EstadoNormal(cancion));
        }
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(" ");
        //System.out.println("🇪​​​​​🇸​​​​​🇹​​​​​🇦​​​​​🇩​​​​​🇴​​​​​ 🇳​​​​​🇴​​​​​🇷​​​​​🇲​​​​​🇦​​​​​🇱\n");
        System.out.print(Icono.MUSICAL_NOTE.texto());
        System.out.println(" " + cancion.getArtista() + " - " + cancion.getAlbum()
                + " - " + cancion.getCancion() + "\n");
        presentacion.esperar(500);
    }
}
