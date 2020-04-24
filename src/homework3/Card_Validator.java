package homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Card_Validator {
    private String cardNumber;
    private String cardType;
    private String cardHolderName;
    private Date expDate;
    private int cvvCode;

    public Card_Validator(String cardNumber, String cardType, String cardHolderName, Date expDate, int ccvCode) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
        this.expDate = expDate;
        this.cvvCode = ccvCode;
    }
    public Card_Validator(){
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getCvvCode() {
        return cvvCode;
    }
    public void setCvvCode(int ccvCode) {
        this.cvvCode = ccvCode;
    }

    public boolean numValidation(Card_Validator obj){
        String number = obj.getCardNumber();
        number = number.trim().replaceAll(" ","");
        int size = number.length();
        if(size != 16){
            System.out.println("Card number is invalid: ");
            System.exit(0);
            return false;
        }
        else {
            return true;
        }
    }
    public boolean typeValidation(Card_Validator obj){
        String type = obj.getCardType();
        type = type.trim().toUpperCase();
        if(type.equals("VISA")){
            return true;
        }
        else if(type.equals("MASTERCARD")){
            return true;
        }
        else {
            System.out.println("Card type is invalid");
            System.exit(0);
            return false;
        }
    }
    public boolean nameValidation(Card_Validator obj){
        String name = obj.getCardHolderName();
        name = name.trim();
        if(name.isBlank()){
            System.out.println("You haven't entered your name");
            System.exit(0);
            return false;
        }
        else {
            return true;
        }
    }
    public boolean dateValidation(Card_Validator obj){
        Date date = obj.getExpDate();
        Date currentDate = new Date();
        SimpleDateFormat sfr = new SimpleDateFormat("dd.mm.yyyy");
        if(date.after(currentDate)){
            return true;
        }
        else{
            System.out.println("Date is expired");
            System.exit(0);
            return false;
        }
    }
    public boolean cvvValidation(Card_Validator obj){
        int cvv = obj.getCvvCode();
        if(cvv > 99 && cvv < 1000){
            return true;
        }
        else {
            System.out.println("CVV code is invalid");
            System.exit(0);
            return false;
        }
    }

    public static void main(String[] args) {
        Card_Validator cv = new Card_Validator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card number: ");
        cv.setCardNumber(sc.nextLine());
        cv.numValidation(cv);

        System.out.println("Enter the type of your card: ");
        cv.setCardType(sc.nextLine());
        cv.typeValidation(cv);

        System.out.println("Enter the name of the card owner: ");
        cv.setCardHolderName(sc.nextLine());
        cv.nameValidation(cv);

        System.out.println("Enter the expiration date of the card in format dd.mm.yyyy: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        String stringDate = sc.nextLine();
        Date date = null;
        try{
            date = sdf.parse(stringDate);
        }
        catch (ParseException ex){
            System.out.println("You've entered invalid date. Check the format of the date!");
        }
        cv.setExpDate(date);
        cv.dateValidation(cv);

        System.out.println("Enter a CVV number: ");
        cv.setCvvCode(sc.nextInt());
        cv.cvvValidation(cv);

        System.out.println("Entered Card Data is Valid");
    }
}
