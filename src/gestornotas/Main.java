package gestornotas;

import java.util.ArrayList; // Importación que no se utiliza.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();

        System.out.println("================================");
        System.out.println("       GESTOR DE NOTAS");
        System.out.println("================================");

        System.out.print("Introduce la nota del alumno 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la nota del alumno 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Introduce la nota del alumno 3: ");
        double nota3 = teclado.nextDouble();

        int numeroAlumnos = 3; // Variable declarada que no se utiliza.

        double media = gestor.calcularMedia(nota1, nota2, nota3);
        gestor.mostrarResultado(media);

        teclado.close();
    }
}
