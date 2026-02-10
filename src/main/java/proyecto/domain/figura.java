package proyecto.domain;

public abstract class figura {
    private final String nombre;

    protected figura(String nombre){
        if (nombre == null || nombre.isBlank()) {   // Validación del nombre
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío"); // Validación del nombre
        }
        this.nombre = nombre; // Asignación del nombre
    }
    public String getNombre() { // Método para obtener el nombre
        return nombre;
    }
    public abstract double calcularArea(); // Método abstracto para calcular el área
}
