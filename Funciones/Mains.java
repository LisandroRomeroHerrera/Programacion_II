package Funciones;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

final class Funciones {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Mostrar Mensaje Fijo");
        Funciones.funciones.mostrarsaludo();
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Saludo Personalizado");
        System.out.println("Ingrese Su Nombre Por Favor");
        Scanner scanner1 = new Scanner(System.in);
        String nombre = scanner1.nextLine();
        Funciones.funciones.saludar(nombre);
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Área de un Rectángulo");
        System.out.println("Ingresá La base Del Rectángulo");
        Scanner scanner2 = new Scanner(System.in);
        double base = scanner2.nextDouble();
        System.out.println("Ahora Ingresá La Altura Del Rectángulo");
        Scanner scanner3 = new Scanner(System.in);
        double altura = scanner3.nextDouble();
        double area = Funciones.funciones.CalcularAR(base, altura);
        System.out.println("Gracias, El Area del Rectangulo Seria: " + area);
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Convertir a Mayúscula");
        System.out.println("Ingresá un texto en minuscula por favor");
        Scanner scanner4 = new Scanner(System.in);
        String Respuesta = scanner4.nextLine();
        String Respuesta2 = Funciones.funciones.RevisionDeMayusculas(Respuesta);
        System.out.println("Aquí tienes El texto En Mayusculas");
        System.out.println(Respuesta2);
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Mostrar Menú");
        Funciones.funciones.MostrarMenu();
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Número par o impar");
        int numeroVerPar = 8;
        System.out.println("Las Siguiente Palabra a Verificar es 8, 8 es par?: " + Funciones.funciones.esPar(numeroVerPar));
        int numeroVerPar2 = 3;
        System.out.println("Las Siguiente Palabra a Verificar es 3, 3 es par?: " + Funciones.funciones.esPar(numeroVerPar2));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Calcular el cuadrado de un número");
        int numeroVerCuadrado = 5;
        int numeroVerCuadrado2 = 8;
        System.out.println("El Resultado de 5 al cuadrado es: " + Funciones.funciones.RESCuadrado(numeroVerCuadrado));
        System.out.println("El Resultado de 8 al cuadrado es: " + Funciones.funciones.RESCuadrado(numeroVerCuadrado2));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo Factorial Recursivo: ");
        System.out.println("El Resultado del Calculo factorial del Numero 12 es de: " + Funciones.funciones.Factorial((double)12.0F));
        System.out.println("El Resultado del Calculo factorial del Numero 8 es de: " + Funciones.funciones.Factorial((double)8.0F));
        System.out.println("El Resultado del Calculo factorial del Numero 20 es de: " + Funciones.funciones.Factorial((double)20.0F));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo Sumar Multiples Numeros: ");
        int[] var10001 = new int[]{1, 2, 3, 4, 5};
        System.out.println("Suma del 1 al 5: " + Funciones.funciones.Sumar(var10001));
        var10001 = new int[]{10, 50, 30};
        System.out.println("Suma de 10,50,30: " + Funciones.funciones.Sumar(var10001));
        var10001 = new int[]{30, 80, 100};
        System.out.println("Suma de 30,80,100: " + Funciones.funciones.Sumar(var10001));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo Promedio de un Array: ");
        double[] PromedioArray = new double[]{(double)24.0F, (double)40.5F, (double)29.0F, (double)70.0F, (double)85.5F};
        System.out.println("Promedio del Array: " + Funciones.funciones.Promedio(PromedioArray));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo Buscar el valor de un Array: ");
        int[] BuscarArray = new int[]{20, 60, 9, 2, 10, 14, 6, 32, 51};
        System.out.println("¿El Numero 9 Esta en el Array? " + Funciones.funciones.BuscadorNumero(BuscarArray, 9));
        System.out.println("¿El Numero 19 Esta en el Array? " + Funciones.funciones.BuscadorNumero(BuscarArray, 19));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Contar ocurrencias");
        String[] PalabraOcurrente = new String[]{"sal", "caca", "gestor", "papaya", "causcasico", "sal", "neumático", "ala", "sal", "neumático"};
        System.out.println("¿Cuantas veces aparece la palabra sal? " + Funciones.funciones.ContadorOcurrencia(PalabraOcurrente, "sal"));
        System.out.println("¿Cuantas veces aparece la palabra neumático? " + Funciones.funciones.ContadorOcurrencia(PalabraOcurrente, "neumático"));
        System.out.println("¿Cuantas veces aparece la palabra Rata? " + Funciones.funciones.ContadorOcurrencia(PalabraOcurrente, "Rata"));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Imprimir array de forma formateada");
        int[] NumerosEnteros = new int[]{-10, -6, -5, -2, 5, 6, 8, 10};
        int[] NumerosEnteros2 = new int[]{-90, -50, -20, -1, 50, 63, 82, 101};
        System.out.println("Array de Numeros Enteros Formateados: " + Funciones.funciones.Formateado(NumerosEnteros));
        System.out.println("2° Array de Numeros Enteros Formateados: " + Funciones.funciones.Formateado(NumerosEnteros2));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: invertir array");
        int[] NumerosNormales = new int[]{1, 2, 3, 10, 11, 12, 13, 20};
        System.out.println("Numeros: 1, 2, 3, 10, 11, 12, 13, 20");
        System.out.println("Array de Numeros Enteros Formateados: " + Arrays.toString(Funciones.funciones.Invertido(NumerosNormales)));
        System.out.println("------------------------------------");
        System.out.println("Aquí se llama al metodo: Estudiante con mejor nota");
        double[] notas = new double[]{(double)1.0F, (double)2.0F, (double)3.5F, (double)10.0F, (double)4.0F, (double)2.0F, (double)8.5F, (double)10.0F, (double)7.5F};
        String[] nombres = new String[]{"Juan", "José", "Luciana", "Rombai", "Maluma", "Ambrosia", "Carla", "Tomas", "Roberta"};
        PrintStream var10000 = System.out;
        String var28 = Funciones.funciones.mejoresnotas(nombres, notas);
        var10000.println("La Persona que tiene la mejor Nota del Curso De Programación de Software es de: " + var28);
        System.out.println("------------------------------------");
    }

    public static class funciones {

        /// Aquí esta el metodo: 1_ Mostrar mensaje fijo ////
        public static void mostrarsaludo() {
            System.out.println("Hola Mundo y Hola profe que esta probando el codigo jaja saludos");
        }
        ///
        /// Aquí esta el metodo: 2_ Saludo personalizado ////
        public static void saludar(String nombre) {
            System.out.println("Hola " + nombre);
        }
        ///
        /// Aquí esta el metodo: 3_ Área de un rectángulo ////
        public static double CalcularAR(double base, double altura) {
            return base * altura;
        }
        ///
        /// Aquí esta el metodo: 4_ Convertir a mayúsculas ////
        public static String RevisionDeMayusculas(String Respuesta) {
            return Respuesta.toUpperCase();
        }
        ///
        /// Aquí esta el metodo: 5_ Mostrar menú ////
        public static void MostrarMenu() {
            System.out.println("Elije una de las Siguientes Opciones: A) Manzana  --  B) Naranja -- C) Bananas");
        }
        ///
        /// Aquí esta el metodo: 6_ Número par o impar ////
        public static boolean esPar(int Numero) {
            return Numero % 2 == 0;
        }
        ///
        /// Aquí esta el metodo: 7_ Calcular el cuadrado de un número ////
        public static int RESCuadrado(int RNumero) {
            return RNumero * RNumero;
        }
        ///
        /// Aquí esta el metodo: 8_ Factorial recursivo ////
        public static double Factorial(double n) {
            return n == (double)0.0F ? (double)1.0F : n * Factorial(n - (double)1.0F);
        }
        ///
        /// Aquí esta el metodo: 9_ Sumar múltiples números (varargs) ////
        public static int Sumar(int... numeros1) {
            int suma1 = 0;

            for(int num1 : numeros1) {
                suma1 += num1;
            }

            return suma1;
        }
        ///
        /// Aquí esta el metodo: 10_ Promedio de un array ////
        public static double Promedio(double[] numeros2) {
            double suma2 = (double)0.0F;

            for(double numeros3 : numeros2) {
                suma2 += numeros3;
            }

            return suma2 / (double)numeros2.length;
        }
        ///
        /// Aquí esta el metodo: 11_ Buscar valor en array ////
        public static boolean BuscadorNumero(int[] numeros4, int numeroBuscado) {
            for(int numeros5 : numeros4) {
                if (numeros5 == numeroBuscado) {
                    return true;
                }
            }

            return false;
        }
        ///
        /// Aquí esta el metodo: 12_ Contar ocurrencias ////
        public static int ContadorOcurrencia(String[] ArrayPalabras, String Lapalabra) {
            int Contador = 0;

            for(String palabra : ArrayPalabras) {
                if (palabra.equals(Lapalabra)) {
                    ++Contador;
                }
            }

            return Contador;
        }
        ///
        /// Aquí esta el metodo: 13_ Imprimir array de forma formateada ////
        public static String Formateado(int[] ArrayNumero) {
            String NFormateado = "";
            NFormateado = "{" + ArrayNumero[0] + "}";

            for(int n = 1; n < ArrayNumero.length; ++n) {
                NFormateado = NFormateado + "{" + ArrayNumero[n] + "},";
            }

            return NFormateado;
        }
        ///
        /// Aquí esta el metodo: 14_ Invertir array ////
        public static int[] Invertido(int[] arrayNumeros3) {
            int[] arrayNumero4 = new int[arrayNumeros3.length];

            for(int n = 0; n < arrayNumeros3.length; ++n) {
                arrayNumero4[n] = arrayNumeros3[arrayNumeros3.length - 1 - n];
            }

            return arrayNumero4;
        }
        ///
        /// Aquí esta el metodo: 15_ Estudiante con mejor nota ////
        public static String mejoresnotas(String[] nombres, double[] nota) {
            double MejoresNotas = (double)0.0F;
            String nombre = "";

            for(int n = 0; n < nombres.length; ++n) {
                double Notas = nota[n];
                if (Notas > MejoresNotas) {
                    MejoresNotas = Notas;
                    nombre = nombres[n];
                }
            }

            return nombre;
        }
    }
}