package tendenciasmusicales;

class Icono {
    public static Icono MUSICAL_NOTE = new Icono("🎵");
    public static Icono ROCKET = new Icono("🚀");
    public static Icono FIRE = new Icono("🔥");

    private String internalEncoding;

    Icono(String internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return internalEncoding;
    }
}