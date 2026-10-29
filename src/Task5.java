
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        List<Student5> students = List.of(
                new Student5(
                        "Anna",
                        List.of(
                                new Course("Java", 6),
                                new Course("Mathematics", 4),
                                new Course("Physics", 5)
                        )
                ),
                new Student5(
                        "John",
                        List.of(
                                new Course("Java", 6),
                                new Course("Databases", 5)
                        )
                ),
                new Student5(
                        "Maria",
                        List.of(
                                new Course("Java", 6),
                                new Course("Algorithms", 6),
                                new Course("Mathematics", 4)
                        )
                )
        );
        List<String>allnames=students.stream().map(Student5::getName).toList();
        //Map<String,List<Student5>> groups=students.stream().collect(Collectors.groupingBy(Student5::getName));
        Student5 annacourses=students.stream().filter(s->"Anna".equals(s.getName())).findFirst().orElse(null);
        List<Course> subjects=students.stream().map(Student5::getCourses).flatMap(List::stream).toList();
        int totalCredits =
                students.stream()
                        .flatMap(s -> s.getCourses().stream())
                        .mapToInt(Course::getCredits)
                        .sum();



        System.out.println(allnames);
        System.out.println(annacourses.getName()+" "+annacourses.getCourses().stream().map(Course::getName).toList());
        System.out.println(subjects.stream().map(Course::getName).toList());
        System.out.println(subjects.stream().map(Course::getName).distinct().toList());
        System.out.println(totalCredits);
    }
}