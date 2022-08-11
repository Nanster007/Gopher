package gopher;
import static gopher.randomNumber.getRandomNumber;


public class Gopher {
    Items [] items;
    Seller []sellers;
    Customer customers[];
    SellerAccount sellerAccounts[];
   
    public Gopher(){
        sellers= new Seller[6];
        customers= new Customer[6];
        sellerAccounts=new SellerAccount[6];
        items= new Items[50];
       
    }
    
    public void start(){
        createAccountForAllSeller();
        createAccountForAllCustomer();
        itemStorage();
        createItemStorageForSeller();
    }
    public void createAccountForAllCustomer(){
        for(Integer i=0;i<(customers.length-1);i++){
            Customer customer;
            customer = new Customer();
            customer.setFirstName("Nirajan");
            customer.setLastName("Acharya"+i);
            customer.setEmail("nacharya0"+i+"@student.ysu.edu");
            customer.setHomeAddress("22"+i+" Madison");
            customer.setCardNumber("111111111"+i);
            customer.setCvvNumber("56"+i);
            customer.setPassword("hello"+i);
            customer.setZipCode("4450"+i);
            customer.setExpiryDate("04/05/202"+i);
            customer.setTotalBalance(500);
            customers[i]=customer;
        }
    }
   
    public void createAccountForAllSeller(){
        for(Integer i=0;i<sellers.length-1;i++){
            Seller seller= new Seller("Nirajan","Acharya"+i,"Gopher"+i,
            "nirajan.nra"+i+"@gmail.com","helloworld");
            createSellerAccount(seller);
            sellers[i]=seller;
        }
    }
 
    public SellerAccount createSellerAccount(Seller seller){
        SellerAccount sellerAccount= new SellerAccount();
        sellerAccount.setSeller(seller);
        return sellerAccount;
       
    }
    public void createItemStorageForSeller(){
        for(Integer i=0;i<sellers.length;i++){
            Items item= new Items();
            item.setSeller(sellers[i]);
            items[i]=item;
        }
    }
    
    public void itemStorage(){
        Seller seller1=sellers[0];
        seller1.setItemName("Jeans",0);
        seller1.setItemName("Pants",1);
        seller1.setItemName("Shirt",2);
        seller1.setItemName("North Face Jacket",3);
        seller1.setItemBrandName("H and M ");
        seller1.setItemPrice(100,0);
        seller1.setItemPrice(500,1);
        seller1.setItemPrice(450,2);
        seller1.setItemPrice(680,3);
        for(Integer i=0;i<4;i++){
        seller1.setDiscount(14+i,i);
        }
        seller1.setFeatures("This jeans is 3 feet long with blue color. It feels"
        + "comfortable when you wear it.We aim to show you accurate product "+
        "information. Manufacturers, suppliers and others provide what you see "
        +"here, and we have not verified it. See our disclaimer \n" +
        "Meet your new favorite jeans. The regular fit through the seat and "+
        "thigh is modern and hip, but these jeans are all Wrangler. That means "
        +"outstanding comfort and durability so renowned they come with a 1-year guarantee. ",0);
        seller1.setFeatures("This is a 100% cotton "
        + "material from the depths of india." + "The smooth cotton feel makes "
        + "the pant very comfortable and it is very "+"durable",1);
        seller1.setFeatures("This"
        + " an original Silk shirt from the country" +" of Dubai.",2);
        seller1.setFeatures(" This gives nice feeling when you wear it. It is the best option for "
        + "winter season.The kind of the material which it has been made from "
        + "allows you to be safe from dreadful winter temperature",3);
        
        Seller seller2=sellers[1];
        seller2.setItemName("mac book air",0);
        seller2.setItemName("Dell I7 generation",1);
        seller2.setItemName("HP I8 generation 16 GB Ram",2);
        seller2.setItemName("Acer",3);
        seller2.setItemName("Samsung S10 plus",4);
        seller2.setItemName("Google pixel 3",5);
        seller2.setItemName(" Iphone XS Max",6);
        for(Integer i=0;i<7;i++){
        seller2.setItemPrice(getRandomNumber(400,100),i);
        seller2.setDiscount(150+i,i);
        }
        seller2.setFeatures("Mac book air is really sophisticated laptop. It has"
        + "the ram of 16 GB with I7 generation.The most loved Mac is about to "
        + "make you fall in love all over again. Available in silver, "
        + "space gray, and gold, the new thinner and lighter MacBook Air"
        + " features a brilliant Retina display, Touch ID, the "
        + "latest-generation keyboard, and a Force Touch trackpad. "
        + "The iconic wedge is created from 100 percent recycled "
        + "aluminum, making it the greenest Mac ever.1 And with all-day "
        + "battery life, MacBook Air is your perfectly portable, "
        + "do-it-all notebook.",0);

        seller1.setItemBrandName("Gopher Company");
        
        Seller seller3= sellers[3];
        seller3.setItemName("925 Sterling silver chain 18 inch",0);
        seller3.setItemName( "10 K 16 inch gold rope chain ",1);
        seller3.setItemName("0.25 DM braclet 6mm",2);
        seller3.setItemName("Michael Kros Diamond watch",3);
        seller3.setItemBrandName("Solid Gold");
        seller3.setItemPrice(100,0);
        seller3.setItemPrice(500,1);
        seller3.setItemPrice(450,2);
        seller3.setItemPrice(680,3);
        for(Integer j=0;j<4;j++){
        seller3.setDiscount(20+j,j);
        }
   }
   
    public void printCustomerName(){
        for(Seller seller:sellers)
        System.out.println("Seller Name " + seller.toString());
    }
    public SellerAccount[] getAccount(Seller seller){
        Integer index=0;
        SellerAccount []tempSellerAccounts= new SellerAccount[sellers.length];
        for(SellerAccount sellersAcc:this.sellerAccounts){
            if(sellersAcc.getSeller().equals(seller)){
                tempSellerAccounts[index++]=sellersAcc;
            }
            
        }
        return tempSellerAccounts;
    }
    public Seller[] getSellers(){
        return this.sellers;
    }
    public void setSellers(Seller [] sellers){
        this.sellers=sellers;
    }
    public Seller getSeller(Integer index){
        return this.sellers[index];
    }
    public Items getItems(Integer index){
        return this.items[index];
    }
    
    public Customer[] getCustomers(){
        return customers;
    }
    public void setCustomers(Customer [] customers){
        this.customers=customers;
    }
    public Customer getSingleCustomer(Integer index){
        return this.customers[index];
    }
  
   }
  
