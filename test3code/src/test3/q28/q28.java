package test3.q28;


import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

class Item{
    private String name;
    private String category;
    private double price;
    public Item(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }
                                                                                                                                                                public String getName() {return name;}public void setName(String name) {this.name = name;}public String getCategory() {return category;}public void setCategory(String category) {this.category = category;}public double getPrice() {return price;}public void setPrice(double price) {this.price = price;}
    //accessors not shown
}

public class q28 {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Pen", "Stationery", 3.0),
                new Item("Pencil", "Stationery", 2.0),
                new Item("Eraser", "Stationery", 1.0),
                new Item("Milk", "Food", 2.0),
                new Item("Eggs", "Food", 3.0)
        );
        ToDoubleFunction<Item> priceF = Item::getPrice; //1
        items.stream()
                .collect(Collectors.groupingBy(Item::getCategory)) //2
                .forEach((a, b) -> {
                    double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
                    System.out.println(a + " : " + av);
                });
    }
}

/*      What will the code print?
        Select 1 option:
   !A. Stationery : 2.0
       Food: 2.5
    B. [Pen:3.0, Pencil :2.0, Eraser :1.0] :2.0
       [Milk :2.0, Eggs :3.0] :2.5
    C. Pen :3.0, Pencil :2.0, Eraser :1.0 :2.0
       Milk:2.0, Eggs :3.0 :2.5
    D. Stationery : [Pen:3.0, Pencil :2.0, Eraser :1.0] :2.0
       Food: [Milk: 2.0, Eggs :3.0] :2.5
    E. Compilation error due to code at //1
    F. Compilation error due to code at //2
    G. Compilation error due to code at //3
*/
