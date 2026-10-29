import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {


    public static void main(String[] args){
        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1200),
                new Product("Mouse", "Electronics", 25),
                new Product("Keyboard", "Electronics", 70),
                new Product("Desk", "Furniture", 350),
                new Product("Chair", "Furniture", 180),
                new Product("Book", "Education", 30),
                new Product("Monitor", "Electronics", 400)
        );
        Map<String,List<Product>>grouped=products.stream().collect(Collectors.groupingBy(Product::getCategory));
        Map<String,Long>counts=products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
        Map<String, Double>average=products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));


    System.out.println(grouped);
    System.out.println(counts);
    System.out.println(average);
    }
}
