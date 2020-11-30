public class TesseraSanitaria {
    private String name;
    private String surname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String birthDate;
    private String birthPlace;
    private String fiscalCode;

    //Constructor

    public TesseraSanitaria (String name, String surname, int birthDay, int birthMonth, int birthYear, String birthDate, String birthPlace, String fiscalCode){
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.fiscalCode = fiscalCode;
    }

    //Getting datas

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getDateOfBirth() {
        return this.birthDate;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public String getFiscalCode(){
        return fiscalCode;
    }


    public void printing(){
        System.out.println("Nome: " + this.name);
        System.out.println("Cognome: " + this.surname);
        System.out.println("Data di nascita: " + this.birthDate);
        System.out.println("Luogo di nascita: " + this.birthPlace);
        System.out.println("Codice fiscale: " + fiscalCode);
    }
}
