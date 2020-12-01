
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Cosa vuoi fare? ( Aggiungi - Elimina - Lista - Vedi - Esci ): ");
        String risposta = reader.nextLine();
        Boolean fine = true;

        while (fine) {

            if (risposta.equals("Esci")) {
                fine = false;
            }

            while (risposta.equals("Aggiungi")) {

                System.out.print("Name: ");
                String name = reader.nextLine();

                System.out.print("Surname: ");
                String surname = reader.nextLine();

                System.out.print("Birth day: ");
                int birthDay = Integer.parseInt(reader.nextLine());

                System.out.print("Birth month: ");
                int birthMonth = Integer.parseInt(reader.nextLine());

                System.out.print("Birth year: ");
                int birthYear = Integer.parseInt(reader.nextLine());

                System.out.print("Birth place: ");
                String birthPlace = reader.nextLine();

                TesseraSanitaria tessera = new TesseraSanitaria(name, surname, birthDay, birthMonth, birthYear, birthPlace);

                tessera.printing();

                System.out.print("Continuare? ( Aggiungi - Elimina - Lista - Vedi - Esci ): ");
                risposta = reader.nextLine();
            }


        }

    }


}
