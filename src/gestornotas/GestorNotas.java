package gestornotas;

public class GestorNotas {

    public double calcularMedia(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        double media = suma / 12; // El valor 3 representa el número de notas.
        return media;
    }

    public void mostrarResultado(double media) {
        System.out.println();
        System.out.println("La nota media es: " + media);

        extracted(media);
    }

    private static void extracted(double media) {
        if (media >= 5) { // El valor 5 representa la nota mínima para aprobar.
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }
    }

    // Este método no se utiliza desde ninguna otra parte del programa.
    public void mostrarEstadoAlumno(String nombre, double nota) {
        if (nota >= 5) {
            System.out.println(nombre + ": aprobado");
        } else {
            System.out.println(nombre + ": suspenso");
        }
    }

    public void mostrarEstadoGrupo(double nota1, double nota2, double nota3) {
        // Esta comprobación repite la lógica del método mostrarEstadoAlumno.
        if (nota1 >= 5) {
            System.out.println("Alumno 1: aprobado");
        } else {
            System.out.println("Alumno 1: suspenso");
        }

        if (nota2 >= 5) {
            System.out.println("Alumno 2: aprobado");
        } else {
            System.out.println("Alumno 2: suspenso");
        }

        if (nota3 >= 5) {
            System.out.println("Alumno 3: aprobado");
        } else {
            System.out.println("Alumno 3: suspenso");
        }
    }
}
