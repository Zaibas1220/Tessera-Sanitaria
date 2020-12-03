import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<TesseraSanitaria> tessere = new ArrayList<>();

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.print("Cosa vuoi fare? (Aggiungi - Lista - Cerca - Elimina - Esci): ");
            String risposta = reader.nextLine();

            switch (risposta.toLowerCase()) {
                case "esci":
                    return;
                case "aggiungi":
                    aggiungi();
                    break;
                case "lista":
                    lista();
                    break;
                case "cerca":
                    cerca();
                    break;
                case "elimina":
                    rimuovi();
                    break;
                default:
                    System.out.print("Comando non esistente!");
            }
        }


    }

    public static void aggiungi () {
        Scanner reader = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = reader.nextLine();

        System.out.print("Cognome: ");
        String surname = reader.nextLine();

        System.out.print("Giorno di nascità: ");
        int birthDay = Integer.parseInt(reader.nextLine());

        System.out.print("Mese di nascità: ");
        int birthMonth = Integer.parseInt(reader.nextLine());

        System.out.print("Anno di nascità: ");
        int birthYear = Integer.parseInt(reader.nextLine());

        System.out.print("Luogo di nascità: ");
        String birthPlace = reader.nextLine();

        TesseraSanitaria tessera = new TesseraSanitaria(name, surname, birthDay, birthMonth, birthYear, birthPlace);

        tessere.add(tessera);
    }

    public static ArrayList<TesseraSanitaria> rimuovi () {
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

    public static void lista () {
        int count = 0;
        for (TesseraSanitaria tessera : tessere){
            count++;
            System.out.println("\n\nTessera numero " + count + ":");
            tessera.printing();
            System.out.println("\n");
        }
    }

    public static void cerca () {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Come vuoi cercare? (Exit per uscire) (Nome - Cognome - Giorno - Mese - Anno - Data di nascità - Luogo di nascità - Codice fiscale): ");

            String risposta = reader.nextLine();

            switch (risposta.toLowerCase()) {

                case "esci":
                    return;
                case "nome":
                    System.out.print("Scrivi il nome: ");
                    String nome = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (nome.equals(tessera.getName())){
                            tessera.printing();
                        }
                    }
                    break;
                case "cognome":
                    System.out.print("Scrivi il cognome: ");
                    String cognome = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (cognome.equals(tessera.getSurname())){
                            tessera.printing();
                        }
                    }
                    break;
                case "giorno":
                    System.out.print("Scrivi il giorno: ");
                    int giorno = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (giorno == tessera.getBirthDay()){
                            tessera.printing();
                        }
                    }
                    break;
                case "mese":
                    System.out.print("Scrivi il mese: ");
                    int mese = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (mese == tessera.getBirthMonth()){
                            tessera.printing();
                        }
                    }
                    break;
                case "anno":
                    System.out.print("Scrivi l'anno: ");
                    int anno = Integer.parseInt(reader.nextLine());
                    for (TesseraSanitaria tessera : tessere){
                        if (anno == tessera.getBirthYear()){
                            tessera.printing();
                        }
                    }
                    break;
                case "data di nascità":
                    System.out.print("Scrivi la data di nascità (GG/MM/AAAA): ");
                    String data = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (data.equals(tessera.getBirthDate())){
                            tessera.printing();
                        }
                    }
                    break;
                case "luogo di nascità":
                    System.out.print("Scrivi il luogo di nascità: ");
                    String luogo = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (luogo.equals(tessera.getBirthPlace())){
                            tessera.printing();
                        }
                    }
                    break;
                case "codice fiscale":
                    System.out.print("Scrivi il codice fiscale: ");
                    String codice = reader.nextLine();
                    for (TesseraSanitaria tessera : tessere){
                        if (codice.equals(tessera.getFiscalCode())){
                            tessera.printing();
                        }
                    }
                    break;
                default:
                    System.out.println("Non esiste questo comando!");
            }
        }
    }

}
