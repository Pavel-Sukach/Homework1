package homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bank {
    private String cardNumber;
    private String cardType;
    private String cardHolderName;
    private Date expDate;
    private int cvvCode;

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

    public void validateCard(Bank obj) {

        class Card_Validator {

            public boolean numValidation() {
                String number = obj.getCardNumber();
                number = number.trim().replaceAll(" ", "");
                int size = number.length();
                if (size != 16) {
                    System.out.println("Card number is invalid: ");
                    return false;
                } else {
                    return true;
                }
            }

            public boolean typeValidation() {
                String type = obj.getCardType();
                type = type.trim().toUpperCase();
                if (type.equals("VISA")) {
                    return true;
                } else if (type.equals("MASTERCARD")) {
                    return true;
                } else {
                    System.out.println("Card type is invalid");
                    return false;
                }
            }

            public boolean nameValidation() {
                String name = obj.getCardHolderName();
                name = name.trim();
                if (name.isBlank()) {
                    System.out.println("You haven't entered your name");
                    return false;
                } else {
                    return true;
                }
            }

            public boolean dateValidation() {
                Date date = obj.getExpDate();
                Date currentDate = new Date();
                SimpleDateFormat sfr = new SimpleDateFormat("dd.mm.yyyy");
                if (date.after(currentDate)) {
                    return true;
                } else {
                    System.out.println("Date is expired");
                    return false;
                }
            }

            public boolean cvvValidation() {
                int cvv = obj.getCvvCode();
                if (cvv > 99 && cvv < 1000) {
                    return true;
                } else {
                    System.out.println("CVV code is invalid");
                    return false;
                }
            }
        }
        Card_Validator cv = new Card_Validator();
        cv.typeValidation();
        cv.typeValidation();
        cv.nameValidation();
        cv.dateValidation();
        cv.cvvValidation();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card number: ");
        bank.setCardNumber(sc.nextLine());

        System.out.println("Enter the type of your card: ");
        bank.setCardType(sc.nextLine());

        System.out.println("Enter the name of the card owner: ");
        bank.setCardHolderName(sc.nextLine());

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
        bank.setExpDate(date);

        System.out.println("Enter a CVV number: ");
        bank.setCvvCode(sc.nextInt());
        bank.validateCard(bank);
    }
}
