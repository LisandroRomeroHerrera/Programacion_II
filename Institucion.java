import java.util.ArrayList;
import java.util.List;

public class Institucion {
    public static void main(String[] args) {
        Personas persona1 = new Personas(
                "Licha",
                "Romero",
                "212121",
                20,
                "Los Molles 40",
                "445351643"
        );

        Estudiantes estudiante1 = new Estudiantes(
                "Lucas",
                "Romo",
                "212122",
                30,
                "Paraguay 400",
                "3541318154",
                "43",
                "Tecnico Superior en Desarrollo de software",
                10
        );

        Profesor profesor1 = new Profesor(
                "Luquetti",
                "Ballestero",
                "212123",
                41,
                "Paraguay 450",
                "3541696969",
                "415",
                2,
                10
        );

        EmpleadoAdministrativo empleado1 = new EmpleadoAdministrativo(
                "José",
                "Juan",
                "210",
                60,
                "Los mollese 415",
                "354167890",
                "Limpia retretes",
                "10AM hasta las 10PM",
                150.000
        );

        persona1.mostrarinfo();
        estudiante1.mostrarinfo();
        profesor1.mostrarinfo();
        empleado1.mostrarinfo();
        System.out.println("-------------------------------------------");
        estudiante1.estudiar();
        profesor1.enseniar();
        empleado1.administrar();

        List<Personas> listadepersonas = new ArrayList<>();

        listadepersonas.add(persona1);
        listadepersonas.add(estudiante1);
        listadepersonas.add(profesor1);
        listadepersonas.add(empleado1);
        System.out.println("-------------------------------------------");
        for (Personas personas : listadepersonas) {
            personas.mostrarinfo();
            System.out.println("-------------------------------------------");
        }
    }
}
