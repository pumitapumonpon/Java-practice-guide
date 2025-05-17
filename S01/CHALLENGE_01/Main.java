package S01.CHALLENGE_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient p1 = new Patient();

        System.out.print("Ingrese el nombre del paciente: ");
        p1.name = input.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        p1.age = input.nextInt();
        input.nextLine(); 

        System.out.print("Ingrese el número de expediente: ");
        p1.fileNumber = input.nextLine();

        System.out.println("\n--- Información del Paciente ---");
        p1.showInfo();

        input.close();
    }
}


