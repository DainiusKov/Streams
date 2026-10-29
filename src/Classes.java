import java.util.List;
import java.util.stream.Stream;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student (String name,int age,double grade) {
        this.name=name;this.age=age;this.grade=grade;}

    @Override
    public String toString() {
        return "Student{"+getName()+" "+getAge()+" "+getGrade()+"}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }


    // constructor + getters
}
class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
class Course {
    private String name;
    private int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
}
class Student5 {
    private String name;
    private List<Course> courses;

    public Student5(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }


    public List<Course> getCourses() {
        return this.courses;

    }
}
