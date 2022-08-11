package gopher;
import java.util.UUID;

public class SellerAccount {
    private final UUID id;
    private Double balance;
    private Seller seller;
       
    public SellerAccount() {
        this.balance=0.0;
        
        this.id = UUID.randomUUID();
    }
    
    public double getBalance() {
        return balance;
    }
   
    public UUID getId() {
        return id;
    }   

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    
    public void deposit(double cash) {
        if(cash > 0) {
            this.balance += cash;
        }
    }
    @Override
    public String toString() {
        return this.id + " | " + this.balance + " balance";
    }
}

