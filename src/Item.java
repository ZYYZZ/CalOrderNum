public class Item {
    String ItemCode;
    String ItemName;
    Double UnitPrice;

    public Item(){
    }

    public Item(String ItemCode,String ItemName,Double UnitPrice){
        this.ItemCode = ItemCode;
        this.ItemName = ItemName;
        this.UnitPrice = UnitPrice;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }
}
