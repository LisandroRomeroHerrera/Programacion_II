public class Estudiantes extends Personas {
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiantes(String nombre, String apellido, String numeroide, int edad, String direccion, String telefono, String matricula, String carrera, double promedio) {
        super(nombre, apellido, numeroide, edad, direccion, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getmatricula() {
        return matricula;
    }

    public String getcarrera() {
        return carrera;
    }

    public double getpromedio() {
        return promedio;
    }

    public void estudiar() {

        System.out.println("El Estudiante " + getnombre() + getapellido() + " Está Estudiando: " + carrera);

    }

    public void setmatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.matricula = "Sin ingresar";
        }
    }

    public void setcarrera(String carrera) {
        if (carrera != null && !carrera.trim().isEmpty()) {
            this.carrera = matricula;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.carrera = "Sin ingresar";
        }
    }

    public void setpromedio(double promedio) {
        if (promedio >= 1 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: Promedio inválido. Debe estar entre 1 y 10");
            this.promedio = 0;
        }
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Matricula: "+ this.getmatricula());
        System.out.println("Carrera: "+ this.getcarrera());
        System.out.println("Promedio: "+ this.getpromedio());
    }
}

