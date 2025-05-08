import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        int asistencias = 0;
        double sumaNotas = 0;
        double promedio = 0;
        double notaBaja = 0;
        double puntosExtra = 0;
        double notaFinal= 0;

        System.out.println("Ingrese la nota de la primera materia:");
        nota1 = input.nextDouble();

        System.out.println("Ingrese la nota de la segunda materia:");
        nota2 = input.nextDouble();

        System.out.println("Ingrese la nota de la tercera materia:");
        nota3 = input.nextDouble();

        System.out.println("Ingrese la cantidad total de asistencias:");
        asistencias = input.nextInt();

        sumaNotas = nota1 + nota2 + nota3;

        promedio = sumaNotas / 3;

        if (nota1 <= nota2 && nota1 <= nota3) {
            notaBaja = nota1;
        } else if (nota2 <= nota1 && nota2 <= nota3) {
            notaBaja = nota2;
        } else {
            notaBaja = nota3;
        }

        puntosExtra = asistencias / 5;

        notaFinal = promedio + puntosExtra;

        if (notaFinal > 5) {
            notaFinal = 5;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total de notas: " + sumaNotas);
        System.out.println("Promedio general: " + promedio);
        System.out.println("Nota más baja: " + notaBaja);
        System.out.println("Puntos adicionales por asistencia: " + puntosExtra);
        System.out.println("Nota final con puntos extra: " + notaFinal);

        if (notaFinal >= 4.5) {
            System.out.println("Eres elegible para la beca.");
        } else {
            System.out.println("No eres elegible para la beca.");
        }


    }
}