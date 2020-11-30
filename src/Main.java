import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

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

        String birthDate = birthDay + "/" + birthMonth + "/" + birthYear ;

        System.out.print("Birth place: ");
        String birthPlace = reader.nextLine();

        String fiscalCode = "" + surname.charAt(0) + surname.charAt(surname.length() / 2 - 1) + surname.charAt(surname.length() - 1) + name.charAt(0) + name.charAt(name.length() / 2 - 1) + name.charAt(name.length() - 1) + birthDay + birthMonth + birthYear + birthPlace.charAt(0) + birthPlace.charAt(1);
        fiscalCode = fiscalCode.toUpperCase();

        TesseraSanitaria Bilbo = new TesseraSanitaria(name, surname, birthDay, birthMonth, birthYear, birthDate, birthPlace, fiscalCode);

        Bilbo.printing();
    }
}
