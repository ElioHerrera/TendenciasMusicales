package tendenciasmusicales;

class Cancion {

    private String cancion;
    private String artista;
    private String album;
    private int añoAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private boolean sinReproducionesEn24Horas;
    private EstadoPopularidad estado;

    public Cancion(String cancion, String artista, String album, int añoAlbum) {
        this.cancion = cancion;
        this.artista = artista;
        this.album = album;
        this.añoAlbum = añoAlbum;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.sinReproducionesEn24Horas = false;
        this.estado = new EstadoNormal(this);
    }

    public void reproducir() {
        estado.reproducir();
    }

    public void darLike() {
        estado.darLike();
    }

    public void darDislike() {
        estado.darDislike();
    }

    public void mostrarDetalle() {
        estado.mostrarDetalle();
    }
    
    public void actualizarEstado(EstadoPopularidad nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters y Setters
    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public boolean getSinReproducionesEn24Horas() {
        return sinReproducionesEn24Horas;
    }

    public void setSinReproducionesEn24Horas(boolean sinReproducionesEn24Horas) {
        this.sinReproducionesEn24Horas = sinReproducionesEn24Horas;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public String getCancion() {
        return cancion;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public int getAñoAlbum() {
        return añoAlbum;
    }
}
