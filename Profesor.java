public class Profesor extends Personas {
    private String departamento;
    private double salario;
    private int aniosexperiencia;

    public Profesor(String nombre, String apellido, String numeroide, int edad, String direccion, String telefono, String departamento, double salario, int aniosexperiencia) {
        super(nombre, apellido, numeroide, edad, direccion, telefono);
        this.departamento = departamento;
        this.salario = salario;
        this.aniosexperiencia = aniosexperiencia;
    }

    public String getdepartamento() {
        return departamento;
    }

    public double getsalario() {
        return salario;
    }

    public int getaniosexperiencia() {
        return aniosexperiencia;
    }

    public void setdepartamento(String departamento) {
        if (departamento != null && !departamento.trim().isEmpty()) {
            this.departamento = departamento;
        } else {
            System.out.println("Error: Por favor, el siguiente espacio no puede ser nulo");
            this.departamento = "Sin ingresar";
        }
    }

    public void setsalario(double salario) {
        if (salario >= 0 && salario <= 5000000) {
            this.salario = salario;
        } else {
            System.out.println("Error: salario inválida. Debe estar entre 0 y 5000000");
            this.salario = 0;
        }
    }

    public void setaniosexperiencia(int aniosexperiencia) {
        if (aniosexperiencia >= 0 && aniosexperiencia <= 30) {
            this.aniosexperiencia = aniosexperiencia;
        } else {
            System.out.println("Error: edad inválida. Debe estar entre 10 y 80");
            this.aniosexperiencia = 0;
        }
    }

    public void enseniar() {
        System.out.println("El Profesor " + getnombre() + getapellido() + " Está Enseñando: " + departamento);
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Departamento: "+ this.getdepartamento());
        System.out.println("salario: "+ this.getsalario());
        System.out.println("Años de Experiencia: "+ this.getaniosexperiencia());
    }
}

