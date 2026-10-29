import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3{
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

    List<Product>morethan100=products.stream().filter(p->p.getPrice()>100).toList();
    List<Product>electronics=products.stream().filter(p->p.getCategory()=="Electronics").toList();
    List<String>names=products.stream().map(Product::getName).toList();
    List<Product>sortedbyprice=products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
    Product max=products.stream().max(Comparator.comparing(Product::getPrice)).orElseThrow();
    Double average=products.stream().mapToDouble(Product::getPrice).average().orElse(0);




    System.out.println("All products above 100 euros: "+morethan100);
    System.out.println("Electronics products "+electronics);
    System.out.println("Names of products: "+names);
    System.out.println("Sorted by price: "+sortedbyprice);
    System.out.println("The most expensive product is "+max);
    System.out.printf("Average price: %.2f euros%n",average);
}
}