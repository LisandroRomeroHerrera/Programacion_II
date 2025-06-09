public class Personas {
    private String nombre;
    private String apellido;
    private String numeroide;
    private int edad;
    private String direccion;
    private String telefono;


    public Personas() {
        this.nombre = "";
        this.apellido = "";
        this.numeroide = "";
        this.edad = 0;
        this.direccion = "";
        this.telefono = "";
    }

    public Personas(String nombre, String apellido, String numeroide, int edad, String direccion, String telefono) {
        this.setnombre(nombre);
        this.setapellido(apellido);
        this.setnumeroide(numeroide);
        this.setedad(edad);
        this.setdireccion(direccion);
        this.settelefono(telefono);
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public String getnumeroide() {
        return numeroide;
    }

    public int getedad() {
        return edad;
    }

    public String getdireccion() {
        return direccion;
    }

    public String gettelefono() {
        return telefono;
    }

    public void setnombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.nombre = "Sin ingresar";
        }
    }

    public void setapellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.apellido = "Sin ingresar";
        }
    }

    public void setnumeroide(String numeroide) {
        if (numeroide != null && !numeroide.trim().isEmpty()) {
            this.numeroide = numeroide;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.numeroide = "Sin ingresar";
        }
    }

    public void setedad(int edad) {
        if (edad >= 18 && edad <= 80) { // Ejemplo de validación
            this.edad = edad;
        } else {
            System.out.println("Error: edad inválida. Debe estar entre 10 y 80");
            this.edad = 0;
        }
    }

    public void setdireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.direccion = "Sin ingresar";
            ;
        }
    }

    public void settelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.telefono = "Sin ingresar";
            ;
        }
    }

    public String getnombreCompleto() {

        return nombre + " " + apellido;

    }

    public void mostrarinfo() {
        System.out.println("Aquí estan los Datos Solicitados");
        System.out.println("Nombre: "+ this.getnombre());
        System.out.println("Apellido: "+ this.getapellido());
        System.out.println("NumeroIde: "+ this.getnumeroide());
        System.out.println("Edad: "+ this.getedad());
        System.out.println("Direccion: "+ this.getdireccion());
        System.out.println("Telefono: "+ this.gettelefono());
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es: " + nombre + " " + apellido);

    }

}