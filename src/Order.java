public class Order {
    Item item1,item2;

    public Order(Item i1,Item i2){
        this.item1 = i1;
        this.item2 = i2;
    }

    Double getOrderAmount(String itemCode,int itemCount){
        if(item1.ItemCode.equals(itemCode)){
            return item1.getUnitPrice()*itemCount;
        }else{
            return item2.getUnitPrice()*itemCount;
        }
    }
}
