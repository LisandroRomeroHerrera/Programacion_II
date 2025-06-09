public class EmpleadoAdministrativo extends Personas {
    private String cargo;
    private String horariotrabajo;
    private double salario;

    public EmpleadoAdministrativo(String nombre, String apellido, String numeroide, int edad, String direccion, String telefono, String cargo, String horariotrabajo, double salario) {
        super(nombre, apellido, numeroide, edad, direccion, telefono);
        this.cargo = cargo;
        this.horariotrabajo = horariotrabajo;
        this.salario = salario;
    }

    public String getcargo() {
        return cargo;
    }

    public String gethorariotrabajo() {
        return horariotrabajo;
    }

    public double getsalario() {
        return salario;
    }

    public void setcargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.cargo = "Sin ingresar";
        }
    }

    public void sethorariotrabajo(String horariotrabajo) {
        if (horariotrabajo != null && !horariotrabajo.trim().isEmpty()) {
            this.horariotrabajo = horariotrabajo;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.horariotrabajo = "Sin ingresar";
        }
    }

    public void setsalario(double salario) {
        if (salario >= 0 && salario <= 1.000000) {
            this.salario = salario;
        } else {
            System.out.println("Error: salario inválida. Debe estar entre 0 y 1.000.000");
            this.salario = 0;
        }
    }

    public void administrar() {
        System.out.println("El Empleado " + getnombre() + getapellido() + " Está realizando tareas Administrativas");
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Cargo: " + this.getcargo());
        System.out.println("Horario de Trabajo: " + this.gethorariotrabajo());
        System.out.println("Salario: " + this.getsalario());
    }
}
