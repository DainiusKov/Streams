import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

public static void main(String[] args) {
    List<Integer> numbers = List.of(
            12, 5, 8, 21, 30, 7, 44, 13, 18, 2, 15//15 added for comparison
    );
        List<Integer> result = numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        List<Integer> result1= numbers.stream()
                .filter(n->n>15)
                .collect(Collectors.toList());
        List<Integer> result3= numbers.stream()
                .filter(n->n>15)
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        long count= numbers.stream()
                .filter(n->n>=15)
                .filter(n->n%2==0)
                .count();
}

}
