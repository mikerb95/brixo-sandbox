package proyecto.domain;

public abstract class figura {
    private final String nombre;

    protected figura(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la figura no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
