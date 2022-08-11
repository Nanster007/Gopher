package gopher;
import java.util.UUID;

public class Customer extends customerCard {
    private String firstName;
    private String lastName;
    private UUID accountId;
    private String password;
    private String email;
    private String homeAddress;
    private String zipCode;
    private Integer selectedTotalPrice=0;
    private String [] selectedCustomerItems;
    private Integer priceAfterDiscount;
    Integer totalBalance;
    private Integer remainingBalance;
    
  
    public Customer() {
        this.accountId= UUID.randomUUID();
        selectedCustomerItems= new String[50];
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public UUID getAccountID(){
        return this.accountId;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getSelectedTotalPrice() {
        return this.selectedTotalPrice;
    }
    public void makeSelectedToNull(Integer value){
        this.selectedTotalPrice=value;
    }
    public void setSelectedTotalPrice(Integer selectedPrice) {
        this.selectedTotalPrice += selectedPrice;
    }

   
    public String[] getSelectedCustomerItems() {
        return selectedCustomerItems;
    }

    public void setSelectedCustomerItems(String selectedCustomerItems,Integer index) {
        this.selectedCustomerItems[index]=selectedCustomerItems;
    }

    public void setPriceAfterDiscount(Integer Discount) {
        this.priceAfterDiscount =this.selectedTotalPrice- Discount;
      
    }
    public void setPriceAfterDiscountForNoSelection(Integer value){
        this.priceAfterDiscount=value;
    }
    public Integer getPriceAfterDiscount(){
       return this.priceAfterDiscount;
    }
   
    public Integer getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Integer totalBalance) {
        this.totalBalance = totalBalance;
    }
    public void setRemainingBalance(){
        this.remainingBalance= this.totalBalance-this.priceAfterDiscount;
    }
    public Integer getRemainingBalance(){
        return this.remainingBalance;
    }
}
