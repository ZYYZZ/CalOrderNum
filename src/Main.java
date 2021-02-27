import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String input = new Scanner(System.in).nextLine();
        String itemCode;
        int Count;
        String[] strs = input.split(",");
        itemCode = strs[0];
        Count = Integer.parseInt(strs[1]);
        Item i1 = new Item("C_101","HUAWEI Mate30 Pro",5000.00);
        Item i2 = new Item("C_102","XIAOMI 10 Pro",4699.00);

        Order od = new Order(i1,i2);
        od.getOrderAmount(itemCode,Count);
        System.out.println(od.getOrderAmount(itemCode,Count));
    }
}
