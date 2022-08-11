package gopher;

public class customerCard {
    private String cardNumber;
    private String cvvNumber;
    private String firstName;
    private String LastName;
    private String dateOfBirth;
    private String expiryDate;
    private Integer index;
    
    
    public customerCard(){
        this.firstName=" ";
        this.LastName="";
        this.cvvNumber="00000000";
        this.cardNumber="0000000";
        this.expiryDate="00/00/0000";
        this.dateOfBirth="00/00/0000";
        }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber=cardNumber;
    }
    public String getCvvNumber() {
        return cvvNumber;
    }
    public void setCvvNumber(String cvvNumber){
        this.cvvNumber=cvvNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate){
        this.expiryDate=expiryDate;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
  
}
