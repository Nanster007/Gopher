package gopher;
import java.util.Date;
import java.util.UUID;

public class Seller extends Items {
    private String sellerEmail;
    private String sellerPassword;
    private String sellerFirstName;
    private String sellerLastName;
    private String sellerCompanyName;
    private Date soldDateCreated; 
    private Integer sellerPhoneNumber;
    private Double sellerBalance;
    private final UUID sellerID;
   
    public Seller(String sellerFirstName, String sellerLastName, 
    String sellerCompanyName, String sellerEmail, String sellerPassword){
        this.sellerID = UUID.randomUUID();
        this.sellerFirstName = sellerFirstName;
        this.sellerLastName = sellerLastName;
        this.sellerEmail = sellerEmail;
        this.sellerPassword = sellerPassword;
        this.sellerBalance = 0.0;
    }

    public String getSellerFirstName() {
        return sellerFirstName;
    }
    
    public void setSellerFirstName(String sellerFirstName) {
        this.sellerFirstName = sellerFirstName;
    }

    public String getSellerLastName() {
        return sellerLastName;
    }

    public void setSellerLastName(String sellerLastName) {
        this.sellerLastName = sellerLastName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }

    public void setSoldDateCreated(Date soldDateCreated) {

        this.soldDateCreated = soldDateCreated;
    }

    public double getSellerBalance() {
        return sellerBalance;
    }

    public Double getTotalIncomeOfSeller(Double purchaseMadeByCustomer) {
        this.sellerBalance += purchaseMadeByCustomer;
        return sellerBalance;
    }

    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
    }

    public Integer getSellerPhoneNumber() {
        return sellerPhoneNumber;
    }

    public void setSellerPhoneNumber(Integer sellerPhoneNumber) {
        this.sellerPhoneNumber = sellerPhoneNumber;
    }
    
}
