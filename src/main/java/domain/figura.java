package domain;

public abstract class figura {

    private final String nombre;

    public figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
