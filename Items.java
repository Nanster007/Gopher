package gopher;

public class Items {
    private String[] itemName;
    private String itemBrandName;
    private Integer[] itemPrice;
    private Integer[] Discount;
    private Seller seller;
    private String [] Features;
    private String [] selectedItems;

    public Items(){
        this.itemName= new String[50];
        this.Discount= new Integer [50];
        this.itemPrice= new Integer[50];
        this.Features= new String[50];
        selectedItems= new String[50];
    }
   
    public String[] getItemName() {
        return itemName;
    }
    public String getSingleItem(Integer index){
        return this.itemName[index];
    }

    public void setItemName(String itemName,Integer index) {
        this.itemName[index]=itemName;
    }

    public String getItemBrandName() {
        return itemBrandName;
    }

    public void setItemBrandName(String itemBrandName) {
        this.itemBrandName = itemBrandName;
    }

    public Integer[] getItemPrice() {
        return itemPrice;
    }
    public Integer getSinglePrice(Integer index){
        return this.itemPrice[index];
    }
    public void setItemPrice(Integer itemPrice,Integer index) {
        this.itemPrice[index]=itemPrice;
    }

    public Integer[] getDiscount() {
        return Discount;
    }

    public void setDiscount(Integer Discount,Integer index) {
        this.Discount[index] = Discount;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String[] getFeatures() {
        return this.Features;
    }
    public String getSingleFeature(Integer index){
        return this.Features[index];
    }
    public void setFeatures(String Features,Integer index) {
        this.Features[index] = Features;
    }
     public String[] getSelectedItems() {
        return selectedItems;
    }
    public String getSingleSelectedItem(Integer index){
        return this.selectedItems[index];
    }

    public void setSelectedItems(String selectedItems,Integer index) {
        this.selectedItems [index]= selectedItems;
    }

  
}
