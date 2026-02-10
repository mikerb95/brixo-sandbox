package proyecto.domain;

public abstract class figura {
    private final String nombre;

    protected figura(String nombre){
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

}
