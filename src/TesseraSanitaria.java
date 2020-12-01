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

    public TesseraSanitaria (String name, String surname, int birthDay, int birthMonth, int birthYear, String birthPlace){
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.birthDate =  birthDay + "/" + birthMonth + "/" + birthYear ;
        this.birthPlace = birthPlace;
        this.fiscalCode = "" + surname.charAt(0) + surname.charAt(surname.length() / 2 - 1) + surname.charAt(surname.length() - 1) + name.charAt(0) + name.charAt(name.length() / 2 - 1) + name.charAt(name.length() - 1) + birthDay + birthMonth + birthYear + birthPlace.charAt(0) + birthPlace.charAt(1);
    }

    //Getting datas

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getBirthDay() {
        return this.birthDay;
    }

    public int getBirthMonth() {
        return this.birthMonth;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getBirthDate() {
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
        System.out.println("Codice fiscale: " + fiscalCode.toUpperCase());
    }
}
