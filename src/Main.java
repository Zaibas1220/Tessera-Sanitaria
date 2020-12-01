import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<TesseraSanitaria> tessere = new ArrayList<TesseraSanitaria>();

        while (true) {

            System.out.print("Cosa vuoi fare? (Aggiungi - Lista - Cerca - Elimina - Esci): ");
            String risposta = reader.nextLine();

            switch (risposta) {
                case "Esci":
                    return;
                case "Aggiungi":
                    tessere.add(aggiungi());
                    break;
                case "Lista":
                    lista(tessere);
                    break;
                case "Cerca":
                    cerca(tessere);
                    break;
                case "Elimina":
                    rimuovi(tessere);
                    break;
                default:
                    System.out.print("Comando non esistente!");
            }
        }


    }

    public static TesseraSanitaria aggiungi () {
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

        System.out.print("Birth place: ");
        String birthPlace = reader.nextLine();

        TesseraSanitaria tessera = new TesseraSanitaria(name, surname, birthDay, birthMonth, birthYear, birthPlace);

        return tessera;
    }

    public static ArrayList<TesseraSanitaria> rimuovi (ArrayList<TesseraSanitaria> tessere) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        for (TesseraSanitaria tessera : tessere){
            count++;
            System.out.println("Tessera numero" + count + ":");
            tessera.printing();
        }

        System.out.print("Quale tessera vuoi rimuovere?: ");
        int risposta = Integer.parseInt(reader.nextLine());

        if (risposta > tessere.size()){
            System.out.println("Tessera inesistente!");
            return tessere;
        }

        tessere.remove(risposta - 1);

        return tessere;
    }

    public static void lista (ArrayList<TesseraSanitaria> tessere) {
        int count = 0;
        for (TesseraSanitaria tessera : tessere){
            count++;
            System.out.println("\n\nTessera numero " + count + ":");
            tessera.printing();
            System.out.println("\n");
        }
    }

    public static void cerca (ArrayList<TesseraSanitaria> tessere) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Come vuoi cercare? (Exit per uscire) (Nome - Cognome - Giorno - Mese - Anno - Data di nascità - Luogo di nascità - Codice fiscale): ");

            String risposta = reader.nextLine();

            switch (risposta) {

                case "Nome":
                    System.out.print("Scrivi il nome: ");
                    String nome = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (nome.equals(tessera.getName())){
                            tessera.printing();
                        }
                    }
                    break;
                case "Cognome":
                    System.out.print("Scrivi il cognome: ");
                    String cognome = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (cognome.equals(tessera.getSurname())){
                            tessera.printing();
                        }
                    }
                    break;
                case "Giorno":
                    System.out.print("Scrivi il giorno: ");
                    int giorno = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (giorno == tessera.getBirthDay()){
                            tessera.printing();
                        }
                    }
                    break;
                case "Mese":
                    System.out.print("Scrivi il mese: ");
                    int mese = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (mese == tessera.getBirthMonth()){
                            tessera.printing();
                        }
                    }
                    break;
                case "Anno":
                    System.out.print("Scrivi l'anno: ");
                    int anno = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (anno == tessera.getBirthYear()){
                            tessera.printing();
                        }
                    }
                    break;
                case "Data di nascità":
                    System.out.print("Scrivi la data di nascità (GG/MM/AAAA): ");
                    String data = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (data.equals(tessera.getBirthDate())){
                            tessera.printing();
                        }
                    }
                    break;
                case "Luogo di nascità":
                    System.out.print("Scrivi il luogo di nascità: ");
                    String luogo = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (luogo.equals(tessera.getBirthPlace())){
                            tessera.printing();
                        }
                    }
                    break;
                case "Codice fiscale":
                    System.out.print("Scrivi il codice fiscale: ");
                    String codice = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (codice.equals(tessera.getFiscalCode())){
                            tessera.printing();
                        }
                    }
                    break;
                case "Esci":
                    return;
                default:
                    System.out.println("Non esiste questo comando!");
            }
        }
    }

}
