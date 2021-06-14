
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator extends Client {

    public Validator() {

    }

    public Validator(String nci, String nomComplet, String tel, String adresse, String email) {
        super(nci, nomComplet, tel, adresse, email);
    }

    // Creation des methodes validation
    public static boolean isValidName(String nomComplet) {
        String expression = "^[a-zA-Z\\s]*$";
        CharSequence inputStr = nomComplet;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    public static boolean isValidAdresse(String adresse) {
        String expression = "^[a-zA-Z\\s]*$";
        CharSequence inputStr = adresse;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }

    public static boolean isValidPhone(String tel) {
        String expression = "^(\\+221)[  ](70|76|77|78|33)[  ]\\d{3}[  ]?\\d{2}[  ]?\\d{2}$";
        CharSequence inputStr = tel;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();

    }

    public static boolean isValidNci(String nci) {
        String expression = "^[1|2]\\d{3}[  ]?\\d{4}[  ]?\\d{5}$";
        CharSequence inputStr = nci;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return (matcher.matches());
    }

    // Redefinition mehode metier afficher
    public String afficher() {
        return " Email : " + getEmail() + "\n Telephone : " + getTel() + "\n Adresse : " + getAdresse()
                + "\n Nom Complet : " + getNomComplet() + "\n NCI : " + getNci();
    }

}
