import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Anna", 20, 8.5),
                new Student("John", 22, 6.7),
                new Student("Peter", 19, 9.1),
                new Student("Maria", 21, 7.8),
                new Student("James", 23, 5.9),
                new Student("Laura", 20, 9.4)
        );
        List<Student> allstudents = students.stream()
                .collect(Collectors.toList());

        List<Student> greatequal8 = students.stream()
                .filter(s -> s.getGrade() >= 8)
                .toList();

        List<String> names = students.stream()
                .map(Student::getName)
                .toList();

        List<Student> sorterbyg = students.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .toList();

        List<Student> sorterdescend = sorterbyg.stream()
                .sorted(Comparator.comparing(Student::getGrade)
                        .reversed())
                .toList();

        Student best = students.stream()
                .max(Comparator.comparing(Student::getGrade))
                .orElseThrow();

        long countofhighest = students.stream()
                .filter(s -> s.getGrade() >= 8)
                .count();

        System.out.println(allstudents);
        System.out.println("Students with a grade equal to or greater than 8: " + greatequal8);
        System.out.println("Student names: " + names);
        System.out.println("Sorted by grade: " + sorterbyg);
        System.out.println("Sorted by grade descending " + sorterdescend);
        System.out.println("Best student: " + best);
        System.out.println("There are " + countofhighest + " " + "students with grade greater or equal to 8");
    }
}